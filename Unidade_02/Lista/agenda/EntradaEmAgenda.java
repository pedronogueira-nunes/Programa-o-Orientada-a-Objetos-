package Unidade_02.Lista.agenda;

public class EntradaEmAgenda {
    private int dia;
    private int mes;
    private int ano;
    private String assunto;

    public EntradaEmAgenda(int dia, int mes, int ano, String assunto) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    /* 
    public int verificaDia(int dia, int mes) {
        int diaValido = 0;

        if(0 < mes && mes < 13) {
            switch(mes) {
                case 4, 6, 9, 11:
                    if(0 < dia && dia < 31) {
                        diaValido = dia;
                    }
                    break;
                case 1, 3, 5, 7, 8, 10, 12:
                    if(0 < dia && dia < 32) {
                        diaValido = dia;
                    }
                    break;
                case 2:
                    if(0 < dia && dia < 30) {
                        diaValido = dia;
                    }
            }
        } else {
            System.out.println("ESTE MÊS NÃO EXISTE");
        }

        return diaValido;
        }

*/

}
