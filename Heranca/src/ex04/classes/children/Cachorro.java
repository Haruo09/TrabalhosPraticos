package ex04.classes.children;

import ex04.classes.parents.Animal;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
        setSom("AuAu!");
    }

    @Override
    public void emitirSom() {
        System.out.println(getSom());
    }
}
