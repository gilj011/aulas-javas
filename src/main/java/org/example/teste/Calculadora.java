package org.example.teste;

public class Calculadora {
    Integer numeroOperacoes = 0;

    void  somar(Integer n1, Integer n2){
        System.out.println("Resultado: "+(n1+n2));
        numeroOperacoes++;

    }
    Integer  subtrair(Integer n1, Integer n2){
        return n1-n2;
    }
    void  multiplicar(){

    }
    void  dividir(){

    }

}
