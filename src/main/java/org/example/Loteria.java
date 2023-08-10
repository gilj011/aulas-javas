package org.example;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numeroEscolhido;
        Integer random;
        Integer contador = 0;
        System.out.println("Escolha um numero entre 1 e 10");
        numeroEscolhido = leitor.nextInt();


        do {
            random = ThreadLocalRandom.current().nextInt(0,11);
            contador++;
        }while (numeroEscolhido != random);

        if (contador <= 3 ) {
            System.out.printf("Você é MUITO sortudo, conseguiu com: \n %d tentativas", contador);


        } else if (contador > 3 && contador <= 10) {
            System.out.printf("Você é sortudo, conseguiu com: \n %d tentativas", contador);
        }else {
            System.out.printf("É melhor você parar de apostar e ir trabalhar conseguiu com: \n %d tentativas", contador);
        }



    }
}
