package NumerosCapicua;

public class NumerosCapicua {
    public static void main(String[] args) {
        int numero= 2314;

        System.out.println("el numero "+numero +" es capicua " + esCapicua(numero));
    }

    public static boolean esCapicua(int numero){
        //pasamos el numero a cadena de caracteres
        String palabra = String.valueOf(numero);

        for (int i=0,j= palabra.length()-1;i <= j;i++,--j){
            if(palabra.charAt(i)!= palabra.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
