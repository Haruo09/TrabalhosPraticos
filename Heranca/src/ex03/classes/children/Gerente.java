package ex03.classes.children;

import ex03.classes.parents.Funcionario;

public class Gerente extends Funcionario {
    public Gerente(String nome, String sobrenome, double salario) {
        super(nome, sobrenome, salario);
    }

    @Override
    public String toString() {
        return String.format(
            """
            Gerente ===============
            Nome: %s
            Sobrenome: %s
            Salário: R$%,.2f
            """, getNome(), getSobrenome(), getSalario()
        );
    }

    public void aumentarSalarioDev(Desenvolvedor desenvolvedor, double porcentagem) {
        double newSalario = desenvolvedor.getSalario();
        newSalario += newSalario * porcentagem;
        desenvolvedor.setSalario(newSalario);
    }

    public void diminuirSalarioDev(Desenvolvedor desenvolvedor, double porcentagem) {
        double newSalario = desenvolvedor.getSalario();
        newSalario -= newSalario * porcentagem;
        desenvolvedor.setSalario(newSalario);
    }
}
