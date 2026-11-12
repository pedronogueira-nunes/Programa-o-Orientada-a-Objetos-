package Unidade_02.Lista.reuso.livro;

public class LivroBiblioteca extends Livro {
    public String dataDeEntrega;

    public LivroBiblioteca(int id, String titulo, String genero, String dataDeEntrega) {
        super(id, titulo, genero);
        this.dataDeEntrega = dataDeEntrega;
    }

    public String toString() {
        return super.toString() + " Data de devolução: " + dataDeEntrega;
    }

}
