package Lista.time;

import java.util.ArrayList;

public class Time {
    String nomeTime;
    String dataFundacao;
    int numJogadores;
    
    ArrayList<Jogador> jogadores;


    public void adicionarJogador(Jogador j) {
        jogadores.add(j);
    }


}
