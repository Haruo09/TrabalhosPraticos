package app.frontend.windows;

import app.backend.CsvReader;
import app.frontend.MainPane;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;

public class UsersListWindow extends JFrame {
    private final JTable table = new JTable();
    private final MainPane mainPane;

    public UsersListWindow(MainPane mainPane) {
        super("Lista de Usuários");
        this.mainPane = mainPane;
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JScrollPane scrollPane = new JScrollPane(table);
        this.getContentPane().add(scrollPane);
        this.setSize(500, 700);
    }

    public void updateTableValues() {
        // Leitura do arquivo CSV
        try {
            String data = CsvReader.getCsvFileData("./src/data/userData.csv");
            String[] columnNames = {"Nome", "Data de Nascimento", "CPF", "Senha"};
            String[][] rowData = CsvReader.parseCsvData(data);

            DefaultTableModel tableModel = new DefaultTableModel(rowData, columnNames);
            table.setModel(tableModel);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public JTable getTable() {
        return table;
    }

    public MainPane getMainPanel() {
        return mainPane;
    }
}
