package Unidade_02.Lista.reuso.equipamento;

public class TesteEquipamento {
    public static void main(String[] args) {
        Equipamento e = new Equipamento("mouse", 75);
        Computador c = new Computador("notebook", 3300,
        "inspiron 3501", 50);


        System.out.println(e.toString());
        System.out.println(c.toString());
    }
}
