package org.example.Cofrinho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cofrinho cofre1 = new Cofrinho();
        Cofrinho cofre2 = new Cofrinho();
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("""
                O que você deseja fazer com o cofrinho?
                1- |Depositar |
                2- |Agitar    |    
                3- |Quebrar   |
                """);
        int res = scanner.nextInt();

        if (res == 1){
            System.out.println("""
                    Quanto você quer depositar?
                    """);
            Double dinheiroDeposito= scanner.nextDouble();
            cofre1.depositar(dinheiroDeposito);;
            System.out.print("""
                    Cofre 1: %.2f
                    """.formatted(cofre1.dinheiro));
        }
        if (res == 2){
            Double dinheiroCaido = cofre1.agitar();
            System.out.println("""
                   Você agitou e caiu: %.2f
                   E voce ficou com: %.2f no cofrinho
                    """.formatted(dinheiroCaido,cofre1.dinheiro));

        }
        if (res == 3){
        cofre1.quebrar();
            System.out.println("""
                    Você quebrou o cofrinho e pegou %.2f R$ de dentro do cofrinho.
                    """.formatted(cofre1.dinheiro));
                    break;

        }
        }


    }
}
