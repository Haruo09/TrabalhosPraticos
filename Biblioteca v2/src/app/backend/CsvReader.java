package app.backend;

import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {
    public static boolean tryReadCsvFile(String path) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(path));
        } catch (IOException e) {
            return false;
        } return true;
    }

    public static String[][] getCsvFileData(String path) throws IOException {
        if (!tryReadCsvFile(path)) {
            CsvWritter.createCsvFile(path);
        }
        StringBuilder data = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("dados.csv"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                data.append(line).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return parseCsvData(data.toString());
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
