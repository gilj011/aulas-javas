package org.example;

import java.util.Scanner;

public class exer2_tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o numero desejado para ver a tabuada:");
        Double numero = leitor.nextDouble();
        System.out.print("""
Digite a operção desejada:
Adição = 1
Subtração = 2
Multiplicação = 3
Divisao = 4
Potenciação = 5
Resto = 6
Sair = 0
""");
        Integer oper = leitor.nextInt();

        if (oper == 1){
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%f + %f = %f\n",numero,i,numero+i);
            }
        }

        if (oper == 2){
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%.0f - %.0f = %.0f\n",numero,i,numero-i);
            }
        }

        if (oper == 3){
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%.0f * %.0f = %.0f\n",numero,i,numero*i);
            }
        }

        if (oper == 4){
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%.2f / %.2f = %.2f\n",numero,i,numero/i);
            }
        }
        if (oper == 5){
            for (double i = 1; i <= 10; i++) {
                System.out.printf("%.0f ^ %.0f = %.0f\n",numero,i,Math.pow(numero,i));
            }
        }
        if (oper == 6){
            for (double i = 1; i <= 10; i++) {
                System.out.printf("%.0f / %.0f = %.0f\n",numero,i,numero%i);
            }
        }
        else{
            System.out.printf("Encerrando...");
        }

    }
}