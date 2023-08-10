package org.example;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer tempoAquecendo;
        Integer tempoAerobico;
        Integer tempoMusculação;
        String nome;
        System.out.println("Qual seu nome?");
        nome = leitor.nextLine();
        System.out.println("Digite os tempos em minutos");
        System.out.println("Quanto tempo você aqueceu?");
        tempoAquecendo = leitor.nextInt();
        System.out.println("Quanto tempo de aerobico foi realizado?");
        tempoAerobico = leitor.nextInt();
        System.out.println("Quanto tempo de treino?");
        tempoMusculação = leitor.nextInt();

        Integer totalCalorias =(tempoAquecendo * 12)+(tempoAerobico * 20)+(tempoMusculação*25) ;
        Integer totalTempo =tempoAquecendo+tempoAerobico+tempoMusculação ;

        System.out.println("Olá "+nome+". Você fez um total de: "+totalTempo+" minutos de exercicios e perdeu cerca de "+totalCalorias+" calorias.");
        /*Jorge começou a se exercitar e deseja saber quantas calorias vai perder nos exercícios.
Crie uma classe Java que:
• Seja executável
• Crie uma variável que armazene o tempo, em minutos (valor inteiro) que ele passou se
aquecendo
• Crie uma variável que armazene o tempo em minutos (valor inteiro) que ele fez exercícios
aeróbicos (correr, andar, pedalar etc)
• Crie uma variável que armazene o tempo em minutos (valor inteiro) que ele fez exercícios
de musculação
• Calcule quantas calorias o Jorge perdeu, sendo que: * cada minuto de aquecimento faz
perder 12 calorias * cada minuto de ex aeróbico faz perder 20 calorias * cada minuto de
musculação faz perder 25 calorias
Exiba, usando interpolação e apenas valores numéricos inteiros, uma frase como esta:
"Olá, Jorge. Você fez um total de X minutos de exercícios e perdeu cerca de
Y calorias".*/

    }
}
