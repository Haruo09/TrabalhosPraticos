package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    // Definindo os Labels:
    JLabel lblNome = new JLabel("Nome:");
    JLabel lblDataNasc = new JLabel("Data de Nascimento:");
    JLabel lblCurso = new JLabel("Curso:");
    JLabel lblSerie = new JLabel("Série:");
    JLabel lblSatisfacao = new JLabel("Satisfação:");

    // Definindo os TextFields:
    JTextField txtNome = new JTextField();
    JTextField txtDataNasc = new JTextField();

    // Criando a ComboBox:
    JComboBox<String> cmbCurso = new JComboBox<>(new String[]{
        "Informática",
        "Agroindústria",
        "Eletrotécnica",
        "Química",
        "Agricultura"
    });

    // Definindo os RadioButtons:
    JRadioButton rbtnSerie1 = new JRadioButton("1°");
    JRadioButton rbtnSerie2 = new JRadioButton("2°");
    JRadioButton rbtnSerie3 = new JRadioButton("3°");

    // Criando um novo Button Group:
    ButtonGroup btnGroup = new ButtonGroup();

    // Definindo o Slider:
    JSlider sldSatisfacao = new JSlider(JSlider.HORIZONTAL, 0, 100, 1);

    // Definindo os labels finais:
    JLabel lblInputedName = new JLabel();
    JLabel lblInputedDate = new JLabel();
    JLabel lblInputedCurse = new JLabel();
    JLabel lblInputedSerie = new JLabel();
    JLabel lblInputedSatisfaction = new JLabel();

    // Construtor:
    public Window(String title) throws HeadlessException {
        // PRESETS:
        super(title);
        this.setSize(750, 600);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adicionando os elementos:
        addLabels();
        addTextFields();
        addComboBoxes();
        addButtons();
        addSlider();
    }

    // Método para iniciar a janela:
    public void run() {
        // Abrindo a janela (tornando-a visível):
        this.setVisible(true);
    }


    public void addTextFields() {
        // Posicionando os TextFields:
        txtNome.setBounds(10, 30, 300, 20);
        txtDataNasc.setBounds(320, 30, 150, 20);

        // Adicionando os elementos à janela:
        this.add(txtNome);
        this.add(txtDataNasc);

    }

    public void addLabels() {
        // Posicionando os Labels:
        lblNome.setBounds(10, 10, 300, 20);
        lblDataNasc.setBounds(320, 10, 150, 20);
        lblCurso.setBounds(10, 50, 150, 20);
        lblSerie.setBounds(170, 50, 150, 20);
        lblSatisfacao.setBounds(320, 50, 100, 20);

        // Posicionando os Labels de input:
        lblInputedName.setBounds(10, 120, 300, 20);
        lblInputedDate.setBounds(10, 150, 300, 20);
        lblInputedCurse.setBounds(10, 180, 300, 20);
        lblInputedSerie.setBounds(10, 210, 300, 20);
        lblInputedSatisfaction.setBounds(10, 240, 300, 20);

        // Adicionando os Labels à Janela:
        this.add(lblNome);
        this.add(lblDataNasc);
        this.add(lblCurso);
        this.add(lblSerie);
        this.add(lblSatisfacao);

        // Adicionando os outros labels à janela:
        this.add(lblInputedName);
        this.add(lblInputedDate);
        this.add(lblInputedCurse);
        this.add(lblInputedSerie);
        this.add(lblInputedSatisfaction);
    }

    public void addComboBoxes() {
        // Posicionando a ComboBox:
        cmbCurso.setBounds(10, 70, 150, 20);

        // Definindo valores padrão:
        cmbCurso.setSelectedItem(null);

        // Adicionando a ComboBox à janela:
        this.add(cmbCurso);
    }

    public void addButtons() {
        // Adicionando os botões ao grupo:
        btnGroup.add(rbtnSerie1);
        btnGroup.add(rbtnSerie2);
        btnGroup.add(rbtnSerie3);

        // Posicionando os RadioButtons:
        rbtnSerie1.setBounds(170, 70, 40, 20);
        rbtnSerie2.setBounds(210, 70, 40, 20);
        rbtnSerie3.setBounds(250, 70, 40, 20);

        // Adicionando os RadioButtons à janela:
        this.add(rbtnSerie1);
        this.add(rbtnSerie2);
        this.add(rbtnSerie3);

        // Definindo o Button Enviar:
        JButton btnEnviar = new JButton("Enviar");

        // Posicionando o Botão:
        btnEnviar.setBounds(368, 100, 100, 20);

        // Programando o botão:
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Adquirindo os valores dos campos de entrada:
                String nome = txtNome.getText();
                String dataNasc = txtDataNasc.getText();
                String curso = (String) cmbCurso.getSelectedItem();
                int serie = (rbtnSerie1.isSelected())?1:
                    (rbtnSerie2.isSelected())?2:
                    (rbtnSerie3.isSelected())?3:0;
                int satisfacao = sldSatisfacao.getValue();

                // Imprimindo os resultados na tela:a
                if (nome.equals("")) {
                    lblInputedName.setText("Erro: nome não informado.");
                    lblInputedName.setForeground(Color.decode("#940b01"));
                } else {
                    lblInputedName.setText("Nome: " + nome);
                    lblInputedName.setForeground(Color.black);
                }

                if (dataNasc.equals("")) {
                    lblInputedDate.setText("Erro: data de nascimento não informada.");
                    lblInputedDate.setForeground(Color.decode("#940b01"));
                } else {
                    lblInputedDate.setText("Data de nascimento: " + dataNasc);
                    lblInputedDate.setForeground(Color.black);
                }

                if (curso == null) {
                    lblInputedCurse.setText("Erro: curso não selecionado.");
                    lblInputedCurse.setForeground(Color.decode("#940b01"));
                } else {
                    lblInputedCurse.setText("Curso: " + curso);
                    lblInputedCurse.setForeground(Color.black);
                }

                if (serie == 0) {
                    lblInputedSerie.setText("Erro: Série não selecionada.");
                    lblInputedSerie.setForeground(Color.decode("#940b01"));
                } else {
                    lblInputedSerie.setText("Série: " + Integer.toString(serie) + "º ano");
                    lblInputedSerie.setForeground(Color.black);
                }

                lblInputedSatisfaction.setText("Satisfação: " + Integer.toString(satisfacao));

            }
        });

        // Adicionando o Botão:
        this.add(btnEnviar);
    }

    public void addSlider() {
        // Posicionando o Slider:
        sldSatisfacao.setBounds(315, 70, 150, 20);

        // Adicionando o Slider:
        this.add(sldSatisfacao);
    }
}