package SystemSale;

import java.util.Scanner;

public class Sistema {
    private static Scanner obterDados (String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
}
