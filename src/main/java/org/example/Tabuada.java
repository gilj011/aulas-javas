package org.example;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o numero desejado para ver a tabuada:");
        Integer numero = leitor.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }


    }
}
