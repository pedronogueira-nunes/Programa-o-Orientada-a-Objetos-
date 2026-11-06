package Unidade_02.Praticas.colecoes.filtro;

import java.util.Iterator;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> listaCompleta = new LinkedList<>(Arrays.asList("Verde", "Laranja",
         "Roxo", "Vermelho", "rosa")); 
        LinkedList<String> listaRemocao = new LinkedList<>(Arrays.asList("Verde", "Rosa"));
        
        System.out.println(listaCompleta);
        flitro(listaCompleta, listaRemocao);
        System.out.println(listaCompleta);
    }

    public static void flitro(LinkedList<String> listaCompleta, LinkedList<String> listaRemocao) {
        Iterator<String> iterator = listaCompleta.iterator();
        while(iterator.hasNext()) {
            String elemento = iterator.next();
            if(listaRemocao.contains(elemento)) {
                iterator.remove();
            }
        }
    }
}
