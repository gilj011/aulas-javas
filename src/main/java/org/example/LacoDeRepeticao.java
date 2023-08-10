package org.example;

import java.util.Scanner;

public class LacoDeRepeticao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numero;
        System.out.println("Digite o numero 10:");
        numero = leitor.nextInt();

        do{
            System.out.println("Você digitou errado.");
            numero = leitor.nextInt();
        }while (numero !=10);{
            System.out.println("a");
        }

    }
}
