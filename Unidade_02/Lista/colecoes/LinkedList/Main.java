package Unidade_02.Lista.colecoes.LinkedList;

import java.util.LinkedList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character> lista1 = new LinkedList<>(Arrays.asList('0', '1', '2', '3', '4',
            '5', '6', '7', '8', '9'));
        LinkedList<Character> lista2 = new LinkedList<>();

        for(int i = lista1.size() - 1; i >= 0; i--) {
            lista2.add(lista1.get(i));
        }

        System.out.println("Lista original: "+ lista1);
        System.out.println("Lista invertida: " + lista2);
    }
}
