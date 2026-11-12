package Unidade_02.Lista.abstratas.biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoDaEdicao;

    public Livro(String titulo, String autor, int numeroDePaginas, int anoDaEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDaEdicao = anoDaEdicao;
    }

    public String qualTitulo() {
        return titulo;
    }

    public String qualAutor() {
        return autor;
    }

    public String toString() {
        String ret = "Titulo: " + titulo + "Autor: " + autor;
        ret += "Ano da edição: " + anoDaEdicao + "Número de páginas: " + numeroDePaginas;
        return ret;
    }

}
