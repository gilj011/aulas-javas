package org.example.Exer2;

public class Encomenda {
    Integer tamanho = 0;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;
    Double frete = 0.0;
    Double totalcFrete = 0.0;
    String tamString;

    void calcularFrete(){
        switch (tamanho) {
            case 1://Caso for pequeno
                    frete = valorEncomenda * 0.01;
                    tamString = "P";
                    break;
            case 2://Caso for medio
                    frete = valorEncomenda * 0.03;
                     tamString = "M";
                break;
            case 3://caso for grande
                    frete = valorEncomenda * 0.05;
                     tamString = "G";
                break;
        }
        if (distancia <= 50){
            totalcFrete += 3;
        }
        else if (distancia <= 200) {
            totalcFrete += 5;
        }
        else {
            totalcFrete += 7;
        }
    }

    void mostrarEtiqueta(){
totalcFrete = frete+ valorEncomenda;
        System.out.printf("""
                ETIQUETA PARA ENVIO *****
                Endereço do remetente: %s
                Endereço do destinatário: %s
                Tamanho: %s
                --------------------------------------------------
                Valor encomenda: R$ %.2f
                Valor frete: R$ %.2f
                --------------------------------------------------
                Valor total: R$ %.2f
                """.formatted(enderecoRemetente,enderecoDestinatario,tamString,valorEncomenda,frete,totalcFrete));
    }
}
