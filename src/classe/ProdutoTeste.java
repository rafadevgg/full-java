package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Mouse", 299.99);

        Produto p2 = new Produto();
        p2.nome = "Teclado";
        p2.preco = 379.99;

        Produto.desconto = 0.50;

        System.out.print(p1.nome + " " + p1.precoComDesconto(0));
        System.out.print("\n" + p2.nome + " " + p2.precoComDesconto(0));
        //System.out.println("Preço final" + p1.precoComDesconto(0));

    }

}
