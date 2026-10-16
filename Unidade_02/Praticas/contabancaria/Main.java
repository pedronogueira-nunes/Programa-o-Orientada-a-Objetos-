package Unidade_02.Praticas.contabancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Extrato extrato =  new Extrato();
        int opcao;
        float valor;
        Scanner ent = new Scanner(System.in);

        do {
            System.out.println("0-DEPOSITO");
            System.out.println("1-SAQUE");
            System.out.println("2-VER EXTRATO");
            System.out.println("3-ENCoutAR");
            System.out.println("OPÇÃO: ");
            opcao = ent.nextInt();

            switch(opcao) {
                case 0:
                    System.out.println("VALOR DO DEPOSITO: ");
                    valor = ent.nextFloat();
                    extrato.depositar(valor);
                    System.out.println("==============");
                    break;
                case 1:
                    System.out.println("VALOR DO SAQUE: ");
                    valor = ent.nextFloat();
                    extrato.depositar(-valor);
                    System.out.println("==============");
                    break;
                case 2:
                    System.out.println("EXTRATO");
                    valor = extrato.getSaldo();
                    System.err.println(valor);
                    System.out.println("==============");
                    break;
                case 3:
                    System.out.println("ENCoutADO");
                    System.out.println("=========");
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    System.out.println("==============");
            }
        } while (opcao != 3);

        ent.close();

    }
}
