package org.example.classesEx2;

public class Cachorro extends Animal{
    private String nome;
    private String som;

    public Cachorro(String som, String nome) {
        super(som, nome);
        this.nome = nome;
        this.som = som;
    }

    public String fazerSom() {
        String result;
        result = "O som que "+ nome +" faz é: Bark! Bark! BARK!\n";

        return result;
    }
}
