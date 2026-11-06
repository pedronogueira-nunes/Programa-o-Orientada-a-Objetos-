package Unidade_02.Praticas.colecoes.cores;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Preto");
        cores.add("Azul");
        cores.addAll(Arrays.asList("Verde", "Laranja", "Roxo"));
        System.out.println(cores);
        Collections.sort(cores);
        busca(cores, "Roxo");
        busca(cores, "Branco");

    }

    public static void busca(ArrayList<String> lista, String alvo) {
        if(lista.contains(alvo)) {
            int posicao = Collections.binarySearch(lista, alvo);
            System.out.println(alvo + " esta na lista na posição " + posicao);
        } else {
            System.out.println(alvo + " não esta na lista");
        }

    }
}