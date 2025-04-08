package org.example.classesEx3;

public class Retangulo implements Forma{
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("Resultado do Area do Retângulo: " + base*altura);
    }
}
