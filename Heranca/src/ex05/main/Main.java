package ex05.main;

import ex05.classes.children.Eletronico;
import ex05.classes.parents.Produto;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando um produto comum:
        Produto produto = new Produto(
            "Banana",
            10,
            "Fruta amarela rica em potássio"
        );

        Eletronico eletronico = new Eletronico(
            "Galaxy S20FE",
            1980.8,
            "Celular da Samsumg custo benefício",
            "Samsumg",
            25
        );

        // Imprimindo as informações:
        System.out.println(produto);
        System.out.println(eletronico);

        // Aplicando descontos:
        produto.aplicarDesconto();
        eletronico.aplicarDesconto();

        // Imprimindo novamente as informações:
        System.out.println(produto);
        System.out.println(eletronico);
    }
}
