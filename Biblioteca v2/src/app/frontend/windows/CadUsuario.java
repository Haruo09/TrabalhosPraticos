package app.frontend.windows;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CadUsuario extends JFrame {
    // 1 Componentes da tela:
    // 1.1 Labels:
    private final Map<String, JLabel> labelMap = new HashMap<>();
    // 1.2 TextFields:
    private final Map<String, JTextField> textFieldMap = new HashMap<>();
    // 1.3 Botões:
    private final Map<String, JButton> buttonMap = new HashMap<>();

    // 2 Bloco de inicialização:
    {
        // 2.5 Adicionando estilos gerais aos elementos:
        UIManager.put("Label.font", "Inter Regular 15");
        UIManager.put("TextField.font", "Inter Regular 15");
        UIManager.put("Button.font", "Inter Regular 15");
        UIManager.put("Button.border", null);

        // 2.1 Criando os Labels:
        labelMap.put("lblTitulo", new JLabel("Cadastro Biblioteca"));
        labelMap.put("lblNome", new JLabel("Nome:"));
        labelMap.put("lblDataNasc", new JLabel("Data de Nascimento:"));
        labelMap.put("lblCPF", new JLabel("CPF:"));
        labelMap.put("lblSenha", new JLabel("Senha"));

        // 2.2 Criando os TextFields:.
        textFieldMap.put("txtNome", new JTextField());
        textFieldMap.put("txtDataNasc", new JTextField());
        textFieldMap.put("txtCPF", new JTextField());
        textFieldMap.put("txtSenha", new JTextField());

        // 2.3 Criando os botões:
        buttonMap.put("btnCadastrar", new JButton("Cadastrar"));
        buttonMap.put("btnLimpar", new JButton("Limpar"));
        buttonMap.put("btnCancelar", new JButton("Cancelar"));

        // 2.4 Adicionando funções lambda aos botões:
        buttonMap.get("btnCadastrar").addActionListener((e) -> {
            // Aqui, o botão deverá salvar as informações num arquivo CSV.
        });

        buttonMap.get("btnLimpar").addActionListener((e) -> {
            for (JTextField field : textFieldMap.values()) {
                field.setText("");
            }
        });

        buttonMap.get("btnCancelar").addActionListener((e) -> {
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
    public CadUsuario() {
        // 3.1 Prests básicos:
        super();
//        this.setTitle("Cadastro de Usuários");
        this.setSize(500, 700);
//        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);

        // 3.2 Posicionando os elementos:
        this.labelMap.get("lblTitulo").setBounds(0, 40, 480, 50);
        this.labelMap.get("lblNome").setBounds(40, 100, 400, 30);
        this.labelMap.get("lblDataNasc").setBounds(40, 180, 400, 30);
        this.labelMap.get("lblCPF").setBounds(40, 260, 400, 30);
        this.labelMap.get("lblSenha").setBounds(40, 340, 400, 30);

        this.textFieldMap.get("txtNome").setBounds(40, 130, 400, 40);
        this.textFieldMap.get("txtDataNasc").setBounds(40, 210, 400, 40);
        this.textFieldMap.get("txtCPF").setBounds(40, 290, 400, 40);
        this.textFieldMap.get("txtSenha").setBounds(40, 370, 400, 40);

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
        for (JLabel label : labelMap.values()) { this.add(label); }
        for (JTextField field : textFieldMap.values()) { this.add(field); }
        for (JButton button : buttonMap.values()) { this.add(button); }
    }

    // Getters:
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
