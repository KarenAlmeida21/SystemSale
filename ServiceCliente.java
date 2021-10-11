package SystemSale;

import java.util.ArrayList;
import java.util.List;

public class ServiceCliente {
    private static List<Cliente> clientesList = new ArrayList<>();

    public static List<Cliente> getClientesList() {
        return clientesList;
    }

    public static void setClientesList(List<Cliente> clientesList) {

        ServiceCliente.clientesList = clientesList;
    }

    //cadastrar cliente na lista
    public static Cliente cadastrarCliente(String nome, String cpf, String email) throws Exception {
        constatarClienteCpf(cpf);
        constatarClienteEmail(email);
        validarEmailCliente(email);
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
        throw new Exception("Cliente Não Cadastrado");
    }


    public static void validarEmailCliente(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("Verifique o e-mail e digite novamente");
        }
    }


    public static void constatarClienteCpf(String cpf) throws Exception {
        for (Cliente clienteReferencia : clientesList) {
            if (clienteReferencia.getCpf().equals(cpf)) {
                throw new Exception("CPF já cadastrado.Verifique cadastro");
            }
        }
    }


    public static void constatarClienteEmail(String email) throws Exception {
        for (Cliente clienteReferencia : clientesList) {
            if (clienteReferencia.getEmail().equals(email)) {
                throw new Exception("E-mail já cadastrado.Verifique cadastro");
            }
        }
    }


    //exibir lista de cliente
    public static void exibirCliente() {
        for (Cliente clienteReferencia : clientesList) {
            System.out.println(clienteReferencia);

        }
    }


}



