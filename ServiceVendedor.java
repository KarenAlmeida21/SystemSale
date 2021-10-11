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
        constatarVendedor(cpf);
        constatarVendedorEmail(email);
        validarEmailVendedor(email);
        Vendedor vendedor = new Vendedor(nome, cpf, email);
        vendedorList.add(vendedor);
        return vendedor;
    }

    public static Vendedor verificarVendedorCpf(String cpf) throws Exception {
        for (Vendedor percorrerList : vendedorList) {
            if (percorrerList.getCpf().equals(cpf)) {

                return percorrerList;
            }
        }
        throw new Exception("Vendedor Não Cadastrado");
    }

    public static void validarEmailVendedor(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("Verifique o e-mail e digite novamente");
        }
    }

    public static void constatarVendedor(String cpf) throws Exception {
        for (Vendedor vendedorReferencia : vendedorList) {
            if (vendedorReferencia.getCpf().equals(cpf)) {
                throw new Exception("CPF já cadastrado.Verifique cadastro");
            }
        }
    }


    public static void constatarVendedorEmail(String email) throws Exception {
        for (Vendedor vendedorReferencia : vendedorList) {
            if (vendedorReferencia.getEmail().equals(email)) {
                throw new Exception("E-mail já cadastrado.Verifique cadastro");
            }
        }
    }

    public static void exibirVendedor() {
        for (Vendedor vendedorReferencia:vendedorList) {

            System.out.println(vendedorReferencia);

        }
    }
}
