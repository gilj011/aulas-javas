package org.example;

import java.util.Scanner;

public class Ex2Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();
        System.out.println("Digite a quantidade de notas:");
        Integer qtd = leitor.nextInt();
        Double total = 0.0;
        Double[] notas = new Double[qtd];
        Double media = null;

        for (int i = 0; i < notas.length ; i++) {
            System.out.printf("Digite a %dº Nota",i+1);
            notas[i]=leitor.nextDouble();
            total += notas[i];
        }
        media = total / notas.length;
        System.out.printf("Nome do aluno:%s\n" +
                "Média:%.2f\n",nome,media);

        if (media >= 6 ) {
            System.out.println( "Situação: Aprovado");
        }else{
            System.out.println( "Situação: Reprovado");
        }
        }
    }

