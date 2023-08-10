package org.example;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Double valor;
        Integer quantidade;
        Double pagamento;
        Double valorTotal;
        Double troco;

        System.out.println("BEM VINDO AO MERCADINHO SOUZA\n-=-=-===--=-=--=-=-=-=--=-=-==--=-==--=-==--=-==--=-=-=-==-=-");

        System.out.println("Digite o valor do unitario produto em reais:");
        valor = leitor.nextDouble();
        System.out.println("Digite a quatidade comprada:");
        quantidade = leitor.nextInt();
        System.out.println("Digite quanto foi pago:");
        pagamento = leitor.nextDouble();
valorTotal = valor * quantidade;
troco = pagamento - valorTotal;
        if (pagamento < valorTotal) {
            System.out.println("Valor pago menor que valor devido");
        }else {
            System.out.println("Seu troco é:\n"+ troco);
        }
    }
}
