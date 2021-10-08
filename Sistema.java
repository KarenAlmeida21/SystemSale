package SystemSale;

import java.util.Scanner;

public class Sistema {
    private static Scanner obterDados (String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static void menu(){
        System.out.println("Digite 1 para cadastrar uma venda");
        System.out.println("Digite 2 para exibir os dados da venda");
        System.out.println("Digite 3 para sair");
    }
public static Cliente cadastrarCliente(){
     String nomeCliente = obterDados("Digite o nome do cliente:").nextLine();
     String cpfCliente = obterDados("Digite o cpf do cliente:").nextLine();
     String emailCliente =obterDados("Digite o e-mail do cliente:").nextLine();
     return ServiceCliente.cadastrarCliente(nomeCliente,cpfCliente,emailCliente);
}
public static Vendedor cadastrarVendedor(){
        String nomeVendedor =obterDados("Digite o nome do vendedor:").nextLine();
        String cpfVendedor = obterDados("Digite o cpf do vendedor").nextLine();
        String emailVendedor = obterDados("Digite o e-mail do vendedor:").nextLine();
        return ServiceVendedor.cadastrarVendedor(nomeVendedor,cpfVendedor,emailVendedor);
}

}
}
