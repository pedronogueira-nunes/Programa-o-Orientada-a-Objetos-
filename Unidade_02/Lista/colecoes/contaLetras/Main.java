package Unidade_02.Lista.colecoes.contaLetras;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String texto = "HELLO THERE";

        TreeMap<Character, Integer> mapa = new TreeMap<>();

        for(int i = 0; i < texto.length(); i++ ) {
            char letra = texto.charAt(i);

            if(letra != ' ') {
                if(mapa.containsKey(letra)) {
                    mapa.put(letra, mapa.get(letra) + 1);
                }
                else {
                    mapa.put(letra, 1);
                }
            }
        }

        for(Character letra : mapa.keySet()) {
            System.out.println(letra + ": " + mapa.get(letra));
        }
    }
}
