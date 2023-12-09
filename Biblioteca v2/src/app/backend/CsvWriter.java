package app.backend;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter {
    public static boolean createCsvFile(String path) throws IOException {
        File file = new File(path);
        if (!file.getParentFile().exists()) {
            boolean result = file.getParentFile().mkdirs();
        } return file.createNewFile();
    }

    public static void writeCsvData(String csvData, String path) throws IOException {
        CsvWriter.createCsvFile(path);
        File file = new File(path);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(csvData);
            System.out.println("Dados escritos com sucesso!");
        } catch (IOException | Error e) {
            e.printStackTrace();
        }
    }
}
