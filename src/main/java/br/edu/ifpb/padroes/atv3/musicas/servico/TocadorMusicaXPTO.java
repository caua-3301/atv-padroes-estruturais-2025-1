package br.edu.ifpb.padroes.atv3.musicas.servico;

import br.edu.ifpb.padroes.atv3.musicas.clients.ClientHttpXPTO;
import br.edu.ifpb.padroes.atv3.musicas.exceptions.MusicaNaoEncontradaException;
import br.edu.ifpb.padroes.atv3.musicas.model.Item;
import br.edu.ifpb.padroes.atv3.musicas.proxy.ClientHttpProxy;

public class TocadorMusicaXPTO implements TocadorMusica{
    @Override
    public void tocarMusica(Item item) {
        if (validar(item))
            throw new MusicaNaoEncontradaException();

        System.out.println("Os melhores hits internacionais você encontra aqui!");
        System.out.println("Reproduzindo: ");

        item.getInfo();
    }

    private boolean validar(Item item) {
        ClientHttpProxy proxy = new ClientHttpProxy(new ClientHttpXPTO());

        return proxy.getByTitle(item.getItemName()) != null;
    }
}
