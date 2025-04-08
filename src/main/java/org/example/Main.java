package org.example;

import org.example.classesEx1.Carro;
import org.example.classesEx2.Cachorro;
import org.example.classesEx2.Gato;
import org.example.classesEx3.Circulo;
import org.example.classesEx3.Retangulo;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("BMW", "BMW M3", 2021);
        System.out.println(carro.getDescricao());

        Cachorro cachorro = new Cachorro("Latir", "Juma");
        cachorro.fazerSom();
        Gato gato = new Gato("Miar", "Duke");
        gato.fazerSom();

        Circulo circulo = new Circulo(3);
        circulo.calcularArea();
        Retangulo retangulo = new Retangulo(5, 4);
        retangulo.calcularArea();
    }
}