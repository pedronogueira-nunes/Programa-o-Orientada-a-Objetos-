package Lista.lampada;

public class Lampada {
    public boolean estDaLamp;
    public int cont = 0;

    public Lampada(boolean estDaLamp) {
        this.estDaLamp = estDaLamp;
    }

    public void acende() {
        this.estDaLamp = true;
        cont++;

    }

    public void apaga() {
        this.estDaLamp = false;

    }

    public void mostraEstado() {
        if(this.estDaLamp == true) {
            System.out.println("A lampada está ligada");
        } 
        else {
            System.out.println("A lampada está desligada");
        }
    }

    public boolean estaLigada() {
        if(estDaLamp != true) {
            return(false);
        }
        return(true);
    }

    public String toString() {
        String res = "Quantidade de vezes que a lampada esteve ligada: " + cont;
        return(res);
    }


}
