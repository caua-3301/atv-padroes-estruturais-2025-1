package br.edu.ifpb.padroes.atv3.musicas.proxy;

import br.edu.ifpb.padroes.atv3.musicas.model.Item;

import java.util.List;

// Abstração que me permitirá utilizar do proxy ao realizar chamadas aos clients http
public interface ClientHttp {

    // Serviço de consulta das músicas
    public List<Item> getItens();

    // Serviço que consulta apenas uma música pelo título
    public Item getByTitle(String title);

    // Retorna o tipo de música (ABCD, XPTO, etc)
    public String getType();
}
