package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List <Double> numerosEscolhidos = new ArrayList();
        List <Double> numerosPares = new ArrayList();
        List <Double> numerosImpares = new ArrayList();
        Double menor = Double.POSITIVE_INFINITY;
        Double maior = Double.NEGATIVE_INFINITY;
        Double numeroAtual;
        while (1==1){
            System.out.print("Digite numeros para serem adicionados na lista");
            numeroAtual = leitor.nextDouble();
            if (numeroAtual == 0){
                break;
            }else {
                numerosEscolhidos.add(numeroAtual);
            }
        }
        for (int i = 0; i < numerosEscolhidos.toArray().length; i++) {
            if ((numerosEscolhidos.get(i) % 2 == 0)){
                numerosPares.add(numerosEscolhidos.get(i));
            }else {
                numerosImpares.add(numerosEscolhidos.get(i));
            }
            if (numerosEscolhidos.get(i) > maior) {
            maior = numerosEscolhidos.get(i);
            }
            if (numerosEscolhidos.get(i) < menor) {
            menor = numerosEscolhidos.get(i);
            }
        }
        System.out.printf("Números da lista:%s\n\n",numerosEscolhidos);
        System.out.printf("Números pares da lista:%s\n\n",numerosPares);
        System.out.printf("Números impares da lista:%s\n\n",numerosImpares);
        System.out.printf("Maior numero da lista:%s\n\n",maior);
        System.out.printf("Menor numero da lista:%s\n\n",menor);
    }
}

