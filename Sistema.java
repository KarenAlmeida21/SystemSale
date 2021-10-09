package SystemSale;

import java.util.Scanner;

public class Sistema {
    private static Scanner obterDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("Digite 1 para cadastrar cliente");
        System.out.println("Digite 2 para cadastrar vendedor");
        System.out.println("Digite 3 para exibir clientes cadastrados");
        System.out.println("Digite 4 para vendedores cadastrados");
    }

    public static Cliente cadastrarCliente() throws Exception {
        String nomeCliente = obterDados("Digite o nome do cliente:").nextLine();
        String cpfCliente = obterDados("Digite o cpf do cliente:").nextLine();
        String emailCliente = obterDados("Digite o e-mail do cliente:").nextLine();
        return ServiceCliente.cadastrarCliente(nomeCliente, cpfCliente, emailCliente);
    }

    public static Vendedor cadastrarVendedor() throws Exception {
        String nomeVendedor = obterDados("Digite o nome do vendedor:").nextLine();
        String cpfVendedor = obterDados("Digite o cpf do vendedor").nextLine();
        String emailVendedor = obterDados("Digite o e-mail do vendedor:").nextLine();
        return ServiceVendedor.cadastrarVendedor(nomeVendedor, cpfVendedor, emailVendedor);
    }


    public static Venda cadastrarVenda() throws Exception {
        String dataDaCompra = obterDados("Digite a data da compra").nextLine();
        double valorDaCompra = obterDados("Digite o valor da compra").nextDouble();
       String cpfVendedor = obterDados("Digite o CPF do vendedor responsável pela venda").nextLine();
        String cpfCliente = obterDados("Digite o CPF do cliente que realizara a compra").nextLine();

        return ServiceVenda.cadastrarVenda(dataDaCompra, valorDaCompra,cpfVendedor,cpfCliente);

    }






}