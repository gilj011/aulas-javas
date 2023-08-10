package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class Randomicos {

    public static void main(String[] args) {
Integer randomI = ThreadLocalRandom.current().nextInt(5,11);
        System.out.printf("Inteiro: %d\n",randomI);

Double randomD = ThreadLocalRandom.current().nextDouble(0 ,3718.54);
        System.out.printf("Real: %f",randomD);

    }
}
