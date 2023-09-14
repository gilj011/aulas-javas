package org.example.Exer4;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.time.temporal.Temporal;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Termometro termometro1 = new Termometro();
        Scanner scanner = new Scanner(System.in);

       do {
           System.out.println("""
Digite a temperatura que deseja? (caso queira sair digite 0)

Caso queira ver em Fahrenheit digite 1
""");

           termometro1.tempAtual = scanner.nextDouble();
           termometro1.aumentaTemp();
           termometro1.diminuiTemp();
           if (termometro1.tempAtual == 1){
               termometro1.mostrarF();
           }else {
               termometro1.mostrarTemp();
           }
       }while (termometro1.tempAtual != 0);


    }
}
