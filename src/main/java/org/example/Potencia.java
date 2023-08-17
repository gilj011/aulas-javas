package org.example;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a base da potencia:\n");
        Integer n1 = leitor.nextInt();
        System.out.println("Digite o expoente");
        Integer n2 = leitor.nextInt();
        Integer total = 0;

        for (int i = 1; i < n2; i++) {
        if (i == 1){
        total = n1*n1;

    }else {
            total = total*n1;
        }

}
        System.out.print(String.format("A potencia é: %d",total));}}
