package org.example.classesEx2;

public class Gato extends Animal {
    private String nome;
    private String som;

    public Gato(String som, String nome) {
        super(som, nome);
        this.nome = nome;
        this.som = som;
    }

    public void fazerSom() {
        System.out.println("O som que "+ nome +" faz é: Miau Maiu");
    }
}
