package ex03.classes.parents;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salario;

    public Funcionario(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public String toString() {
        return String.format(
            """
            FUNCIONÁRIO ===============
            Nome: %s
            Sobrenome: %s
            Salário: R$%,.2f
            """, nome, sobrenome, salario
        );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
