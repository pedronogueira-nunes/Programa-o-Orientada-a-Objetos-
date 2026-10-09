package Lista.elevador;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(15, 5);

        elevador.entra();
        elevador.sobe();
        elevador.sobe();
        elevador.entra();
        elevador.entra();
        elevador.sair();
        elevador.sobe();
        elevador.sair();
        elevador.sair();
        elevador.desce();
        elevador.entra();


        System.out.println(elevador.toString());
    }
}
