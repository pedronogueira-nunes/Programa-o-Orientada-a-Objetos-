package Unidade_02.Praticas.colecoes.pilha;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Number> pilha = new Stack<>();
        pilha.add(10);
        System.out.println(pilha);
        pilha.add(15.5F);
        System.out.println(pilha);
        pilha.add(21.5);
        System.out.println(pilha);
        pilha.add(111);
        System.out.println(pilha);
        System.out.println("Elemento extraido: " + pilha.pop());
        System.out.println(pilha);
        System.out.println("Elemento extraido: " + pilha.pop());
        System.out.println(pilha);
        System.out.println("Elemento extraido: " + pilha.pop());
        System.out.println(pilha);
        System.out.println("Elemento extraido: " + pilha.pop());
        System.out.println(pilha);
    }
}
