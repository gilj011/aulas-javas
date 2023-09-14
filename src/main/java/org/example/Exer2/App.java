package org.example.Exer2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Encomenda encomenda1 = new Encomenda();
        encomenda1.enderecoDestinatario = "Rua haddock lobo 595";
        encomenda1.enderecoRemetente = "Rua dois paulo 13";
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Digite o tamanho:
                1-Pequeno
                2-Medio
                3-Grande
                """);
        encomenda1.tamanho = scanner.nextInt();
        System.out.println("Digite a distancia:");
        encomenda1.distancia = scanner.nextDouble();
        System.out.println("Digite o preco do produto:");
        encomenda1.valorEncomenda = scanner.nextDouble();

        encomenda1.calcularFrete();
        encomenda1.mostrarEtiqueta();





    }
}
