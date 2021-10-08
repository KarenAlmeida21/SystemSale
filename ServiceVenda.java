package SystemSale;

import java.util.ArrayList;
import java.util.List;

public class ServiceVenda {
    private static List<Venda> vendaList =new ArrayList<>();



    public static void exibirVenda(){
        for (Venda percorrerList:vendaList) {
            System.out.println(percorrerList);

        }
    }
}
