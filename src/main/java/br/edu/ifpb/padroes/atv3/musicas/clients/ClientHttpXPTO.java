package br.edu.ifpb.padroes.atv3.musicas.clients;

import br.edu.ifpb.padroes.atv3.musicas.model.Item;
import br.edu.ifpb.padroes.atv3.musicas.model.Musica;
import br.edu.ifpb.padroes.atv3.musicas.model.Song;
import br.edu.ifpb.padroes.atv3.musicas.proxy.ClientHttp;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class ClientHttpXPTO implements ClientHttp {

    public static final String SERVICE_URI = "http://localhost:4000/musics";

    public List<Song> findAll() {
        try {
            HttpRequest songsRequest = HttpRequest.newBuilder(new URI(SERVICE_URI)).GET().build();
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpResponse<String> response = httpClient.send(songsRequest, HttpResponse.BodyHandlers.ofString());

            ObjectMapper objectMapper = new ObjectMapper();
            List<Song> songsRetrieved = objectMapper.readValue(response.body(), objectMapper.getTypeFactory().constructCollectionType(List.class, Musica.class));
            return songsRetrieved;
        } catch (URISyntaxException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Item> getItens() {
        return null;
    }

    @Override
    public Item getByTitle(String title) {
        return null;
    }

    @Override
    public String getType() {
        return "XPTO";
    }
}
