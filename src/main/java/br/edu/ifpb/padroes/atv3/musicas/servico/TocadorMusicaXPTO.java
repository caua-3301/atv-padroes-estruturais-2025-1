package br.edu.ifpb.padroes.atv3.musicas.servico;

import br.edu.ifpb.padroes.atv3.musicas.clients.ClientHttpXPTO;
import br.edu.ifpb.padroes.atv3.musicas.clients.ClienteHttpABCD;
import br.edu.ifpb.padroes.atv3.musicas.exceptions.MusicaNaoEncontradaException;
import br.edu.ifpb.padroes.atv3.musicas.model.Item;
import br.edu.ifpb.padroes.atv3.musicas.proxy.ClientHttpProxy;

public class TocadorMusicaXPTO implements TocadorMusica{
    @Override
    public void tocarMusica(String name) {
        ClientHttpProxy proxy = new ClientHttpProxy(new ClienteHttpABCD());

        Item itemSelected = proxy.getByTitle(name);

        if (itemSelected == null)
            throw new MusicaNaoEncontradaException();

        System.out.println("Os melhores hits internacionais você encontra aqui!");
        System.out.println("Reproduzindo: ");

        itemSelected.getInfo();
    }
}
