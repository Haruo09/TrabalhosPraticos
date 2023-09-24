package ex03.classes.children;

import ex03.classes.parents.Funcionario;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, String sobrenome, double salario) {
        super(nome, sobrenome, salario);
    }

    @Override
    public String toString() {
        return String.format(
            """
            Desenvolvedor =============
            Nome: %s
            Sobrenome: %s
            Salário: R$%,.2f
            """, getNome(), getSobrenome(), getSalario()
        );
    }
}
