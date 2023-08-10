package org.example;

import java.util.Enumeration;

public class TesteUm{

    public static void main(String[] args) {

        Integer n1 = 11;
        Integer n2 = 10;
        /*
        Double aleatorio = Math.random();
        System.out.println("Soma: " + (n1+n2) + " " +aleatorio);
        */

        if (n1 == 10) {
            System.out.println("é engual a 10");
        }else{
            System.out.println("nao é engual");
        }
        Boolean isIgual = n1 == n2;
        if (!isIgual) {

        }

        Integer numeroOpcao=2;
        switch (numeroOpcao){
            case 1:
                System.out.println("Foi 1");break;
            case 2:
                System.out.printf("Foi 2");break;
            case 3:
                System.out.println("foi 3");break;
            default:
                System.out.println("Não está entre 1 e 3 ");
        }
    }
}