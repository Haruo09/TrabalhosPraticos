package ex02.classes.children;

import ex02.classes.parents.FiguraGeometrica;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double ladoA;
    private double ladoB;
    private double altura;

    // Construtor de um Equilátero:
    public Triangulo(double lado) {
        this.base = lado;
        this.ladoA = lado;
        this.ladoB = lado;

        // Pitágoras para achar a altura:
        this.altura = Math.sqrt(Math.pow(lado/2., 2)-Math.pow(lado, 2));
    }

    // Construtor de um Isósceles:
    public Triangulo(double base, double lados) {
        this.base = base;
        this.ladoA = lados;
        this.ladoB = lados;

        // Pitágoras para achar a altura:
        this.altura = Math.sqrt(Math.pow(base/2., 2)-Math.pow(lados, 2));
    }

    // Construtor de um Escaleno:
    public Triangulo(double base, double ladoA, double ladoB) {
        this.base = base;
        this.ladoA = ladoA;
        this.ladoB = ladoB;

        // Igualando a fórmula de Heron a bh/2 para descobrir a altura:
        this.altura = 2*calcularArea()/base;
    }

    @Override
    public double calcularArea() {
        // Fórmula de Heron:
        double s = calcularPerimetro()/2;
        return Math.sqrt(s*(s - ladoA)*(s - ladoB)*(s - base));
    }

    @Override
    public double calcularPerimetro() {
        return base + ladoA + ladoB;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
}
