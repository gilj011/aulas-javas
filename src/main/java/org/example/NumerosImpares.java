package org.example;

public class NumerosImpares {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 0; i <=90 ; i++) {

if ((i%2) != 0){
    contador++;
    System.out.printf("%dº NumeroImpar:%d\n",contador,i);
}
        }
    }
}
