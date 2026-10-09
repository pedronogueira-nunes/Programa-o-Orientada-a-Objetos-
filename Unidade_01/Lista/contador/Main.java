package Lista.contador;

public class Main {
    public static void main(String[] args) {
        Contador evento = new Contador(2);

        evento.zerar();
        evento.incrementar();

        System.out.println(evento.toString());

    }
}
