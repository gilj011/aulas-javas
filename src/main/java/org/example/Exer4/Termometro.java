package org.example.Exer4;

public class Termometro {
    Double tempAtual;
    Double tempMax = -99999.0;
    Double tempMin = 999999.0;

    void aumentaTemp( ){
    if (tempAtual > tempMax) {
        tempMax = tempAtual;
        }
    }
    void diminuiTemp( ){
        if (tempAtual < tempMin) {
            tempMin  = tempAtual;
        }
    }
    void mostrarTemp(){
        System.out.printf("""
                Temperatura Atual: %.2f
                Temperatura Maxima: %.2f
                Temperatura Minima: %.2f
                """.formatted(tempAtual,tempMax,tempMin));
    }
    void mostrarF(){
    Double atualF = tempAtual*1.8+32;
    Double maxF =   tempMax*1.8+32;
    Double minF =   tempMin*1.8+32;
        System.out.printf("""
                Em farenheitgh
                
                Temperatura Atual: %.2f
                Temperatura Maxima: %.2f
                Temperatura Minima: %.2f
                """.formatted(atualF,maxF,minF));
    }
}
