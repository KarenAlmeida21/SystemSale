package SystemSale;

import java.util.Scanner;

public class Sistema {
    private static Scanner obterDados (String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static void menu(){
        System.out.println("Digite 1 para cadastrar uma venda");
        System.out.println("Digite 2 para exibir os dados da venda");
        System.out.println("Digite 3 para sair");
    }

}
