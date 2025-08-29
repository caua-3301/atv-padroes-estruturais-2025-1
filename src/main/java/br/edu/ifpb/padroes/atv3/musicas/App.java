package br.edu.ifpb.padroes.atv3.musicas;

import br.edu.ifpb.padroes.atv3.musicas.facade.TocadorFacade;
import br.edu.ifpb.padroes.atv3.musicas.model.Musica;
import br.edu.ifpb.padroes.atv3.musicas.servico.TocadorMusicaABCD;
import br.edu.ifpb.padroes.atv3.musicas.servico.TocadorMusicaApp;
import br.edu.ifpb.padroes.atv3.musicas.servico.TocadorMusicaPremium;
import br.edu.ifpb.padroes.atv3.musicas.servico.TocadorMusicaXPTO;

public class App {

    public static void main(String[] args) {
        // Obtendo as músicas
        TocadorMusicaABCD tocadorMusicaABCD = new TocadorMusicaABCD();

        TocadorMusicaApp tocadorMusicaApp = new TocadorMusicaApp(tocadorMusicaABCD);

        // Consultando as músicas
        String name = "Garota";

        tocadorMusicaApp.tocarMusica(name);

        // Comportamento similar, mas com mais serviços sendo realizados
        TocadorFacade tocadorFacade = new TocadorFacade(tocadorMusicaABCD);

        tocadorFacade.reproduzir("Garota");

        // Exmeplo do decorator
        TocadorMusicaPremium tocadorMusicaPremium = new TocadorMusicaPremium(new TocadorMusicaXPTO());

        tocadorMusicaPremium.tocarMusica("Bohemian");
    }
}
