package ex04.classes.children;

import ex04.classes.parents.Animal;

public class Passaro extends Animal {
    public Passaro(String nome, int idade) {
        super(nome, idade);
        setSom("PiuPiu!");
    }

    @Override
    public void emitirSom() {
        System.out.println(getSom());
    }
}
