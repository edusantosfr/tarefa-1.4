package org.example.classesEx3;

public class Circulo implements Forma{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Resultado da Área do Circulo: " + (Math.pow(raio, 2)) * (Math.PI));
    }
}
