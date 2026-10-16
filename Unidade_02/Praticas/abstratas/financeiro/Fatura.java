package Unidade_02.Praticas.abstratas.financeiro;

public abstract class Fatura implements Pagavel {
    private int qtd;
    private float preco;

    public Fatura(int qtd, float preco) {
        this.qtd = qtd;
        this.preco = preco;
    }

    public float obterValorDoPagamento() {
        return qtd*preco;
    }    
}
