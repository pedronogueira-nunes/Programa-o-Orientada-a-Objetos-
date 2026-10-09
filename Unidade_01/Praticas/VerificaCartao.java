import java.time.LocalDate;
import java.util.Scanner;
import java.time.LocalDate;
public class VerificaCartao {
    public static void main(String[] args){
        String nome;
        String numero;
        String codigo;
        int mes;
        int ano;
        boolean vencido;

        LocalDate hoje = LocalDate.now();
        int anoAtual = hoje.getYear();
        int mesAtual = hoje.getMonthValue();

        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome: ");
        nome = entrada.nextLine();
        System.out.print("Número: ");
        numero = entrada.nextLine();
        System.out.print("Código: ");
        codigo = entrada.nextLine();

        do{
        System.out.print("Mês: ");
        mes = entrada.nextInt();
        System.out.print("Ano: ");
        ano = entrada.nextInt();

        vencido = (ano<anoAtual || (ano==anoAtual && mes<mesAtual));
        } while(vencido);

        System.out.println("Cartão validado");

        entrada.close();
    }
}
