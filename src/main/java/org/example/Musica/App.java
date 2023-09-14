package org.example.Musica;

public class App {
    public static void main(String[] args) {
        Playlist playlist1 = new Playlist();
        Musica musica2 = new Musica("Balao","Orochi","Rap",2.0);
        Musica musica1 = new Musica("Baile de favela","Dj Mandrake","Poesia",4.0);


        playlist1.adicionarMusica(musica1);
        playlist1.adicionarMusica(musica2);

        System.out.println();
        System.out.println();
        System.out.println();

        playlist1.removerMusica("balao");
        playlist1.mostrarPlaylist();



    }
}
