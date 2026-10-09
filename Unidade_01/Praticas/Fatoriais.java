import java.util.Scanner;
public class Fatoriais {
    public static void main(String[] args){
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = entrada.nextInt();

        for(int i = 0; i <= num; i++){

            int fatorial = 1;
            for(int j = i; j >= 1; j--){
                fatorial *= j;
            }
            System.out.println("Fatorial (" + i + ") =" + fatorial);
        }
        entrada.close();
    }
}
