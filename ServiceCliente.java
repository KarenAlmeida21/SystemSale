package SystemSale;

import java.util.ArrayList;
import java.util.List;

public class ServiceCliente {
    private static List<Cliente>clientesList =new ArrayList<>();

    //cadastrar cliente na lista
    public static Cliente cadastrarCliente(String nome,String cpf, String email) throws Exception{
       Cliente cliente = ServiceCliente.verificarClienteCadastrado(cpf);
       clientesList.add(cliente);
       return cliente;
    }

    //exibir lista de cliente
    public static void exibirCliente (){
        for (Cliente percorrerList:clientesList) {
            System.out.println(percorrerList);

        }
    }
    //verificar se o cliente está cadastrado
    public static Cliente verificarClienteCadastrado (String cpf) throws Exception{
        for (Cliente percorrerList:clientesList) {
           if(percorrerList.getCpf().equals(cpf)){
               return percorrerList;


           }
           }
        throw new Exception("Cliente não cadastrado");
        }

}
