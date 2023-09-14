package org.example.Musica;

public class Musica {
    private String nome;
    private String artista;
    private String genero;
    private Double duracao;

    public Musica(String nome, String artista, String genero, Double duracao) {
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        this.duracao = duracao;
    }





    public void exibirInformacoes(){
        System.out.println("""
                \n\n
                Nome da musica: %s
                Artista: %s
                Genero: %s
                Duração: %.2f
                """.formatted(nome,artista,genero,duracao));
    }





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }
}
