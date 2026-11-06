package Unidade_02.Lista.arrays.agenda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntradaEmAgenda e1 = new EntradaEmAgenda(6, 11, 2026, "Estudar para POO");
        EntradaEmAgenda e2 = new EntradaEmAgenda(6, 11, 2026,
        "Estudar para Redes de Computadores");

        ArrayList<EntradaEmAgenda> l = new ArrayList<>(List.of(e1, e2));
        Agenda a = new Agenda(l);

        a.listaDia(6, 11, 2026);
    }
}
