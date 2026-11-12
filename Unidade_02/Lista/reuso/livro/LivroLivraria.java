package Unidade_02.Lista.reuso.livro;

public class LivroLivraria extends Livro {
    private float preco;

    public LivroLivraria(int id, String titulo, String genero, float preco) {
        super(id, titulo, genero);
        this.preco = preco;
    }

    public String toString() {
        return super.toString() + " Preço: " + preco;
    }
    
}
