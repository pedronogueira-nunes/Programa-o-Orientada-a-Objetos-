import java.util.Scanner;

public class Data {
    public static void main(String[] args){
        int dia, mes, ano;
        Scanner entrada =new Scanner(System.in);
        System.out.print("Digite o dia: ");
        dia = entrada.nextInt();
        System.out.print("Digite o mes: ");
        mes = entrada.nextInt();
        System.out.print("Digite o ano: ");
        ano = entrada.nextInt();
        
        if(mes==1){
            System.out.println(dia + " de janeiro de " + ano);
        } else if(mes==2){
            System.out.println(dia + " de fervereiro de " + ano);
        } else if(mes==3){
            System.out.println(dia + " de março de  " + ano);
        } else if(mes==4){
            System.out.println(dia + " de abriu de " + ano);
        } else if(mes==5){
            System.out.println(dia + " de maio de " + ano);
        } else if(mes==6){
            System.out.println(dia + " de junho de " + ano);
        } else if(mes==7){
            System.out.println(dia + " de julho de " + ano);
        } else if(mes==8){
            System.out.println(dia + " de agosto " + ano);
        } else if(mes==9){
            System.out.println(dia + " de setembro " + ano);
        } else if(mes==10){
            System.out.println(dia + " de outubro " + ano);
        } else if(mes==11){
            System.out.println(dia + " de novembro " + ano);
        } else if(mes==12){
            System.out.println(dia + " de dezembro " + ano);
        } else {
            System.out.println("Este mês não existe\n");
        }

        switch(mes){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Este mês tem 31 dias");
            break;
            case 2:
                System.out.println("Este mês pode ter 28 ou 29 dias");
            break;
            case 4, 6, 9, 11:
                System.out.println("Este mês possui 30 dias");
            break;
            default:
                System.out.println("Error");
            break;
        }

        entrada.close();
    }
    
}
