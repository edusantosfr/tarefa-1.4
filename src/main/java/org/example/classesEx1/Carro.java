package org.example.classesEx1;

public class Carro {
    String marca;
    String modelo;
    int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getDescricao() {
        String retorno = "";

        retorno += "Marca: [" + this.marca + "], Modelo: [" + this.modelo + "], Ano: [" + this.ano + "]";

        return retorno;
    }
}
