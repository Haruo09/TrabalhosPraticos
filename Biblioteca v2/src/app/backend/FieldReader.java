package app.backend;

import app.frontend.windows.BookCadWindow;
import app.frontend.windows.UserCadWindow;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class FieldReader {
    public static List<String> readTextFields(UserCadWindow userCadWindowFrame) {
        List<String> fieldValues = new ArrayList<>();
        fieldValues.add(userCadWindowFrame
            .getTextFieldMap()
            .get("txtNome")
            .getText()
        );
        fieldValues.add(userCadWindowFrame
            .getTextFieldMap()
            .get("txtDataNasc")
            .getText()
        );
        fieldValues.add(userCadWindowFrame
            .getTextFieldMap()
            .get("txtCPF")
            .getText()
        );
        fieldValues.add(userCadWindowFrame
            .getTextFieldMap()
            .get("txtSenha")
            .getText()
        );  // Tentei fazer um for, mas a ordem da tabela fica bugada.

        return fieldValues;
    }

    public static List<String> readTextFields(BookCadWindow bookCadWindowFrame) {
        List<String> fieldValues = new ArrayList<>();
        fieldValues.add(bookCadWindowFrame
            .getTextFieldMap()
            .get("txtID")
            .getText()
        );
        fieldValues.add(bookCadWindowFrame
            .getTextFieldMap()
            .get("txtNomeLivro")
            .getText()
        );
        fieldValues.add(bookCadWindowFrame
            .getTextFieldMap()
            .get("txtDataPubl")
            .getText()
        );
        fieldValues.add(bookCadWindowFrame
            .getTextFieldMap()
            .get("txtAutor")
            .getText()
        );
        return fieldValues;
    }
}
