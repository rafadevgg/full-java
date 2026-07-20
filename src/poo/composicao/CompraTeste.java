package poo.composicao;

public class CompraTeste {

    public static void main(String[] args) {
        
        Compra compra1 = new Compra();
        compra1.cliente = "João Pedro";

        compra1.adicionarItem("Viper V3 PRO", 1, 569.99);
        compra1.adicionarItem("G PRO Superlight", 3, 369.99);
        compra1.adicionarItem("G PRO Superlight 2", 5, 599.99);

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());

        double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
        System.out.println("O total é " + total); // Só para mostrar relação bidirecional!

    }
    
}
