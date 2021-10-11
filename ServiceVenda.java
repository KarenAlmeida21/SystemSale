package SystemSale;

import java.util.ArrayList;
import java.util.List;


public class ServiceVenda {
    private static List<Venda> vendaList = new ArrayList<>();


    public ServiceVenda() {
    }

    public static List<Venda> getVendaList() {
        return vendaList;
    }

    public static Venda cadastrarVenda(String datadaCompra, double valorDaCompra, String cpfVendedor, String cpfCliente) throws Exception {
        Cliente cliente = ServiceCliente.verificarClienteCpf(cpfCliente);
        Vendedor vendedor = ServiceVendedor.verificarVendedorCpf(cpfVendedor);;
        Venda venda = new Venda(vendedor, cliente, datadaCompra, valorDaCompra);
        vendaList.add(venda);
        return venda;
    }

    public static List<Venda> pesquisarVendaCpf(String cpf) throws Exception {
        List<Venda> vendasVendedor = new ArrayList<>();
        for (Venda vendaReferencia : vendaList) {
            if (vendaReferencia.getVendedor().getCpf().equals(cpf)) {
                vendasVendedor.add(vendaReferencia);


            }
        }
        return vendasVendedor;
    }

    public static List<Venda> pesquisarComprasCpf(String cpf) throws Exception {
        List<Venda> comprasCliente = new ArrayList<>();
        for (Venda compraReferencia : vendaList) {
            if (compraReferencia.getCliente().getCpf().equals(cpf)) {
                comprasCliente.add(compraReferencia);

            }
        }
        return comprasCliente;
    }

    //exibir lista de cliente
    public static void exibirVenda() {
        for (Venda vendedorReferencia : vendaList) {
            System.out.println(vendedorReferencia);

        }
    }

}









