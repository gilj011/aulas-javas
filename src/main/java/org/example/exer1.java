package org.example;

import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        Double n1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota");
        Double n2 = leitor.nextDouble();
        Double media =  n1 * 0.4 + n2 * 0.6;

        System.out.printf("Você teve a media de %.1f",media);



    }
}
