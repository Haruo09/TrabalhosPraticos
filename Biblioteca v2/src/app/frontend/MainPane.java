package app.frontend;

import app.frontend.windows.BookCadWindow;
import app.frontend.windows.BooksListWindow;
import app.frontend.windows.UserCadWindow;
import app.frontend.windows.UsersListWindow;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.HashMap;

public class MainPane extends JFrame {
    // 1 Elementos da tela:
    private final JLabel lblTitle = new JLabel("Biblioteca");
    private final Map<String, JLabel> labelMap = new HashMap<>();
    private final Map<String, JButton> buttonMap = new HashMap<>();
//    Map<String, JFrame> frameMap = new HashMap<>();
    UsersListWindow usersListWindow = new UsersListWindow(this);
    UserCadWindow userCadWindow = new UserCadWindow(this);
    BookCadWindow bookCadWindow = new BookCadWindow(this);
    BooksListWindow booksListWindow = new BooksListWindow(this);

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
    }

    // 3 Construtor
    public MainPane() {
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
            userCadWindow.setVisible(true);
        });

        buttonMap.get("btnCadBook").addActionListener(e -> {
            bookCadWindow.setVisible(true);
        });

        buttonMap.get("btnListPeople").addActionListener(e -> {
            usersListWindow.setVisible(true);
            usersListWindow.updateTableValues();
        });

        buttonMap.get("btnListBooks").addActionListener(e -> {
            booksListWindow.setVisible(true);
            booksListWindow.updateTableValues();
        });

        // Adicionando os elementos à tela:
        this.add(lblTitle);
        for (JButton button : buttonMap.values()) this.add(button);
    }

    public JLabel getLblTitle() {
        return lblTitle;
    }

    public Map<String, JLabel> getLabelMap() {
        return labelMap;
    }

    public Map<String, JButton> getButtonMap() {
        return buttonMap;
    }
}
