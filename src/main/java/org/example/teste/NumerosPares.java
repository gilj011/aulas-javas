package org.example.teste;

public class NumerosPares {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 0; i <=40 ; i++) {

            if ((i%2) == 0){
                contador++;
                System.out.printf("%dº Numero Par:%d\n",contador,i);
            }
        }
    }
}
