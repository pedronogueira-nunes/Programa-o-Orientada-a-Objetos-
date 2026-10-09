package banco;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria contal = new ContaBancaria("Paulo", 123.4F, false);
        System.out.println(contal.toString());

        ContaBancaria contal2 = new ContaBancaria("João");
        System.out.println(contal2.toString());
    }
}
