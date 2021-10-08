package SystemSale;

import java.util.ArrayList;
import java.util.List;

public class ServiceCliente {
    private static List<Cliente>clientesList =new ArrayList<>();

    //cadastrar cliente na lista
    public static Cliente cadastrarCliente(String nome,String cpf, String email){
       Cliente cliente = new Cliente(nome,cpf,email);
       clientesList.add(cliente);
       return cliente;
    }
    //exibir lista de cliente
    public static void exibirCliente (){
        for (Cliente percorrerList:clientesList) {
            System.out.println(percorrerList);

        }

    }

}
