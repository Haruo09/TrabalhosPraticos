package app.backend;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWritter {
    public static void createCsvFile(String path) throws IOException {
        if (!CsvReader.tryReadCsvFile(path)) {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        }
    }
}
