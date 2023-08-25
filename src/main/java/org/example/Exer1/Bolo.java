package org.example.Exer1;

import java.util.ArrayList;
import java.util.List;

public class Bolo {
    String sabor;
    Double valor = 0.0;
    Integer quantidadeVendida = 0;

    void comprarBolo(Integer qtdBolo){
        if (quantidadeVendida <= 100){

        }else {
            System.out.println("Quantidade de venda de bolos excedida.");
        }
    }
    void mostrarRelatorio(){
        System.out.println("""
                "O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %f
                """.formatted(sabor,quantidadeVendida,quantidadeVendida*valor));
    }
}
