package org.example.teste;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex1Lista {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos numeros voce quer somar?");
        Integer qtd = leitor.nextInt();
        Integer[] vetor = new Integer[qtd];
        Integer total = 0;

        for (int i = 0; i < vetor.length; i++) {
            Integer random = ThreadLocalRandom.current().nextInt(0,801);
            vetor[i] = random;
            System.out.printf("%dºN: %d\n",i+1,random);
            total += vetor[i];
        }
        System.out.printf("Soma total de todos os numeros:%d",total);


    }
}
