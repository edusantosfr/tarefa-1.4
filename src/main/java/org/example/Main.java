package org.example;

import org.example.classesEx1.Carro;
import org.example.classesEx2.Cachorro;
import org.example.classesEx2.Gato;
import org.example.classesEx3.Circulo;
import org.example.classesEx3.Retangulo;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean loopWhile = true;

        while(loopWhile){
            System.out.println("----Menu----");
            System.out.println("1. Exercício 1");
            System.out.println("2. Exercício 2");
            System.out.println("3. Exercício 3");
            System.out.println("0 Sair");
            System.out.print("Digite sua opção: ");

            if (scanner.hasNextInt()) {
                int option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1 -> Ex1();
                    case 2 -> Ex2();
                    case 3 -> Ex3();
                    default -> loopWhile = false;
                }
            }
        }
    }

    public static void Ex1(){
        System.out.print("\nDigite a marca do seu carro: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o modelo: ");
        String modelo = scanner.nextLine();
        System.out.println("Digite o ano: ");
        int ano = scanner.nextInt();

        Carro carro = new Carro(marca, modelo, ano);
        System.out.println("\n" + carro.getDescricao() + "\n");
    }

    public static void Ex2(){
        System.out.print("\nDigite o nome do seu pet: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o som que ele faz (Latir ou Miar): ");
        String som = scanner.nextLine();

        String result;

        switch (som.toLowerCase()) {
            case "miar" -> {
                Gato gato = new Gato(som, nome);
                result  = gato.fazerSom();
            }
            case "latir" -> {
                Cachorro cachorro = new Cachorro(som, nome);
                result = cachorro.fazerSom();
            }
            default -> result = "Digite um som válido (Latir ou Miar)";
        }

        System.out.println(result);
    }

    public static void Ex3(){
        System.out.print("\nDigite o raio do Círculo: ");
        double raio = scanner.nextDouble();
        System.out.print("Digite a base do Retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do Retângulo: ");
        double altura = scanner.nextDouble();

        Circulo circulo = new Circulo(raio);
        circulo.calcularArea();
        Retangulo retangulo = new Retangulo(base, altura);
        retangulo.calcularArea();
    }
}