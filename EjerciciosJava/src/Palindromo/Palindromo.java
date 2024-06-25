package Palindromo;

public class Palindromo {
    public static void main(String[] args) {
        String palabra = "oso";
        System.out.println("la palabra "+palabra +" es palindromo?" + esPalindromo(palabra));
    }

    public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase();

        for (int i = 0, j = palabra.length() - 1; i <= j; i++,j--) {
            //validamos si el caracter del lado izquierdo es distinto del lado derecho,
            //deja de ser palindromo
            if (palabra.charAt(i) != palabra.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}

