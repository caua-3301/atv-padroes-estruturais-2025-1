package br.edu.ifpb.padroes.atv3.musicas.servico;

// Visa simular e exmeplificar o exemplo do padrão decorator
public class TocadorMusicaPremium implements TocadorMusica {

    private TocadorMusica tocadorMusica;

    public TocadorMusicaPremium(TocadorMusica tocadorMusica) {
        this.tocadorMusica = tocadorMusica;
    }

    @Override
    public void tocarMusica(String name) {
        tocadorMusica.tocarMusica(name);

        // Exemplo de adição de uma "funcionalidade"
        System.out.println("Você é o nosso melhor ouvinte!");
    }
}
