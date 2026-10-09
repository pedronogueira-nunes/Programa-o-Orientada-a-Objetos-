package Lista.contador;

public class Contador {
    private int numEvent;
    

    public Contador(int numEvent) {
        this.numEvent = numEvent;
    }

    public void zerar() {
        this.numEvent = 0;
    }

    public void incrementar() {
        this.numEvent++;
    }

    public String toString() {
        String res = "Número de eventos: " + this.numEvent;
        return(res);
    }
}
