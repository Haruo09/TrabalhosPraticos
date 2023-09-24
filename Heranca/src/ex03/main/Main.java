package ex03.main;

import ex03.classes.children.Desenvolvedor;
import ex03.classes.children.Gerente;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // Instanciando os objetos:
        Gerente gerente = new Gerente(
            "Garibaldo",
            "Kenshkrunsknein da Silva",
            75_000.00
        );

        Desenvolvedor dev1 = new Desenvolvedor(
            "Fábio Haruo",
            "De Freitas Nishioka",
            5_700.00
        );

        Desenvolvedor dev2 = new Desenvolvedor(
            "Maria Eduarda",
            "Pereira do Nascimento",
            8_000
        );

        // Alterando os salários:
        gerente.aumentarSalarioDev(dev1, .25);
        gerente.diminuirSalarioDev(dev2, .10);

        // Imprimindo as informações:
        System.out.println(gerente);
        System.out.println(dev1);
        System.out.println(dev2);
    }
}
