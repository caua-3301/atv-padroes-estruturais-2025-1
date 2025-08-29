package br.edu.ifpb.padroes.atv3.musicas.clients;

import br.edu.ifpb.padroes.atv3.musicas.model.Item;
import br.edu.ifpb.padroes.atv3.musicas.model.Musica;
import br.edu.ifpb.padroes.atv3.musicas.proxy.ClientHttp;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ClienteHttpABCD implements ClientHttp {

    public static final String SERVICE_URI = "http://localhost:3000/musicas";

    @Override
    public List<Item> getItens() {
        try {
            HttpRequest musicaRequest = HttpRequest.newBuilder(new URI(SERVICE_URI)).GET().build();
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpResponse<String> response = httpClient.send(musicaRequest, HttpResponse.BodyHandlers.ofString());

            ObjectMapper objectMapper = new ObjectMapper();
            List<Musica> musicas = objectMapper.readValue(
                    response.body(),
                    objectMapper.getTypeFactory().constructCollectionType(List.class, Musica.class)
            );
            return new ArrayList<>(musicas);
        } catch (URISyntaxException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Item getByTitle(String title) {
        return null;
    }

    @Override
    public String getType() {
        return "ABCD";
    }
}
