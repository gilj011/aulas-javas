package org.example.Musica;

import java.util.ArrayList;

public class Playlist {


    private ArrayList <Musica> musicas = new ArrayList<>();

    public void adicionarMusica(Musica musica){
        musicas.add(musica);
        System.out.println("Musica:\n"+musica.getNome()+"\nAdicionada a playlist");
    }
    public void moverMusica(String nomeMusica, Integer posicao) {
        Integer musicaEscolhida = -1;

        for (int i = 0; i < musicas.size(); i++) {
            String musicaAtual = musicas.get(i).getNome();
            if (nomeMusica.equalsIgnoreCase(musicaAtual)) {
                musicaEscolhida = i;
                System.out.println(i);
            }
        }
        Musica musica1 = musicas.get(posicao);
        Musica musica2 = musicas.get(musicaEscolhida);
            musicas.set(musicaEscolhida,musica1);
            musicas.set(musicaEscolhida,musica2);



    }
    public void mostrarPlaylist(){
        for (int i = 0; i < musicas.size(); i++) {
            System.out.println(i+"ª"+musicas.get(i).getNome());
        }
    }
    public void removerMusica(String nomeMusica){
        Integer musicaEscolhida = -1;

        for (int i = 0; i < musicas.size(); i++) {
            String musicaAtual = musicas.get(i).getNome();
            if (nomeMusica.equalsIgnoreCase(musicaAtual)) {
                musicaEscolhida = i;
            }
        }
        System.out.println("Musica ");
        musicas.remove(0);
    }
    public void getDuracao(){
        Double totalPlaylist = 0.0;
        for (int i = 0; i < musicas.size(); i++) {
            totalPlaylist+= musicas.get(i).getDuracao();
        }
        System.out.println("O tempo total da playlist é: %.2f".formatted(totalPlaylist));
    }
}