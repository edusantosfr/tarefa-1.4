package org.example.classesEx3;

public class Circulo implements Forma{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        System.out.println("\nResultado da Área do Circulo: " + Math.round((Math.pow(raio, 2)) * (Math.PI)));
    }
}
