package ex05.classes.children;

import ex05.classes.parents.Produto;

public class Eletronico extends Produto {
    // Atributos específicos:
    private String marca;
    private double watts;

    // Construtor:
    public Eletronico(String nome, double preco, String descricao, String marca, double watts) {
        super(nome, preco, descricao);
        this.marca = marca;
        this.watts = watts;
    }

    // To String():
    public String toString() {
        return String.format(
            """
            ELETRONICO ================
            Nome: %s
            Marca: %s
            Preço: R$%,.2f
            Potência: %.1f W
            Descrição: %s
            """, getNome(), getMarca(), getPreco(), getWatts(), getDescricao()
        );
    }

    // Métodos específicos:
    @Override
    public double calcularDesconto() {
        if (getPreco() < 500) {
            return .1;
        }
        else if (getPreco() < 1000) {
            return .15;
        }
        else if (getPreco() < 1500) {
            return .20;
        }
        else {
            return .25;
        }
    }

    // Getters & Setters específicos:
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getWatts() {
        return watts;
    }

    public void setWatts(double watts) {
        this.watts = watts;
    }
}
