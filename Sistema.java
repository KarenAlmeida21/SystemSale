package SystemSale;


import java.util.List;
import java.util.Scanner;


public class Sistema {
    private static Scanner obterDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }


    public static void encerrarMenus() {
        System.out.println("Você será direcionado ao menu anterior\n");
    }

    public static void encerrarMenuPrincipal() {
        System.out.println("Obrigado.Volte sempre.\n");
    }

    public static void opcaoInvalida() {
        System.out.println("Digite uma opção do menu");
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

        System.out.println("Digite o valor da compra");
        double valorDaCompra = obterDados("R$ ").nextDouble();
        String cpfVendedor = obterDados("Digite o CPF do vendedor responsável pela venda").nextLine();
        String cpfCliente = obterDados("Digite o CPF do cliente que realizara a compra").nextLine();
        return ServiceVenda.cadastrarVenda(dataDaCompra, valorDaCompra, cpfVendedor, cpfCliente);

    }

    public static List<Venda> pesquisarVenda() throws Exception {
        String cpf = obterDados("Digite o CPF vendedor que deseja pesquisar:").nextLine();
        ServiceVendedor.verificarVendedorCpf(cpf);
        List<Venda> vendaList = ServiceVenda.pesquisarVendaCpf(cpf);
        return vendaList;
    }

    public static List<Venda> pesquisarCompra() throws Exception {
        String cpf = obterDados("Digite o CPF do cliente que deseja pesquisar:").nextLine();
        ServiceCliente.verificarClienteCpf(cpf);
        List<Venda> vendaList = ServiceVenda.pesquisarComprasCpf(cpf);
        return vendaList;
    }


    public static void menuInicial() {
        System.out.println("Sistema de Cadastro Lojas Baby\n");
        System.out.println("Escreva cliente");
        System.out.println("Escreva vendedores");
        System.out.println("Escreva Compras ou Vendas");
        System.out.println("Escreva sair");
    }

    public static void menuCliente() {
        System.out.println("Digite 1 para cadastrar novo cliente");
        System.out.println("Digite 2 para ver todos os cadastros de clientes");
        System.out.println("Digite 3 para voltar ao menu anterior");

    }

    public static void operacaoCliente() throws Exception {
        boolean menu = true;
        menuCliente();
        int opcaoCliente = obterDados("\nDigite a opção desejada").nextInt();
        while (menu) {

            if (opcaoCliente == 1) {

                cadastrarCliente();
                break;
            }
            if (opcaoCliente == 2) {

                ServiceCliente.exibirCliente();
                if (ServiceCliente.getClientesList().size() == 0) {
                    System.out.println("Não há clientes cadastrados");
                }
                break;

            } else if (opcaoCliente == 3) {
                encerrarMenus();
                menu = false;
                executar();
            } else {
                opcaoInvalida();
                break;
            }
        }
    }

    public static void menuVendedor() {
        System.out.println("Digite 1 para cadastrar novo vendedor");
        System.out.println("Digite 2 para ver todos os cadastros de vendedores");
        System.out.println("Digite 3 para voltar ao menu anterior");

    }

    public static void operacaoVendedor() throws Exception {
        boolean menu = true;
        menuVendedor();
        int opcaoVendedor = obterDados("\nDigite a opção desejada:").nextInt();
        while (menu) {

            if (opcaoVendedor == 1) {
                cadastrarVendedor();
                break;
            }
            if (opcaoVendedor == 2) {
                ServiceVendedor.exibirVendedor();
                if (ServiceVendedor.getVendedorList().size() == 0) {
                    System.out.println("Não há vendedores cadastrados");
                }
                break;
            } else if (opcaoVendedor == 3) {

                encerrarMenus();
                menu = false;
                executar();
            } else {
                opcaoInvalida();
                break;

            }
        }
    }


    public static void menuVenda() {
        System.out.println("Digite 1 para cadastrar nova venda");
        System.out.println("Digite 2 para ver todas as vendas");
        System.out.println("Digite 3 para pesquisar compra de um determinado cliente");
        System.out.println("Digite 4 para pesquisar venda de um determinado vendedor");
        System.out.println("Digite 5 para voltar ao menu anterior");

    }

    public static void operacaoVenda() throws Exception {
        boolean menu = true;
        menuVenda();
        System.out.println("Digite 4 para Fechar o Sistema");

        while (menu) {
            int opcaoVenda = obterDados("\nDigite a opçao desejada:").nextInt();
            if (opcaoVenda == 1) {

                cadastrarVenda();
                break;
            }
            if (opcaoVenda == 2) {

                ServiceVenda.exibirVenda();
                if (ServiceVenda.getVendaList().size() == 0) {
                    System.out.println("Não há vendas cadastradas\n");
                }
                break;
            }
            if (opcaoVenda == 3) {

                System.out.println(pesquisarCompra());
                break;
            }
            if (opcaoVenda == 4) {

                System.out.println(pesquisarVenda());
                break;
            } else if (opcaoVenda == 5) {

                encerrarMenus();
                menu = false;
                executar();

            } else {
                opcaoInvalida();
                break;
            }
        }
    }

    public static boolean executar() throws Exception {
        boolean menuPrincipal = true;
        menuInicial();


        String opcaoMenuInicial = obterDados("Escreva a opção que você quer acessar ").nextLine();
        while (menuPrincipal) {
            if (opcaoMenuInicial.equalsIgnoreCase("clientes")) {
                operacaoCliente();

            }
            if (opcaoMenuInicial.equalsIgnoreCase("vendedores")) {
                operacaoVendedor();

            } else if (opcaoMenuInicial.equalsIgnoreCase("vendas") | opcaoMenuInicial.equalsIgnoreCase("compras")) {
                operacaoVenda();

            } else if (opcaoMenuInicial.contains("sair")) {

                encerrarMenuPrincipal();
                menuPrincipal = false;

            } else {
                opcaoInvalida();
                break;
            }
            break;

        }


        return menuPrincipal;

    }


}


