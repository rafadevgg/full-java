package classe;

public class AreaCirc {

    final static double PI = 3.14;
    double raio;

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }

}
