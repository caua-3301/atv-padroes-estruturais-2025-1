package br.edu.ifpb.padroes.atv3.musicas.model;

public record Musica(String id, String titulo, String artista, Long ano, String genero) implements Item {
    @Override
    public String getInfo() {
        String content = """
                Título: %s
                Artista: %s
                Ano: %s
                Gênero: %s
                """.formatted(titulo, artista, ano, genero);

        return content;
    }

    @Override
    public String getItemName() {
        return this.titulo();
    }
}
