package SystemSale;

import java.util.ArrayList;
import java.util.List;

public class ServiceVenda {
    private static List<Venda> vendaList =new ArrayList<>();

    public static Venda cadastrarVenda(String datadaCompra, double valorDaCompra, Cliente cliente, Vendedor vendedor){
        Venda venda = new Venda(vendedor,cliente, datadaCompra, valorDaCompra);
        vendaList.add(venda);
        return venda;
    }



    public static void exibirVenda(){
        for (Venda percorrerList:vendaList) {
            System.out.println(percorrerList);

        }
    }
}
