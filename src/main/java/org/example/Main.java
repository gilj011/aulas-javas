package org.example;
public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.anoLancamento = 1995;

        carro2.marca = "Porsche";
        carro2.modelo = "Cayene";
        carro2.anoLancamento = 2018;


        System.out.print("""
                Modelo Carro 1 =%s %s
                Modelo Carro 2 =%s %s
                
                """.formatted(carro1.marca,carro1.modelo,carro2.marca,carro2.modelo));


    }
}
