package SystemSale;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("joao","88888","jjjjj");
        Vendedor vendedor = new Vendedor("carlos","09988","jiodjkvio");
        Venda venda = new Venda(vendedor,cliente,"09",90);
        System.out.println(venda);
    }
}
