package br.edu.ifpb.padroes.atv3.musicas.servico;

import br.edu.ifpb.padroes.atv3.musicas.model.Item;

// Responsável pela ativação do seviço de reprodução das músicas
public class TocadorMusicaApp {

    private TocadorMusica tocadorMusica;

    // Serviço que, no momento, pode variar entre ABCD e XPTO
    public TocadorMusicaApp(TocadorMusica tocadorMusica) {
        this.tocadorMusica = tocadorMusica;
    }

    public void tocarMusica(Item item) {
        tocadorMusica.tocarMusica(item);
    }

}
