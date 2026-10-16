package Unidade_02.Praticas.reuso.concessionaria;

public class AutomovelDeLuxo extends AutomovelBasico {
    private boolean arcondicionado;
    private boolean direcaoIdraulica;

    public AutomovelDeLuxo(int ano, String modelo, String cor, boolean airbag, boolean radio, boolean arcondicionado,
            boolean direcaoIdraulica) {
        super(ano, modelo, cor, airbag, radio);
        this.arcondicionado = arcondicionado;
        this.direcaoIdraulica = direcaoIdraulica;
    }

    @Override 
    public float quantoCusta() {
        float custo = super.quantoCusta();
        if(arcondicionado) custo += 10000;
        if(direcaoIdraulica) custo += 15000;
        return  custo;
    }

    @Override
    public String toString() {
        return super.toString() + "AutomovelDeLuxo [arcondicionado=" + arcondicionado + 
        ", direcaoIdraulica=" + direcaoIdraulica + "]";
    }

    
}
