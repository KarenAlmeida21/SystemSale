package SystemSale;

import SistemaImobiliario.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Vendedor vendedor;
    private Cliente cliente;
    private String DataDaCompra;
    private double ValorDaCompra;



    public Venda(Vendedor vendedor, Cliente cliente, String dataDaCompra, double valorDaCompra) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        DataDaCompra = dataDaCompra;
        ValorDaCompra = valorDaCompra;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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



    @Override
    public String toString() {
        return "Venda:" +
                "\nVendedor:" + vendedor +
                "\nCliente:" + cliente +
                "\nDataDaCompra'" + DataDaCompra +
                "\nValorDaCompra=" + ValorDaCompra;
    }
}
