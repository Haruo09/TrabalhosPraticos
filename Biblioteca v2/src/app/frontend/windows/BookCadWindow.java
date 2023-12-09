package app.frontend.windows;

import app.backend.CsvWriter;
import app.backend.FieldReader;
import app.frontend.MainPane;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookCadWindow extends JFrame {
    // 1 Componentes da tela:
    // 1.1 Labels:
    private final Map<String, JLabel> labelMap = new HashMap<>();
    // 1.2 TextFields:
    private final Map<String, JTextField> textFieldMap = new HashMap<>();
    // 1.3 Botões:
    private final Map<String, JButton> buttonMap = new HashMap<>();
    private final MainPane mainPane;

    // 2 Bloco de inicialização:
    {
        // 2.5 Adicionando estilos gerais aos elementos:
        UIManager.put("Label.font", "Inter Regular 15");
        UIManager.put("TextField.font", "Inter Regular 15");
        UIManager.put("Button.font", "Inter Regular 15");
        UIManager.put("Button.border", null);

        // 2.1 Criando os Labels:
        labelMap.put("lblTitulo", new JLabel("Cadastro Biblioteca"));
        labelMap.put("lblID", new JLabel("ID:"));
        labelMap.put("lblNomeLivro", new JLabel("Nome do livro:"));
        labelMap.put("lblDataPubl", new JLabel("Data de Publicação:"));
        labelMap.put("lblAutor", new JLabel("Autor:"));

        // 2.2 Criando os TextFields:
        textFieldMap.put("txtID", new JTextField());
        textFieldMap.put("txtNomeLivro", new JTextField());
        textFieldMap.put("txtDataPubl", new JTextField());
        textFieldMap.put("txtAutor", new JTextField());

        // 2.3 Criando os botões:
        buttonMap.put("btnCadastrar", new JButton("Cadastrar"));
        buttonMap.put("btnLimpar", new JButton("Limpar"));
        buttonMap.put("btnCancelar", new JButton("Cancelar"));

        // 2.4 Adicionando funções lambda aos botões:
        buttonMap.get("btnCadastrar").addActionListener(e -> {
            // Aqui, o botão deverá salvar as informações num arquivo CSV.
            StringBuilder data = new StringBuilder();
            List<String> txtFieldsValues = FieldReader.readTextFields(this);
            for (String txtField : txtFieldsValues) {
                if (txtField.isBlank() || txtField.isEmpty()) {
                    JOptionPane.showMessageDialog(
                        this,
                        "Preencha todos os campos antes de cadastrar."
                    ); break;
                }
                data.append(txtField).append(",");
            }

            try {
                if (data.charAt(0) == '#') {
                    data.deleteCharAt(0);
                }
                if (data.toString().split(",").length == txtFieldsValues.size()) {
                    data.deleteCharAt(data.length() - 1);
                    data.append("\n");
                    System.out.println(data.toString());
                    CsvWriter.writeCsvData(data.toString(), "./src/data/bookData.csv");
                }
            } catch (IOException | StringIndexOutOfBoundsException exception) {
                exception.printStackTrace();
            }
        });

        buttonMap.get("btnLimpar").addActionListener(e -> {
            for (JTextField field : textFieldMap.values()) {
                field.setText("");
            }
        });

        buttonMap.get("btnCancelar").addActionListener(e -> {
            int escolha = JOptionPane
                .showConfirmDialog(
                    this,
                    "Deseja cancelar a operação?",
                    "Confirmação",
                    JOptionPane.OK_CANCEL_OPTION
                );
            if (escolha == JOptionPane.OK_OPTION) this.dispose();
        });
    }

    // 3 Construtor
    public BookCadWindow(MainPane mainPane) {
        // 3.1 Prests básicos:
        super("Cadastro de Livros");
        this.mainPane = mainPane;
        this.setTitle("Cadastro de Livros");
        this.setSize(500, 700);
        this.setDefaultCloseOperation(super.DISPOSE_ON_CLOSE);
        this.setLayout(null);

        // 3.2 Posicionando os elementos:
        this.labelMap.get("lblTitulo").setBounds(0, 40, 480, 50);
        this.labelMap.get("lblID").setBounds(40, 100, 400, 30);
        this.labelMap.get("lblNomeLivro").setBounds(40, 180, 400, 30);
        this.labelMap.get("lblDataPubl").setBounds(40, 260, 400, 30);
        this.labelMap.get("lblAutor").setBounds(40, 340, 400, 30);

        this.textFieldMap.get("txtID").setBounds(40, 130, 400, 40);
        this.textFieldMap.get("txtNomeLivro").setBounds(40, 210, 400, 40);
        this.textFieldMap.get("txtDataPubl").setBounds(40, 290, 400, 40);
        this.textFieldMap.get("txtAutor").setBounds(40, 370, 400, 40);

        this.buttonMap.get("btnCadastrar").setBounds(40, 430, 400, 45);
        this.buttonMap.get("btnLimpar").setBounds(40 ,490, 400, 45);
        this.buttonMap.get("btnCancelar").setBounds(40, 550, 400, 45);
        this.buttonMap.get("btnCancelar").setBorder(null);
        this.buttonMap.get("btnLimpar").setBorder(null);
        this.buttonMap.get("btnCadastrar").setBorder(null);

        // 3.3 Definindo estilos específicos:
        this.labelMap.get("lblTitulo").setHorizontalAlignment(0);
        this.labelMap.get("lblTitulo").setFont(Font.decode("Inter Regular 25"));
        this.buttonMap.get("btnCadastrar").setBackground(new Color(0, 171, 243));
        this.buttonMap.get("btnLimpar").setBackground(new Color(145, 221, 251));
        this.buttonMap.get("btnCancelar").setBackground(new Color(251, 78, 66));
    
        // 3.4 Adicionando os elementos à janela:
        for (JLabel label : labelMap.values()) this.add(label);
        for (JTextField field : textFieldMap.values()) this.add(field);
        for (JButton button : buttonMap.values()) this.add(button);
    }

    public Map<String, JLabel> getLabelMap() {
        return labelMap;
    }

    public Map<String, JTextField> getTextFieldMap() {
        return textFieldMap;
    }

    public Map<String, JButton> getButtonMap() {
        return buttonMap;
    }
}
