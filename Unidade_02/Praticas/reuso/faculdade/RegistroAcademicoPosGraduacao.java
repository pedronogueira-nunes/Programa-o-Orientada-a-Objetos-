package Unidade_02.reuso.faculdade;

public class RegistroAcademicoPosGraduacao {
    private RegistroAcademico reg;
    private String tese;
    private String orientador;

    /* 
    public RegistroAcademicoPosGraduacao(RegistroAcademico reg, String tese, String orientador) {
        this.reg = reg;
        this.tese = tese;
        this.orientador = orientador;
    }
    */

    public RegistroAcademicoPosGraduacao(String nomeAluno, String matricula, String curso, String tese, String orientador) {
        this.reg = new RegistroAcademico(nomeAluno, matricula, curso);
        this.tese = tese;
        this.orientador = orientador;
    }

    @Override
    public String toString() {
        return "RegistroAcademicoPosGraduacao [reg=" + reg + ", tese=" + tese + ", orientador=" + orientador + "]";
    }
    
}
