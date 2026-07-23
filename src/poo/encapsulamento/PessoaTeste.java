package poo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Rafa", "Teste",37);
        p1.setIdade(45);

//        System.out.print(p1.getIdade()); // ler
        System.out.println(p1); // toString
        System.out.println(p1.getNomeCompleto());

    }

}
