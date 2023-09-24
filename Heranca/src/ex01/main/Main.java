package ex01.main;

import ex01.classes.Carro;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando um carro:
        Carro carro = new Carro(
            "Uno 4 portas com escada",
            "Fiat",
            2077,
            4
        );

        // Acelerando o carro:
        carro.acelerar(70);
        System.out.println(carro.getVelocidade() + "Km/h");

        // Freando o carro:
        carro.frear(700);
        System.out.println(carro.getVelocidade() + "Km/h");
    }
}
