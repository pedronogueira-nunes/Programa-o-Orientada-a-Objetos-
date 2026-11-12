package Unidade_02.Lista.reuso.livro;

public abstract class Livro {
    protected int id;
    protected String titulo;
    protected String genero;

    public Livro(int id, String titulo, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
    }

    public String toString() {
        return "Titulo: " + titulo + " genero: " + genero;
    }

}
