package SystemSale;

import java.util.ArrayList;
import java.util.List;

public class ServiceCliente {
    private static List<Cliente> clientesList = new ArrayList<>();

    //cadastrar cliente na lista
    public static Cliente cadastrarCliente(String nome, String cpf, String email) throws Exception {
        Cliente cliente = new Cliente(nome, cpf, email);
        clientesList.add(cliente);
        return cliente;
    }

    public static Cliente verificarClienteCpf(String cpf) throws Exception {
        for (Cliente clienteReferencia : clientesList) {
            if (clienteReferencia.getCpf().equals(cpf)) {
                return clienteReferencia;
            }
        }
        throw new Exception("Não Cadastrado");
    }


    //exibir lista de cliente
    public static void exibirCliente() {
        for (Cliente percorrerList : clientesList) {
            System.out.println(percorrerList);
        }
    }


}



