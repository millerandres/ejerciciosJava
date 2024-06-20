package ObtenerParteDeUnaCadena;

public class PartesCadena {
    public static void main(String[] args) {
        String lenguaje = "java es un lenguaje de programcion genial";
        //la clase substring nos deja especificar un rango de caracteres

        System.out.println(lenguaje.substring(0,4));
        System.out.println(lenguaje.substring(11));
        //para ir hasta el final de la cadena
        System.out.println(lenguaje.substring(11,lenguaje.length()));
    }
}
