package br.edu.ifpb.padroes.atv3.musicas.servico;

import br.edu.ifpb.padroes.atv3.musicas.clients.ClienteHttpABCD;
import br.edu.ifpb.padroes.atv3.musicas.exceptions.MusicaNaoEncontradaException;
import br.edu.ifpb.padroes.atv3.musicas.model.Item;
import br.edu.ifpb.padroes.atv3.musicas.proxy.ClientHttp;
import br.edu.ifpb.padroes.atv3.musicas.proxy.ClientHttpProxy;

// Serviço concreto de reprodução de música
public class TocadorMusicaABCD implements TocadorMusica {
    @Override
    public void tocarMusica(Item item) {
        if (validar(item))
            throw new MusicaNaoEncontradaException();

        System.out.println("A melhor do MPB é aqui");
        System.out.println("Reproduzindo:");

        item.getInfo();
    }

    private boolean validar(Item item) {
        ClientHttpProxy proxy = new ClientHttpProxy(new ClienteHttpABCD());

        return proxy.getByTitle(item.getItemName()) != null;
    }
}
