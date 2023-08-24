package org.example.teste;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos filhos de 0 a 3 anos você possui?\n");
        Integer zeroTres = leitor.nextInt();
        System.out.println("Quantos filhos de 4 a 16 anos você possui?\n");
        Integer quatroSeis = leitor.nextInt();
        System.out.println("Quantos filhos de 17 a 18 anos você possui?\n");
        Integer seteOito = leitor.nextInt();

        Double zeroAnos = zeroTres * 25.12;
        Double quatroAnos = quatroSeis * 15.88;
        Double seteAnos = seteOito * 12.44;
        Integer totalFilhos = zeroTres + quatroSeis + seteOito;
        Double totalDinheiro = zeroAnos+ quatroAnos+seteAnos;

        System.out.println("Ao total com "+totalFilhos+ " filhos você recebera: "+ totalDinheiro+" Dinheiros para cuidar dos seus filhos");
/*
        R$25,12 por filhos com menos de 4 anos
        R$15,88 por filhos entre 4 e 16 anos
        R$12,44 por filhos entre 17 e 18 anos
        */

    }
}
