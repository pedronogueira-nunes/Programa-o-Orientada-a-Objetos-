package Unidade_02.Lista.abstratas.biblioteca;

public interface ItemDeBiblioteca {
    int MaximoDeDiasParaEmprestimo = 14;

    public String estaEmprestado();
    public void empresta();
    public void devolve();
    public String localizacao();
    public String descricao();
}
