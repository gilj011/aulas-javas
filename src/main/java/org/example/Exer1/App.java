package org.example.Exer1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bolo bolo1 = new Bolo();
        Bolo bolo2 = new Bolo();
        Bolo bolo3 = new Bolo();

        System.out.println("Qual o sabor do primeiro bolo?");
        bolo1.sabor = scanner.nextLine();
        System.out.println("E qual preço? (entre 30.00R$ e 50.00R$)");
        bolo1.valor = scanner.nextDouble();

if (bolo1.valor < 30 || bolo1.valor > 50) {
    do {
        System.out.println("Digite um valor entre 30.00R$ e 50.00R$");
        bolo1.valor = scanner.nextDouble();
    } while (bolo1.valor < 30 || bolo1.valor > 50);
}


        System.out.println("Qual o sabor do segundo bolo?");
        bolo2.sabor = scanner.nextLine();
        System.out.println("E qual preço? (entre 30.00R$ e 50.00R$)");
        bolo2.valor = scanner.nextDouble();
        do {
            System.out.println("Digite um valor entre 30.00R$ e 50.00R$");
            bolo2.valor = scanner.nextDouble();
        }while (bolo2.valor < 30 || bolo2.valor > 50);


        System.out.println("Qual o sabor do terceiro bolo?");
        bolo3.sabor = scanner.nextLine();
        System.out.println("E qual preço? (entre 30.00R$ e 50.00R$)");
        bolo3.valor = scanner.nextDouble();
        do {
            System.out.println("Digite um valor entre 30.00R$ e 50.00R$");
            bolo3.valor = scanner.nextDouble();
        }while (bolo3.valor < 30 || bolo3.valor > 50);

        System.out.println("""
Qual bolo voce quer comprar?
1- Bolo de %s ---------  %.2fR$
2- Bolo de %s ---------  %.2fR$
3- Bolo de %s --------- %.2fR$
""".formatted(bolo1.sabor,bolo1.valor,bolo2.sabor,bolo2.valor,bolo3.sabor,bolo3.valor));

    }
}
