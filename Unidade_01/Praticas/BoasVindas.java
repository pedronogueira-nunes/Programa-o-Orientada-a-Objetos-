import java.util.Scanner;

public class BoasVindas {
    public static void main(String[] args){
        String nome;
        System.out.print("Digite o seu nome: ");
        Scanner entrada = new Scanner(System.in);
        nome = entrada.next(); //next() RECEBE ATÉ QUE ENCOTRE UM ESPAÇO; nextline() RECEBE TODA A LINHA
        System.out.println("Bem vindo"+" "+nome);
        entrada.close();
    }
}
