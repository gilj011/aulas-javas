package org.example.teste;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {
    public static void main(String[] args) {
        Integer random;
        Integer total = 0;
        for (int i = 0; i <= 10 ; i++)
        {
            random = ThreadLocalRandom.current().nextInt(0,11);
            System.out.printf("Numero sorteado:\n%d\n",random);
            if (random == 0){
                System.out.printf("A soma dos numeros é:\n%d\n",total);
                break;
            }else {
        total += random;}
        }
    }
}
