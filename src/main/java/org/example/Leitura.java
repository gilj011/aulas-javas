package org.example;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = leitor.nextLine();
        System.out.println("Qual sua idade?");
        Integer idade = leitor.nextInt();
        System.out.println("Seu nome é: " + nome + " \nE voce tem " + idade +" anos de idade ");
    }
}
