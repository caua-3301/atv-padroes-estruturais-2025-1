package br.edu.ifpb.padroes.atv3.musicas.model;

public record Musica(String id, String titulo, String artista, Long ano, String genero) implements Item {
    @Override
    public String getInfo() {
        String content = """
                Id: %s
                Título: %s
                Artista: %s
                Ano: %.f
                Gênero: %s
                """.formatted(id, titulo, artista, ano, genero);

        return content;
    }

    @Override
    public String getItemName() {
        return this.titulo();
    }
}
