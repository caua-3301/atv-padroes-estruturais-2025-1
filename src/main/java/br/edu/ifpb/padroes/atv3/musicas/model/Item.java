package br.edu.ifpb.padroes.atv3.musicas.model;

// Interface que servirá como abstração (adaptador) para o uso da música/song
public interface Item {

    // Visa abstrair as informações do item (múscia)
    public String getInfo();

    public String getItemName();
}
