package SystemSale;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private static Scanner obterDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menuInicial() {
        System.out.println("Digite 1 para Clientes");
        System.out.println("Digite 2 para Vendedores");
        System.out.println("Digite 3 para Vendas");
        System.out.println("Digite 4 para Sair");
    }

    public static void menuCliente() {
        System.out.println("Digite 1 para cadastrar novo cliente");
        System.out.println("Digite 2 para ver todos os cadastros de clientes");
        System.out.println("Digite 3 para pesquisar compra de um determinado cliente");
        System.out.println("Digite 4 para voltar ao menu anterior");

    }

    public static void operacaoCliente() throws Exception {
        boolean menu2 = true;
        menuCliente();
        int opcaoCliente = obterDados("\nDigite a opção desejada").nextInt();
        while (menu2)
            if (opcaoCliente == 1) {
                cadastrarCliente();
            }
        if (opcaoCliente == 2) {
            ServiceCliente.exibirCliente();
        }
        if (opcaoCliente == 3) {
            pesquisarCompra();

        } else if (opcaoCliente == 4) {
            menu2 = false;
        }
    }

    public static void menuVendedor() {
        System.out.println("Digite 1 para cadastrar novo vendedor");
        System.out.println("Digite 2 para ver todos os cadastros de vendedores");
        System.out.println("Digite 3 para pesquisar venda de um determinado vendedor");
        System.out.println("Digite 4 para voltar ao menu anterior");

    }

    public static void operacaoVendedor() throws Exception {
        boolean menu3 = true;
        menuVendedor();
        int opcaoVendedor = obterDados("\nDigite a opção desejada:").nextInt();
        while (menu3) {
            if (opcaoVendedor == 1) {
                cadastrarVendedor();
            }
            if (opcaoVendedor == 2) {
                ServiceVendedor.exibirVendedor();
            } else if (opcaoVendedor == 3) {
                Sistema.pesquisarVenda();
            } else if (opcaoVendedor == 4) {
                menu3 = false;
            }
        }
    }

    public static void menuVenda() {
        System.out.println("Digite 1 para cadastrar nova venda");
        System.out.println("Digite 2 para ver todas as vendas");
        System.out.println("Digite 3 para voltar ao menu anterior");

    }

    public static void operacaoVenda() throws Exception {
        boolean menu4 = true;
        menuVenda();
        while (menu4) {
            int opcaoVenda = obterDados("\nDigite a opçao desejada:").nextInt();
            if (opcaoVenda == 1) {
                cadastrarVenda();
            }
            if (opcaoVenda == 2) {
                ServiceVenda.exibirVenda();
            } else if (opcaoVenda == 3) {
                menu4=false;
            }
        }

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

        return ServiceVenda.cadastrarVenda(dataDaCompra, valorDaCompra, cpfVendedor, cpfCliente);

    }

    public static List<Venda> pesquisarVenda()throws Exception {
        String cpf = obterDados("Digite o CPF vendedor que deseja pesquisar:").nextLine();
        ServiceVendedor.verificarVendedorCpf(cpf);
        List<Venda> vendasDoVendedor = ServiceVenda.pesquisarVendaCpf(cpf);
        return vendasDoVendedor;
    }

    public static List<Venda> pesquisarCompra()throws Exception {
        String cpf = obterDados("Digite o CPF do cliente que deseja pesquisar:").nextLine();
        ServiceCliente.verificarClienteCpf(cpf);
        List<Venda> comprasDoCliente = ServiceVenda.pesquisarComprasCpf(cpf);
        return comprasDoCliente;
    }
    public static void executar() throws Exception {
        boolean menu = true;
        menuInicial();
        int opcaoMenuInicial = obterDados("\nDigite a opção desejada:").nextInt();
        while (menu) {
            if (opcaoMenuInicial == 1) {
                operacaoCliente();

            }
            if (opcaoMenuInicial == 2) {
                operacaoVendedor();

            } else if (opcaoMenuInicial == 3) {
                operacaoVenda();

            } else if (opcaoMenuInicial == 4) {
                menu = false;
            } else {
                throw new Exception("Digite uma opção válida do menu");
            }
        }
    }


}


