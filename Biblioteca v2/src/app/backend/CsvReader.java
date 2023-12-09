package app.backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {
    public static String getCsvFileData(String path) throws IOException {
        if (CsvWriter.createCsvFile(path)) {
            System.out.println("Arquivo criado com sucesso!");
        }
        StringBuilder data = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data.toString();
    }

    public static String[][] parseCsvData(String csvData) {
        String[] lines = csvData.split("\n");
        String[][] data = new String[lines.length][];

        for (int i = 0; i < lines.length; i++) {
            data[i] = lines[i].split(",");
        }

        return data;
    }
}
