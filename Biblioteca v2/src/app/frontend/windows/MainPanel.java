package app.frontend.windows;

import app.frontend.styles.RoundedButton;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.HashMap;

public class MainPanel extends JFrame {
    // 1 Elementos da tela:
    JLabel lblTitle = new JLabel("Biblioteca");
    Map<String, JLabel> labelMap = new HashMap<>();
    Map<String, JButton> buttonMap = new HashMap<>();
    Map<String, JFrame> frameMap = new HashMap<>();

    // 2 Bloco de Inicialização
    {
        // 2.1 Presets iniciais:
        UIManager.put("Button.background", new Color(104, 196, 225));
        UIManager.put("Label.font", "Inter Regular 15");
        UIManager.put("Button.font", "Inter Regular 15");
        UIManager.put("ImageIcon.size", 50);

        // 2.2 Criando os JLabels:
        labelMap.put("icoButtonUser", new JLabel(new ImageIcon("../images/person-icon.png")));
        labelMap.put("icoButtonList", new JLabel(new ImageIcon("../images/list-icon.png")));
        labelMap.put("icoButtonBook", new JLabel(new ImageIcon("../images/book-icon.png")));
        labelMap.put("icoButtoBookcase", new JLabel(new ImageIcon("../images/bookcase-icon.png")));

        // 2.3 Criando os JButtons:
        buttonMap.put("btnCadUser", new JButton("Cadastrar Usuário"));
        buttonMap.put("btnListPeople", new JButton("Listar Usuários"));
        buttonMap.put("btnCadBook", new JButton("Cadastrar Livro"));
        buttonMap.put("btnListBooks", new JButton("Listar Livros"));

        // 2.4 Interligando os JFrames:
        frameMap.put("frameCadUsuario", new CadUsuario());
        frameMap.put("frameCadLivro", new CadLivro());
    }

    // 3 Construtor
    public MainPanel() {
        this.setSize(500, 700);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Ajustando o estilo do título:
        lblTitle.setFont(Font.decode("Inter Regular 25"));
        lblTitle.setHorizontalAlignment(0);

        // Posicionando os elementos:
        lblTitle.setBounds(0,105,500,50);
        buttonMap.get("btnCadUser").setBounds(80, 200, 320, 60);
        buttonMap.get("btnListPeople").setBounds(80, 280, 320, 60);
        buttonMap.get("btnCadBook").setBounds(80, 360, 320, 60);
        buttonMap.get("btnListBooks").setBounds(80, 440, 320, 60);

        // Adicionando funções aos botões:
        buttonMap.get("btnCadUser").addActionListener(e -> {
            this.frameMap.get("frameCadUsuario").setVisible(true);
        });

        buttonMap.get("btnCadBook").addActionListener(e -> {
            this.frameMap.get("frameCadLivro").setVisible(true);
        });

        // Adicionando os elementos à tela:
        this.add(lblTitle);
        for (JButton button : buttonMap.values()) this.add(button);
    }
}
