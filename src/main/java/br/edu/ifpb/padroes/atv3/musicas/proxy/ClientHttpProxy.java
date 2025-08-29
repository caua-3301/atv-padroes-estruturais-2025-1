package br.edu.ifpb.padroes.atv3.musicas.proxy;

import br.edu.ifpb.padroes.atv3.musicas.model.Item;
import br.edu.ifpb.padroes.atv3.musicas.tmp.Cache;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Proxy responsável por intermediar as chamdas aos clientes que consumirão o serviço
public class ClientHttpProxy implements ClientHttp {

    private ClientHttp clientHttp;

    public ClientHttpProxy(ClientHttp clientHttp) {
        this.clientHttp = clientHttp;
    }

    @Override
    public List<Item> getItens() {
        // Se não tiver em cache, consulte
        if (!isHaveCache()) {
            return clientHttp.getItens();
        }

        // caso tenha cache, o mesmo é retornado
        return Cache.getItens(this.getType());
    }

    @Override
    public Item getByTitle(String title) {
        List<Item> itens = this.getItens();

        Item itemSelected = itens.stream()
                .filter(item -> item.getItemName().contains(title))
                .collect(Collectors.toCollection(ArrayList::new)).get(0);

        return itemSelected;
    }

    @Override
    public String getType() {
        return clientHttp.getType();
    }

    // Consulta o cache antes de efetuar a consulta de fato
    private boolean isHaveCache() {
        // Verificando se existe cache cadastrado, caso sim, a consulta não será realizada
        return Cache.isHaveCache(this.getType());
    }
}
