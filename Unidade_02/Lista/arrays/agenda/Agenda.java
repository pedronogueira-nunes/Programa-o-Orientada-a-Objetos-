package Unidade_02.Lista.arrays.agenda;

import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {
    ArrayList<EntradaEmAgenda> agenda = new ArrayList<>();

    public Agenda(ArrayList<EntradaEmAgenda> agenda) {
        this.agenda = agenda;
    }

    public void adicionarCompromisso(EntradaEmAgenda novoCompromisso) {
        agenda.add(novoCompromisso);
    }

    public void listaDia(int dia, int mes, int ano) {
        Iterator<EntradaEmAgenda> roteiro = agenda.iterator();
        EntradaEmAgenda auxiliar;
        while(roteiro.hasNext()) {
            auxiliar = roteiro.next();
            if(auxiliar.ehNoDia(dia, mes, ano)) {
                System.out.println("Evento: " + auxiliar);
            }
        }
    }
}
