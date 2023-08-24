package org.example;

public class Carro {
    String modelo;
    String marca;
    Integer anoLancamento;
Double velocidadeAtual = 0.0;
    void acelerar(){
        System.out.println("Vrummmmmmmmm");
        velocidadeAtual += 2.5;
    }
    void frear(){
        System.out.println("froommm");
        velocidadeAtual -= 2.5;
    }

}
