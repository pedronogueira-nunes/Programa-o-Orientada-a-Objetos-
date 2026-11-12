package Unidade_02.Lista.abstratas.biblioteca;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private boolean emprestado;
    private String localizacao;
    private String descricao;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDaEdicao,
        String localizacao, String descricao) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.localizacao = localizacao;
        this.descricao = descricao;
        this.emprestado = false;
    }

    public String estaEmprestado() {
        if(emprestado ==  true) return "Emprestado";
        else return "Disponivel";
    }

    public void empresta() {
        emprestado = true;
    }

    public void devolve() {
        emprestado = false;
    }

    public String localizacao() {
        return localizacao;
    }

    public String descricao() {
        return descricao;
    }

    public String toString() {
        String ret = super.toString() + "Descrição: " + descricao;
        ret += "Emprestado: " + emprestado + "Localização: " + localizacao;
        return ret;
    }

}
