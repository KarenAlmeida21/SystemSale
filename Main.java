package SystemSale;

public class Main {
    public static void main(String[] args) {
        try {
            Sistema.cadastrarVendedor();
            Sistema.cadastrarVenda();


        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }

    ;
}

