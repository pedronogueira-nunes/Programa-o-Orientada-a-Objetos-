import java.util.Scanner;
public class FatorialRecursivo {
    public static void main(String[] args){
        int num, fat;

        System.out.print("Número: ");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();

        fat = fatorial(num);
        System.out.println("Fatorial de " + num + " = " + fat);

        entrada.close();
    }

    public static int fatorial(int n){
        if(n == 0){
            return(1);
        } else{
            return(n *fatorial(n - 1));
        }
    }
}

