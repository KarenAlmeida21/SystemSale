package SystemSale;

import java.util.ArrayList;
import java.util.List;

public class ServiceVenda {
    private static List<Venda> vendaList = new ArrayList<>();

    public ServiceVenda() {
    }

    public static Venda cadastrarVenda(String datadaCompra, double valorDaCompra, String cpfVendedor, String cpfCliente) throws Exception {
        Cliente cliente = ServiceCliente.verificarClienteCpf(cpfCliente);
        Vendedor vendedor = ServiceVendedor.verificarVendedorCpf(cpfVendedor);
        Venda venda = new Venda(vendedor, cliente, datadaCompra, valorDaCompra);
        vendaList.add(venda);
        return venda;
    }

    public static List<Venda> pesquisarVendaCpf(String cpf) {
        List<Venda> vendasDoVendedor = new ArrayList<>();
        for (Venda vendaReferencia : vendasDoVendedor) {
            if (vendaReferencia.getVendedor().getCpf().equals(cpf)) {
                vendasDoVendedor.add(vendaReferencia);
            }
        }
        return vendasDoVendedor;
    }

    public static List<Venda> pesquisarComprasCpf(String cpf) throws Exception{
        List<Venda> comprasDoCliente = new ArrayList<>();
        for (Venda compraReferencia : comprasDoCliente) {
            if (compraReferencia.getCliente().getCpf().equals(cpf)) {
                comprasDoCliente.add(compraReferencia);

            }
        }
        return comprasDoCliente;

    }


    public static void exibirVenda() {
        for (Venda percorrerList : vendaList) {
            System.out.println(percorrerList);

        }
    }
}








