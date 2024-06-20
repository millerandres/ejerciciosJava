package FormatearCadenas;

public class FormatoCadenasCaracteres {
    public static void main(String[] args) {
        //muestra el numero con 3 decimales de presicion
        System.out.format("%.3f%n", Math.PI);

        System.out.format("%.3f - %.5f - %4f",Math.PI, Math.PI, Math.E);
    }
}
