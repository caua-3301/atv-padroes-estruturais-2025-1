package br.edu.ifpb.padroes.atv3.musicas.tmp;

import br.edu.ifpb.padroes.atv3.musicas.model.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Classe que visa simular uma memórica cache
public class Cache {

    private static Map<String, List<Item>> itens = new HashMap<>();

    private static int songsListener = 0;

    public static void countSong() {
        songsListener += 1;
    }

    public static List<Item> getItens(String key) {
        return itens.get(key);
    }

    public static void setItens(Map<String, List<Item>> itens) {
        Cache.itens = itens;
    }

    // Verifica se existem algum cache
    public static boolean isHaveCache(String key) {
        return itens.containsKey(key);
    }
}
