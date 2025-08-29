package br.edu.ifpb.padroes.atv3.musicas;

import br.edu.ifpb.padroes.atv3.musicas.model.Musica;
import br.edu.ifpb.padroes.atv3.musicas.servico.TocadorMusicaABCD;
import br.edu.ifpb.padroes.atv3.musicas.servico.TocadorMusicaApp;

public class App {

    public static void main(String[] args) {
        // Obtendo as músicas
        TocadorMusicaABCD tocadorMusicaABCD = new TocadorMusicaABCD();

        TocadorMusicaApp tocadorMusicaApp = new TocadorMusicaApp(tocadorMusicaABCD);

        // Consultando as músicas
        Musica musica = new Musica("sfU743nBefe679", "Garota", "Ney Matogrosso", 1998L, "MPB");

        tocadorMusicaApp.tocarMusica(musica);
    }
}
