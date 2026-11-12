package Unidade_02.Lista.arrays.clientes;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(55, "Paulo", 22, "(84) 9 5152-9196");
        Cliente c2 = new Cliente(92, "José", 31, "(83) 9 2356-4574");
        Cliente c3 = new Cliente(1, "Ana", 19, "(88) 9 1541-6489");
        ArrayList<Cliente> c = new ArrayList<>(Arrays.asList(c1, c2, c3));
        
        System.out.println(c.toString());
    }
}
