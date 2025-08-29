package br.edu.ifpb.padroes.atv3.musicas.facade;

import br.edu.ifpb.padroes.atv3.musicas.servico.TocadorMusica;
import br.edu.ifpb.padroes.atv3.musicas.tmp.Cache;

public class TocadorFacade {

    private TocadorMusica tocadorMusica;

    public TocadorFacade(TocadorMusica tocadorMusica) {
        this.tocadorMusica = tocadorMusica;
    }

    // Exemplo de um método que manipula n classes e serviços mas abstrai o usuário disso
    public void reproduzir(String name) {
        // Serviço A
        tocadorMusica.tocarMusica(name);

        // Serviço B
        Cache.countSong();
    }
}
