package biblioteca.app;

import javax.swing.*;
import java.awt.*;

public class  Formulario {
    public static void main(String[] args) {
        // Presets:
        JFrame janela = new JFrame("Biblioteca");
        janela.setSize(600,700);
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.getContentPane().setBackground(Color.CYAN);

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
        JTextField txtSitua = new JTextField();
        JTextField txtDevolu = new JTextField();
        JTextField txtOutros = new JTextField();

        //Radio
        JRadioButton rbtnNenhum = new JRadioButton();
        JRadioButton rbtnPeriodo = new JRadioButton();
        JRadioButton rbtnEmprestimo = new JRadioButton();
        JRadioButton rbtnOutro = new JRadioButton();

        JButton btnSalvar = new JButton("Salvar");
        JButton btnCancelar = new JButton("cancelar");

        JTextArea txtLivros = new JTextArea();

        lblNome.setBounds(48, 86, 502, 25);
        lblContato.setBounds(48, 149, 156, 25);
        lblData.setBounds(223, 149, 122, 25);
        lblCPF.setBounds(363, 149, 187, 25);
        lblLivro.setBounds(48, 212, 222, 25);
        lblEmail.setBounds(289, 212, 261, 25);
        lblSitua.setBounds(373, 323, 67, 15);
        lblDevolu.setBounds(48, 318, 222, 25);
        lblLivros.setBounds(49, 381, 501, 150);

        txtNome.setBounds(48,66, 502, 20);
        txtContato.setBounds(48,129, 156, 20);
        txtData.setBounds(223,129, 122, 20);
        txtCPF.setBounds(363,129, 187, 20);
        txtLivro.setBounds(48,192, 222, 20);
        txtEmail.setBounds(289,192, 261, 20);
        txtSitua.setBounds(289,255, 168, 20);
        txtDevolu.setBounds(48,222, 255, 20);
        txtLivros.setBounds(49,361, 501, 20);
        txtOutros.setBounds(308,321,168,20);

        rbtnNenhum.setBounds(48,290,12,12);
        rbtnPeriodo.setBounds(156,290,12,12);
        rbtnEmprestimo.setBounds(289,294,12,12);
        rbtnOutro.setBounds(291,325,12,12);

        btnSalvar.setBounds(325,584,99,38);
        btnCancelar.setBounds(455,584,95,38);

        janela.add(lblNome);
        janela.add(lblContato);
        janela.add(lblData);
        janela.add(lblCPF);
        janela.add(lblLivro);
        janela.add(lblEmail);
        janela.add(lblSitua);
        janela.add(lblDevolu);
        janela.add(lblLivros);


        janela.add(txtNome);
        janela.add(txtContato);
        janela.add(txtData);
        janela.add(txtCPF);
        janela.add(txtLivro);
        janela.add(txtEmail);
        janela.add(txtSitua);
        janela.add(txtDevolu);
        janela.add(txtLivros);
        janela.add(txtOutros);


        janela.add(rbtnNenhum);
        janela.add(rbtnPeriodo);
        janela.add(rbtnEmprestimo);
        janela.add(rbtnOutro);


        janela.add(btnSalvar);
        janela.add(btnCancelar);

        janela.setVisible(true);
    }
}
