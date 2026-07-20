package classe;

public class Pessoa {

    String nome;
    double peso;

    public Pessoa(String nomePessoa, double pesoPessoa) {
        this.nome = nomePessoa;
        this.peso = pesoPessoa;
    }

    double comerComida(String nomeComida, double pesoComida) {
        System.out.println("\nComendo comida " + nomeComida);
        return peso + pesoComida;
    }

    void comer(Comida comida) {
        if (comida != null) {
            peso += comida.peso;
        }
    } // Method um pouco diferente

    String apresentar() {
        return "Olá eu sou o " + nome + " e tenho " + peso + " Kg's.";
    }

}
