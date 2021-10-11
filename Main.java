package SystemSale;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean continuar = true;
        while (continuar) {
            try {

                continuar=Sistema.executar();

            } catch (Exception erro) {
                System.out.println(erro.getMessage());
            }
        }
    }
}

