package faculdade;

public class RegistroAcademico {
    private String nome;
    @SuppressWarnings("unused")
    private String matricula;
    private int codigoDoCurso;
    private float percentualDeCobranca;
    
    public void inicializaRegistroAcademico(String n, String m, int c, float p) {
        nome = n;
        matricula = m;
        codigoDoCurso = c;
        percentualDeCobranca = p;
    }
    public String getNome() {
        return(nome);
    }

    public float calculaMensalidade() {
        return(100*codigoDoCurso*percentualDeCobranca);
    }
}
