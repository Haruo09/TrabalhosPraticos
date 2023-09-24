package ex04.classes.parents;

public abstract class Animal {
    // Atributos:
    private String nome;
    private int idade;
    private String som;

    // Construtor:
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método abstrato:
    public abstract void emitirSom();

    //
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }
}
