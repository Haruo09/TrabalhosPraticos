package ex04.classes.children;

import ex04.classes.parents.Animal;

public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
        setSom("Miaaau!");
    }

    @Override
    public void emitirSom() {
        System.out.println(getSom());
    }
}
