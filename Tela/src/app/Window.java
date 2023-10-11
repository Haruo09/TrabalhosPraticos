package app;

import javax.swing.*;
import java.awt.*;

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

    // Definindo o Slider:
    JSlider sldSatisfacao = new JSlider(JSlider.HORIZONTAL, 0, 100, 1);

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

        // Adicionando os elementos à Janela:
        this.add(lblNome);
        this.add(lblDataNasc);
        this.add(lblCurso);
        this.add(lblSerie);
        this.add(lblSatisfacao);
    }

    public void addComboBoxes() {
        // Posicionando a ComboBox:
        cmbCurso.setBounds(10, 70, 150, 20);

        // Definindo seu valor padrão:
        cmbCurso.setSelectedItem(null);

        // Adicionando a ComboBox à janela:
        this.add(cmbCurso);
    }

    public void addButtons() {
        // Criando um novo Button Group:
        ButtonGroup btnGroup = new ButtonGroup();

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

        // Adicionando o Botão:
        this.add(btnEnviar);
    }

    public void addSlider() {
        sldSatisfacao.setBounds(315, 70, 150, 20);
        this.add(sldSatisfacao);
    }

    public void addResults() {
        // Adquirindo os valores dos campos de entrada:
        String nome = txtNome.getText();
        String dataNasc = txtNome.getText();
        String curso = (String) cmbCurso.getSelectedItem();
    }
}