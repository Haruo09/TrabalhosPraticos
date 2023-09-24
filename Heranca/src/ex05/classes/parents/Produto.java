package ex05.classes.parents;

public class Produto {
    // Atributos:
    private String nome;
    private double preco;
    private String descricao;

    // Construtor:
    public Produto(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    // To String():
    public String toString() {
        return String.format(
            """
            PRODUTO ===================
            Nome: %s
            Preço: R$%,.2f
            Descrição: %s
            """, nome, preco, descricao
        );
    }

    // Métodos da classe:
    public double calcularDesconto() {
        if (getPreco() < 50) {
            return .1;
        }
        else if (getPreco() < 100) {
            return .15;
        }
        else if (getPreco() < 150) {
            return .20;
        }
        else {
            return .25;
        }
    }

    public void aplicarDesconto() {
        setPreco(getPreco() - getPreco() * calcularDesconto());
    }

    // getters & setters:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
