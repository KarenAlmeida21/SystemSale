package SystemSale;

import java.util.ArrayList;
import java.util.List;

public class ServiceVendedor {
    private static List<Vendedor> vendedorList =new ArrayList<>();

//cadastrar vendedor
    public static Vendedor cadastrarVendedor(String nome,String cpf, String email){
        Vendedor vendedor = new Vendedor(nome,cpf,email);
        vendedorList.add(vendedor);
        return vendedor;
    }
    //exibir lista de vendedores
    public static void exibirVendedor(){
        for (Vendedor percorrerList: vendedorList) {
            System.out.println(percorrerList);
            
        }
    }

}
