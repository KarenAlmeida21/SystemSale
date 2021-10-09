package SystemSale;

public class Main {
    public static void main(String[] args) {
        try {

            Sistema.cadastrarVendedor();
            Sistema.cadastrarCliente();
            Sistema.cadastrarVenda();
            Sistema.pesquisarVenda();



        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }

    ;
}

