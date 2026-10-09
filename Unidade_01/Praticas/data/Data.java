package data;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public void inicializaData(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
        if ( !dataEhValida()){
            dia = 1;
            mes = 1;
            ano = 1971;
        }
    }

    private boolean dataEhValida(){
        return(dia > 0 && dia <= 31 && mes > 0 && mes <=12 && ano >= 1);
    }

    public void mostraDta(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
