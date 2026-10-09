package Unidade_02.contabancaria;

import java.util.ArrayList;

public class Extrato {
    private ArrayList<Float> transacoes;
    private float saldo;

    public Extrato() {
        this.transacoes = new ArrayList<>();
        this.saldo = 0.0f;
    }

    public float getSaldo() {
                return saldo;
        }

        private void transacao(float valor) {
                saldo += valor;
                transacoes.add(valor);
        }

        public void sacar(float valor) {
                if(valor > saldo) {
                        System.out.println("Transacao nao efetuado: limite indisponivel");
                        return;
                }
                this.transacao(-valor);
        }

        public void depositar(float valor) {
                transacao(valor);
        }

        public void visualiza() {
                for(float transacao: transacoes) {
                        System.out.println(transacao);
                }
        }


}
