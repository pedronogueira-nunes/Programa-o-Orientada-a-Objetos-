package Unidade_02.Lista.reuso.equipamento;

public class Computador extends Equipamento {
    private String modelo;
    private int quantidade;

    public Computador(String nome, float preco, String modelo, int quantidade) {
        super(nome, preco);
        this.modelo = modelo;
        this.quantidade = quantidade;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String toString() {
        return (super.toString() + "Modelo: " + modelo + " Quantidade: " + quantidade);
    }
}
