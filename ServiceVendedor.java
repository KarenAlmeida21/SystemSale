package SystemSale;

import java.util.ArrayList;
import java.util.List;

public class ServiceVendedor {
    private static List<Vendedor> vendedorList =new ArrayList<>();

    public static List<Vendedor> getVendedorList() {
        return vendedorList;
    }
    public static void setVendedorList(List<Vendedor> vendedorList) {
        ServiceVendedor.vendedorList = vendedorList;
    }

//cadastrar vendedor
    public static Vendedor cadastrarVendedor(String nome,String cpf, String email) throws Exception{
        Vendedor vendedor = ServiceVendedor.verificarVendedorCadastrado(cpf);
        vendedorList.add(vendedor);
        return vendedor;

    }


   //verificar se o vendedor está cadastrado

    public static Vendedor verificarVendedorCadastrado(String cpf) throws Exception{
        for (Vendedor percorrerList:vendedorList) {
            if(percorrerList.getCpf().equals(cpf)){
                return percorrerList;
            }
        }
        throw new Exception("Vendedor não cadastrado");

        }

    //exibir lista de vendedores
    public static void exibirVendedor(){
        for (Vendedor percorrerList: vendedorList) {
            System.out.println(percorrerList);
            
        }
    }

}
