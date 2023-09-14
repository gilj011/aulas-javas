package org.example.ProgressaoAritmetica;

public class Progressao {
    private Integer primeiroTermo = 0;
    private Integer razao = 0;


    public Progressao(Integer primeiroTermo, Integer razao) {
        this.primeiroTermo = primeiroTermo;
        this.razao = razao;
    }

    public Integer calcularTermo(Integer repeticao) {
        Integer aTermo = primeiroTermo;
        for (int i = 0; i < repeticao; i++) {

        aTermo += razao;

        }

        return  aTermo;
    }
}