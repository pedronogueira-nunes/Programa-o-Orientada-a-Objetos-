package faculdade;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();
        michael.inicializaRegistroAcademico("Michael", "20250964298", 2, 0.6F);
        float mensalidade = michael.calculaMensalidade();
        System.out.println("A mensalidade de " + michael.getNome() + " eh " + mensalidade);
        
        RegistroAcademico roberto = new RegistroAcademico();
        float mensalidade2 = roberto.calculaMensalidade();
        System.out.println("A mensalidade de " + roberto.getNome() + " eh " + mensalidade2);
    }
}
