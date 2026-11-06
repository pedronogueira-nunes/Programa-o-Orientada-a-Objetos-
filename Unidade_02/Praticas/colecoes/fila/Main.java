package Unidade_02.Praticas.colecoes.fila;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Double> fila = new PriorityQueue<>();
        fila.offer(6.5);
        fila.offer(3.5);
        fila.offer(5.5);
        fila.offer(4.5);

        System.out.println("1º : " + fila.poll());
        System.out.println("2º : " + fila.poll());
        System.out.println("3º : " + fila.poll());
        System.out.println("4º : " + fila.poll());
    }
}
