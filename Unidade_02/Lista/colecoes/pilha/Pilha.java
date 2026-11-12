package Unidade_02.Lista.colecoes.pilha;

import java.util.Stack;
import java.util.Scanner;

public class Pilha {
    public static void main(String[] args) {
        String parenteses;
        Scanner ent = new Scanner(System.in);
        Stack<String> p = new Stack<>();
        System.out.println("Digite os parenteses: ");
        parenteses = ent.nextLine();

        ent.close();

        for(char pa : parenteses.toCharArray()) {
            if('(' == pa) {
                p.push(parenteses);
            } else if(')' == pa) {
                if(p.isEmpty()) {
                    System.out.println("Erro");
                    return;
                }
                p.pop();
            }
        }

        if(!p.isEmpty()) {
            System.out.println("Não está balanceada");
        } else {
            System.out.println("Balanceada");
        }

    }
}
