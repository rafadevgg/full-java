package classe;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data();

        Data d2 = new Data(29, 6, 2005);

        System.out.println("Dia " + d1.dia + " do mês " + d1.mes + " do ano " + d1.ano);
        System.out.println("Dia " + d2.dia + " do mês " + d2.mes + " do ano " + d2.ano);

        System.out.print("Data: " + d1.obterDataFormatada());
        System.out.print("\nData: " + d2.obterDataFormatada());
        //System.out.printf("\n%d/%d/%d", d2.dia, d2.mes, d2.ano);

    }

}
