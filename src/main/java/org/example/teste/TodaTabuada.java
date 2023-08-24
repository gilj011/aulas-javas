package org.example.teste;

import java.util.Scanner;

public class TodaTabuada {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n\nTabuada do "+ i + "\n");
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + "*" + j + "=" + i*j +"\n");
            }
        }


    }
}
