package ex02.main;

import ex02.classes.children.Circulo;
import ex02.classes.children.Quadrado;
import ex02.classes.children.Triangulo;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Circulo circulo = new Circulo(3);
        Quadrado quadrado = new Quadrado(8);
        Triangulo trianguloA = new Triangulo(8);
        Triangulo trianguloB = new Triangulo(6, 5);
        Triangulo trianguloC = new Triangulo(3, 4, 5);

        System.out.printf(
            """
            CÍRCULO ===================
            Área = %,.2f
            Perímetro = %,.2f
            
            QUADRADO ==================
            Área = %,.2f
            Perímetro = %,.2f
            
            TRIÂNGULO EQUILÁTERO ======
            Área = %,.2f
            Perímetro = %,.2f
            
            TRIÂNGULO ISÓSCELES =======
            Área = %,.2f
            Perímetro = %,.2f
            
            TRIÂNGULO ESCALENO ========
            Área = %,.2f
            Perímetro = %,.2f
            """,
            circulo.calcularArea(), circulo.calcularPerimetro(),
            quadrado.calcularArea(), quadrado.calcularPerimetro(),
            trianguloA.calcularArea(), trianguloA.calcularPerimetro(),
            trianguloB.calcularArea(), trianguloB.calcularPerimetro(),
            trianguloC.calcularArea(), trianguloC.calcularPerimetro()
        );
    }
}
