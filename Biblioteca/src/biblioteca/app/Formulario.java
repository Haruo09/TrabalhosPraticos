package biblioteca.app;

import javax.swing.*;
import java.awt.*;

public class Formulario {
    public static void main(String[] args) {
        // Presets:
        JFrame janela = new JFrame("Biblioteca");
        janela.setSize(600,700);
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.getContentPane().setBackground(Color.BLACK);

        // Labels:
        JLabel lblNome = new JLabel("Nome:");
        JLabel lblContato = new JLabel("Contato:");
        JLabel lblData = new JLabel("Data:");
        JLabel lblCPF = new JLabel("CPF:");
        JLabel lblLrivo = new JLabel("Código do livro:");
        JLabel lblEmail = new JLabel("E-mail:");
        JLabel lblSitua = new JLabel("Situação");
        JLabel lblDevolu = new JLabel("Data de devolução");
        JLabel lblLivros = new JLabel("Livros emprestados:");


        JTextField txtNome = new JTextField();
        JTextField txtContato = new JTextField();
        JTextField txtData= new JTextField();
        JTextField txtCPF = new JTextField();
        JTextField txtLivro = new JTextField();
        JTextField txtEmail = new JTextField();
        JTextField txtSItua = new JTextField();
        JTextField txtDevolu = new JTextField();
        JTextField txtOutros = new JTextField();

        JRadioButton rbtnNenhum = new JRadioButton();
        JRadioButton rbtnPeriodo = new JRadioButton();
        JRadioButton rbtnEmprestimo = new JRadioButton();
        JRadioButton rbtnOutro = new JRadioButton();

        JButton btnSalvar = new JButton("Salvar");
        JButton btnCancelar = new JButton("cancelar");

        JTextArea txtLIvros = new JTextArea();

        lblNome.setBounds(48, 66, 502, 20);
        lblContato.setBounds(48, 149, 156, 25);
        lblData.setBounds(223, 149, 122, 25);
        lblCPF.setBounds(363, 149, 187, 25);
        lblLrivo.setBounds(48, 212, 222, 25);
        lblEmail.setBounds(289, 212, 260, 25);
        lblSitua.setBounds(48, 318, 220, 25);
        lblDevolu.setBounds(48, 66, 502, 20);
        lblLivros.setBounds(48, 381, 501, 150);

        janela.setVisible(true);
    }
}
