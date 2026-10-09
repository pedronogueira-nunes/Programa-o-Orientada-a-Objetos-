package pessoa;

public class Pessoa {
    private String nome;
    private float altura;

    public Pessoa(String nome, float altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome() {
        return("Nome: " + nome);
    }

    public void setNome(String nome) {
        if(!nome.isEmpty()) {
            this.nome = nome.toUpperCase();
        }
    }

    public float getAltura() {
        return(altura);
    }

    public void setAltura(float altura) {
        if(altura<= 1.6F) {
            this.altura = altura;
        }
    }

    public String toString() {
        return("Nome: " + nome + ",Altura: " + altura);
    }
}
