package biblioteca.app;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Formulario {
    public static void main(String[] args) {
        // Presets da janela:
        JFrame janela = new JFrame("Biblioteca");
        janela.setSize(600,700);
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.getContentPane().setBackground(Color.black);

        // Presets dos itens:
        UIManager.put("Label.foreground", Color.white);
        UIManager.put("Label.font", Font.decode("Inter Thin 13"));
        UIManager.put("TextField.background", Color.decode("#D9D9D9"));
        UIManager.put("TextArea.background", Color.decode("#D9D9D9"));
        UIManager.put("RadioButton.background", Color.black);
        UIManager.put("RadioButton.foreground", Color.white);
        UIManager.put("RadioButton.border", null);
        UIManager.put("RadioButton.font", Font.decode("Inter Thin 12"));
        UIManager.put("Button.foreground", Color.white);

        // Labels:
        JLabel lblNome = new JLabel("Nome:");
        JLabel lblContato = new JLabel("Contato:");
        JLabel lblData = new JLabel("Data:");
        JLabel lblCPF = new JLabel("CPF:");
        JLabel lblLivro = new JLabel("Código do livro:");
        JLabel lblEmail = new JLabel("E-mail:");
        JLabel lblSitua = new JLabel("Situação");
        JLabel lblDevolu = new JLabel("Data de devolução");
        JLabel lblLivros = new JLabel("Livros emprestados:");

        // TextField
        JTextField txtNome = new JTextField();
        JTextField txtContato = new JTextField();
        JTextField txtData= new JTextField();
        JTextField txtCPF = new JTextField();
        JTextField txtLivro = new JTextField();
        JTextField txtEmail = new JTextField();
        JTextField txtDevolu = new JTextField();
        JTextField txtOutros = new JTextField();

        // Resetando todas as bordas na mão, porque o UIManager nn funciona:
        txtNome.setBorder(null);
        txtContato.setBorder(null);
        txtData.setBorder(null);
        txtCPF.setBorder(null);
        txtLivro.setBorder(null);
        txtEmail.setBorder(null);
        txtDevolu.setBorder(null);
        txtOutros.setBorder(null);

        // RadioButtons:
        JRadioButton rbtnNenhum = new JRadioButton("Nenhum(a)");
        JRadioButton rbtnPeriodo = new JRadioButton("Período");
        JRadioButton rbtnEmprestimo = new JRadioButton("Emprestado");
        JRadioButton rbtnOutro = new JRadioButton("Outros");

        // Buttons:
        JButton btnSalvar = new JButton("Salvar");
        JButton btnCancelar = new JButton("Cancelar");

        // ButtonGroups:
        ButtonGroup btnGroupData = new ButtonGroup();
        btnGroupData.add(rbtnNenhum);
        btnGroupData.add(rbtnPeriodo);

        ButtonGroup btnGroupSituacao = new ButtonGroup();
        btnGroupSituacao.add(rbtnEmprestimo);
        btnGroupSituacao.add(rbtnOutro);

        // Definindo o estilo dos botões:
        btnSalvar.setBackground(Color.decode("#6D9F2D"));
        btnCancelar.setBackground(Color.decode("#D24A4A"));
        btnSalvar.setBorder(null);
        btnCancelar.setBorder(null);

        // TextArea:
        JTextArea txtLivros = new JTextArea();
        txtLivros.setBorder(null);

        // Posicionando os Labels:
        lblNome.setBounds(48, 66, 502, 20);
        lblContato.setBounds(48, 129, 156, 20);
        lblData.setBounds(223, 129, 122, 20);
        lblCPF.setBounds(363, 129, 187, 20);
        lblLivro.setBounds(48, 192, 222, 20);
        lblEmail.setBounds(289, 192, 261, 20);
        lblSitua.setBounds(289, 255, 168, 20);
        lblDevolu.setBounds(48, 255, 222, 20);
        lblLivros.setBounds(48, 361, 501, 20);

        // Posicionando os TextFields:
        txtNome.setBounds(48,86,503, 25);
        txtContato.setBounds(48,149,156,25);
        txtData.setBounds(223,149,122,25);
        txtCPF.setBounds(362,149,189,25);
        txtLivro.setBounds(48,212,222,25);
        txtEmail.setBounds(290,212,261,25);
        txtDevolu.setBounds(48,318,222,25);
        txtLivros.setBounds(48,381,501,150);
        txtOutros.setBounds(373,318,178,25);

        // Posicionando os RadioButtons:
        rbtnNenhum.setBounds(48,290,96+12,12);
        rbtnPeriodo.setBounds(156,290,102+12,12);
        rbtnEmprestimo.setBounds(289,294,173+12,12);
        rbtnOutro.setBounds(289,325,70+12,12);

        // Posicionando os Botões:
        btnSalvar.setBounds(325,584,99,38);
        btnCancelar.setBounds(455,584,95,38);


        // Adicionando os Labels:
        janela.add(lblNome);
        janela.add(lblContato);
        janela.add(lblData);
        janela.add(lblCPF);
        janela.add(lblLivro);
        janela.add(lblEmail);
        janela.add(lblSitua);
        janela.add(lblDevolu);
        janela.add(lblLivros);

        // Adicionando os Text Fields:
        janela.add(txtNome);
        janela.add(txtContato);
        janela.add(txtData);
        janela.add(txtCPF);
        janela.add(txtLivro);
        janela.add(txtEmail);
        janela.add(txtDevolu);
        janela.add(txtLivros);
        janela.add(txtOutros);

        // Adicionando os RadioButtons:
        janela.add(rbtnNenhum);
        janela.add(rbtnPeriodo);
        janela.add(rbtnEmprestimo);
        janela.add(rbtnOutro);

        // Adicionando os Buttons:
        janela.add(btnSalvar);
        janela.add(btnCancelar);

        // Tornando a janela visível:
        janela.setVisible(true);
    }
}
