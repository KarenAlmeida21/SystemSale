package SystemSale;

import java.util.ArrayList;
import java.util.List;

public class ServiceVendedor {
    private static List<Vendedor> vendedorList = new ArrayList<>();

    public static List<Vendedor> getVendedorList() {
        return vendedorList;
    }

    public static void setVendedorList(List<Vendedor> vendedorList) {
        ServiceVendedor.vendedorList = vendedorList;
    }

    //cadastrar vendedor
    public static Vendedor cadastrarVendedor(String nome, String cpf, String email) throws Exception {
        Vendedor vendedor = new Vendedor(nome, cpf, email);
        vendedorList.add(vendedor);
        return vendedor;
    }

    public static Vendedor verificarrVendedorCpf(String cpf) throws Exception {
        for (Vendedor percorrerList : vendedorList) {
            if (percorrerList.getCpf().equals(cpf)) {

                return percorrerList;
            }
        }
        throw new Exception("Não Cadastrado");


    }


    public static void exibirVendedor() {
        for (Vendedor percorrerList : vendedorList) {
            System.out.println(percorrerList);

        }
    }

}
