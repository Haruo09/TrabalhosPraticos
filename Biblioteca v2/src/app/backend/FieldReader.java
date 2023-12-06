package app.backend;

import app.frontend.windows.CadLivro;
import app.frontend.windows.CadUsuario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class FieldReader {
    public static List<String> readTextFields(CadUsuario cadUserFrame) {
        List<String> fieldValues = new ArrayList<>();
        for (JTextField txtField : cadUserFrame.getTextFieldMap().values()) {
            fieldValues.add(txtField.getText());
        }
        return fieldValues;
    }

    public static List<String> readTextFields(CadLivro cadLivroFrame) {
        List<String> fieldValues = new ArrayList<>();
        for (JTextField txtField : cadLivroFrame.getTextFieldMap().values()) {
            fieldValues.add(txtField.getText());
        }
        return fieldValues;
    }
}
