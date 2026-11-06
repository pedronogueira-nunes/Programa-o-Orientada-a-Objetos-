package Unidade_02.Lista.arrays.agenda;

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

	@Override
	public String toString() {
		return "EntradaEmAgenda [dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", assunto=" + assunto + "]";
	}

    public boolean ehNoDia(int dia, int mes, int ano) {
        if(dia == this.dia && mes == this.mes && ano == this.ano) {
            return(true);    
        }
        else {
            return(false);
        }
    }


}
