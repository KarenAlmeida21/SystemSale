package SystemSale;

import java.util.ArrayList;
import java.util.List;

public class ServiceCliente {
    private static List<Cliente>clientesList =new ArrayList<>();
    public static Cliente cadastrarCliente(String nome,String cpf, String email){
       Cliente cliente = new Cliente(nome,cpf,email);
       clientesList.add(cliente);
       return cliente;
    }

}
