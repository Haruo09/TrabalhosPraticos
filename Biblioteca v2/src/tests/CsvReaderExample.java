package tests;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CsvReaderExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo de Leitura de CSV");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTable table = new JTable();

        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);

        // Leitura do arquivo CSV
        try (BufferedReader reader = new BufferedReader(new FileReader("./src/tests/dados.csv"))) {
            String line;
            StringBuilder data = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                data.append(line).append("\n");
            }

            // Criando um modelo de tabela e populando com os dados lidos do CSV
            String[] columnNames = {"Nome", "Sobrenome", "Idade"};
            String[][] rowData = parseCsvData(data.toString());
            System.out.println(Arrays.deepToString(rowData));

            DefaultTableModel tableModel = new DefaultTableModel(rowData, columnNames);
            table.setModel(tableModel);

        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    private static String[][] parseCsvData(String csvData) {
        String[] lines = csvData.split("\n");
        String[][] data = new String[lines.length][];

        for (int i = 0; i < lines.length; i++) {
            data[i] = lines[i].split(",");
        }

        return data;
    }
}