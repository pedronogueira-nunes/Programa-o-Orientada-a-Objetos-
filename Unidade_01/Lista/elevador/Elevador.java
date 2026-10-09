package Lista.elevador;

public class Elevador {
    private int andarAtual;
    private int totAndar;
    private int capEleva;
    private int pessPresentes;

    public Elevador(int totAndar, int capEleva) {
        this.andarAtual = 0;
        this.totAndar = totAndar;
        this.capEleva = capEleva;
        this.pessPresentes = 0;
    }

    public void entra() {
        if(this.pessPresentes < capEleva) {
            this.pessPresentes++;
        }
    }

    public void sair() {
        if(this.pessPresentes > 0) {
            this.pessPresentes--;
        }
    }

    public void sobe() {
        if(andarAtual < totAndar) {
            andarAtual++;
        }
    }

    public void desce() {
        if(andarAtual > 0) {
            andarAtual--;
        }
    }

    public String toString() {
        String res = "Andar atual: " + andarAtual;
        res += "\nQuantidade de pessoas no elevador: " + pessPresentes;
        return(res);
    }

}
