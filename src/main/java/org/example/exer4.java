package org.example;


import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Boolean encontrou = false;
        List <String> frutas =new ArrayList<>();
        frutas.add("banana");
        frutas.add("maçã");
        frutas.add("abacate");
        frutas.add("mamao");
        frutas.add("uva");
        frutas.add("azeitona");
        System.out.println("Tente advinhas se a fruta esta na lista");
        String frutaEscolhida = leitor.nextLine();
        for (int i = 0; i < frutas.size() ; i++) {
            if(frutaEscolhida.equalsIgnoreCase(frutas.get(i))){
                System.out.printf("A fruta %s existe na lista",frutas.get(i));
                encontrou = true;
            }
            }
        if (!encontrou){
            System.out.println("A fruta nao foi encontrada, encerrando...");
        }
    }
}
