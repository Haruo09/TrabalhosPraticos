package app;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Formulario {
    public static void main(String[] args) {
        // Presets da janela:
        JFrame janela = new JFrame("Biblioteca");
        JPanel panel = new JPanel();
        janela.setSize(1000,1000);
        panel.setLayout(null);
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.getContentPane().setBackground(Color.decode("#24094f"));

        // Presets dos itens:
        UIManager.put("Label.font", Font.decode("Inter Thin 13"));
        UIManager.put("TextField.border", null);
        UIManager.put("TextField.background", Color.decode("#D9D9D9"));
        UIManager.put("TextArea.background", Color.decode("#D9D9D9"));
        UIManager.put("RadioButton.border", null);
        UIManager.put("RadioButton.font", Font.decode("Inter Thin 12"));

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
        JButton btnCadastrar = new JButton("Cadastrar");
        JButton btnLimpar = new JButton("Limpar");
        JButton btnCancelar = new JButton("Cancelar");

        // ButtonGroups:
        ButtonGroup btnGroupData = new ButtonGroup();
        btnGroupData.add(rbtnNenhum);
        btnGroupData.add(rbtnPeriodo);

        ButtonGroup btnGroupSituacao = new ButtonGroup();
        btnGroupSituacao.add(rbtnEmprestimo);
        btnGroupSituacao.add(rbtnOutro);

        // Definindo o estilo dos botões:
        btnCadastrar.setBackground(Color.decode("#6D9F2D"));
        btnLimpar.setBackground(Color.decode("#54C8ED"));
        btnCancelar.setBackground(Color.decode("#D24A4A"));

        btnCadastrar.setBorder(null);
        btnLimpar.setBorder(null);
        btnCancelar.setBorder(null);

        // TextArea:
        JTextArea txtLivros = new JTextArea();
        txtLivros.setBorder(null);

        // Posicionando os Labels:
        lblNome.setBounds(48, 66, 502, 20);
        lblContato.setBounds(48, 129, 156, 20);
        lblData.setBounds(223, 129, 122, 20);
        lblCPF.setBounds(363, 129, 187, 20);
        lblEmail.setBounds(48, 192, 502, 20);
        lblSitua.setBounds(289, 255, 168, 20);
        lblDevolu.setBounds(48, 255, 222, 20);
        lblLivros.setBounds(48, 361, 501, 20);

        // Posicionando os TextFields:
        txtNome.setBounds(48,86,503, 25);
        txtContato.setBounds(48,149,156,25);
        txtData.setBounds(223,149,122,25);
        txtCPF.setBounds(362,149,189,25);
        txtEmail.setBounds(48, 212, 502, 25);
        txtDevolu.setBounds(48,318,222,25);
        txtLivros.setBounds(48,381,501,150);
        txtOutros.setBounds(373,318,178,25);

        // Posicionando os RadioButtons:
        rbtnNenhum.setBounds(48,290,96+12,12);
        rbtnPeriodo.setBounds(156,290,102+12,12);
        rbtnEmprestimo.setBounds(289,294,173+12,12);
        rbtnOutro.setBounds(289,325,70+12,12);

        // Posicionando os Botões:
        btnCadastrar.setBounds(195,628,99,38);
        btnLimpar.setBounds(325,628,95,38);
        btnCancelar.setBounds(455, 628, 95, 38);

        // Criando a CheckBox:
        JCheckBox ckbTermosECondicoes = new JCheckBox("Aceito os Termos e Condições");
        ckbTermosECondicoes.setBounds(48, 567, 200, 25);
        ckbTermosECondicoes.setFont(Font.decode("Inter Thin 13"));

        // Configurando os botões:
        btnCadastrar.addActionListener(e -> {
            if (!ckbTermosECondicoes.isSelected()) {
                JOptionPane.showMessageDialog(janela, "Termos e Condições não aceitos: não foi possível salvar.");
            } else if (
                    txtNome.getText().equals("") ||
                    txtContato.getText().equals("") ||
                    txtData.getText().equals("") ||
                    txtCPF.getText().equals("") ||
                    txtEmail.getText().equals("") ||
                    txtLivros.getText().equals("") ||
                    btnGroupData.getSelection() == null ||
                    btnGroupSituacao.getSelection() == null
            ) {
                JOptionPane.showMessageDialog(janela, "Campos não completamente preenchidos.");
            } else {
                JOptionPane.showMessageDialog(janela, String.format(
                        """
                        CADASTRO REALIZADO COM SUCESSO!
                        
                        Nome: %s
                        Contato: %s
                        Data: %s
                        CPF: %s
                        Email: %s
                        Data de devolução: %s
                        Situação: %s
                        
                        Livros emprestados:
                        """,
                        txtNome.getText(),
                        txtContato.getText(),
                        txtData.getText(),
                        txtCPF.getText(),
                        txtEmail.getText(),
                        (rbtnNenhum.isSelected())?"Sem devolução":txtDevolu.getText(),
                        (rbtnEmprestimo.isSelected())?"Emprestado":txtOutros.getText()
                ) + txtLivros.getText());
            }
        });

        btnLimpar.addActionListener(e -> {
            txtNome.setText(null);
            txtContato.setText(null);
            txtData.setText(null);
            txtCPF.setText(null);
            txtEmail.setText(null);
            btnGroupData.clearSelection();
            btnGroupSituacao.clearSelection();
            txtLivros.setText(null);
            ckbTermosECondicoes.setSelected(false);
        });

        btnCancelar.addActionListener(e -> {
            int escolha = JOptionPane
                    .showConfirmDialog(
                            janela,
                            "Deseja cancelar a operação?",
                            "Confirmação", JOptionPane.OK_CANCEL_OPTION
                    );
            if (escolha == JOptionPane.OK_OPTION) {
                janela.dispose();
            }
        });

        // Adicionando os Labels:
        panel.add(lblNome);
        panel.add(lblContato);
        panel.add(lblData);
        panel.add(lblCPF);
        panel.add(lblLivro);
        panel.add(lblEmail);
        panel.add(lblSitua);
        panel.add(lblDevolu);
        panel.add(lblLivros);

        // Adicionando os Text Fields:
        panel.add(txtNome);
        panel.add(txtContato);
        panel.add(txtData);
        panel.add(txtCPF);
        panel.add(txtLivro);
        panel.add(txtEmail);
        panel.add(txtDevolu);
        panel.add(txtLivros);
        panel.add(txtOutros);

        // Adicionando os RadioButtons:
        panel.add(rbtnNenhum);
        panel.add(rbtnPeriodo);
        panel.add(rbtnEmprestimo);
        panel.add(rbtnOutro);

        // Adicionando a CheckBox:
        panel.add(ckbTermosECondicoes);

        // Adicionando os Buttons:
        panel.add(btnCadastrar);
        panel.add(btnLimpar);
        panel.add(btnCancelar);

        // Tornando a janela visível:
        panel.setBounds(200, 150, 600, 700);
        panel.setVisible(true);
        janela.add(panel);
        janela.setVisible(true);
    }
}
