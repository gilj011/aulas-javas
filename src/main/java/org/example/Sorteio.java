package org.example;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        System.out.print("Digite um numero:\n");
        Scanner leitor = new Scanner(System.in);
        Integer numeroEscolhido = leitor.nextInt();
        Boolean naoSorteado = true;
        Integer numeroSorteio = 0;
        Integer numeroPar = 0;
        Integer numeroImpar = 0;

        for (int i = 0; i < 200; i++) {
            Integer random = ThreadLocalRandom.current().nextInt(1, 101);
            System.out.printf("%dº Sorteio: %d\n", i, random);
            if (random == numeroEscolhido && naoSorteado) {
                numeroSorteio = i;
                System.out.print(String.format("Numero sorteado no %dº sorteio", i));
                naoSorteado = false;
            }
            if ((random % 2) == 0) {
                numeroPar++;
            } else {
                numeroImpar++;
            }
        }
        if (naoSorteado){
            System.out.printf("O numero nao foi sorteado nenhuma vez.\n" +
                    "Quantidade de numeros pares:%d\n" +
                    "Quantidade de numeros impares:%d\n",  numeroPar, numeroImpar);
        }else {
            System.out.printf("Primeira vez que o numero foi sorteado:%d\n" +
                    "Quantidade de numeros pares:%d\n" +
                    "Quantidade de numeros impares:%d\n", numeroSorteio, numeroPar, numeroImpar);
        }
    }
}
