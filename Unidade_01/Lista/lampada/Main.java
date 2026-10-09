package Lista.lampada;

public class Main {
    public static void main(String[] args) {
        Lampada lamp = new Lampada(false);

        lamp.acende();
        lamp.apaga();
        lamp.estaLigada();
        lamp.mostraEstado();

        System.out.println(lamp.toString());
    }
}
