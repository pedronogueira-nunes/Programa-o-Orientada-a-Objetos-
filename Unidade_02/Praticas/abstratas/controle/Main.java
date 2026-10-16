package Unidade_02.Praticas.abstratas.controle;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro(5, 4, "BRA2E19");
        Aviao a1 = new Aviao(100, "AV-001", "ANAC-001");
        Barco b1 = new Barco(10, 50, "9562858");
        Bicicleta b2 = new Bicicleta(2, 2, "Preta");

        Controle.controlar(c1);
        Controle.controlar(b1);
        Controle.controlar(a1);
        Controle.controlar(b2);
    }
}
