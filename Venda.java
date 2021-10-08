package SystemSale;

import SistemaImobiliario.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    public List<Cliente> clienteList = new ArrayList<>();
    public List<Vendedor> vendedorList = new ArrayList<>();
    private String DataDaCompra;
    private double ValorDaCompra;

    public Venda() {
    }

    public Venda(List<Cliente> clienteList, List<Vendedor> vendedorList, String dataDaCompra, double valorDaCompra) {
        this.clienteList = clienteList;
        this.vendedorList = vendedorList;
        DataDaCompra = dataDaCompra;
        ValorDaCompra = valorDaCompra;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public List<Vendedor> getVendedorList() {
        return vendedorList;
    }

    public void setVendedorList(List<Vendedor> vendedorList) {
        this.vendedorList = vendedorList;
    }

    public String getDataDaCompra() {
        return DataDaCompra;
    }

    public void setDataDaCompra(String dataDaCompra) {
        DataDaCompra = dataDaCompra;
    }

    public double getValorDaCompra() {
        return ValorDaCompra;
    }

    public void setValorDaCompra(double valorDaCompra) {
        ValorDaCompra = valorDaCompra;
    }

    public void adicionarCliente(Cliente novoCliente) {
        getClienteList().add(novoCliente);
    }

    public void adicionarVendedor(Vendedor novoVendedor) {
        getVendedorList().add(novoVendedor);
    }

    @Override
    public String toString() {
        return "\nVenda:" +
                "\nClientes:" + clienteList +
                "\nVendedores" + vendedorList +
                "\nData da Compra" + DataDaCompra +
                "\nValor da Compra" + ValorDaCompra;
    }
}
