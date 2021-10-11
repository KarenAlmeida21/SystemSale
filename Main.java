package SystemSale;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean menuPrincipal = true;
        while (menuPrincipal) {
            try {

                menuPrincipal=Sistema.executar();

            } catch (Exception erro) {
                System.out.println(erro.getMessage());
            }
        }
    }
}

