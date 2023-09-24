package ex04.main;

import ex04.classes.children.Cachorro;
import ex04.classes.children.Gato;
import ex04.classes.children.Passaro;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando animais:
        Cachorro cachorro = new Cachorro("Godofredo", 9);
        Gato gato = new Gato("Itália", 8);
        Passaro passaro = new Passaro("Jojo", 10);

        // Emitindo sons:
        cachorro.emitirSom();
        gato.emitirSom();
        passaro.emitirSom();
    }
}
