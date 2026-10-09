package Lista.generico;

public class Generico<T> {
    private T primeiroAt;
    private T segundoAt;
    private T terceiroAt;

    public Generico(T primeiroAt, T segundoAt, T terceiroAt) {
        this.primeiroAt = primeiroAt;
        this.segundoAt = segundoAt;
        this.terceiroAt = terceiroAt;
    }

    public int Iguais() {
        int cont = 1;
        if(this.primeiroAt.equals(this.segundoAt)) {
            cont++;
        }
        if(this.primeiroAt.equals(this.terceiroAt)) {
            cont++;
        }
        if(cont == 1) {
            if(this.segundoAt.equals(this.terceiroAt)) {
                cont++;
            }
        }

        return(cont);
    }

    public void mostrarAtributo() {
        System.out.println(primeiroAt);
        System.out.println(segundoAt);
        System.out.println(terceiroAt);
    }

}
