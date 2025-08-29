package br.edu.ifpb.padroes.atv3.musicas.model;

public record Song(String id, String title, String artist, Long year, String genre) implements Item {
    @Override
    public String getInfo() {
        String content = """
                Id: %s
                Título: %s
                Artista: %s
                Ano: %.f
                Gênero: %s
                """.formatted(id, title, artist, year, genre);

        return content;
    }

    @Override
    public String getItemName() {
        return this.title();
    }
}
