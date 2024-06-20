package compararCadenasDeCaracteres;

public class comparacionStrings {
    public static void main(String[] args) {
        String cadena1 = "java";
        String cadena2 = "java";

        // COMPAACION POR REFERENCIA
        System.out.println(cadena1 == cadena2);
        System.out.println("valores hexadecimales de las cadenas");
        System.out.println(Integer.toHexString(System.identityHashCode(cadena1)));
        System.out.println(Integer.toHexString(System.identityHashCode(cadena2)));
        //comparacion por locacion
        //al usar el operador new se usa una nueva locacion en memoria: por eso
        //el resultado es false
        String cadena3 = new String("java");
        System.out.println(cadena1 == cadena3);

        /* SE DEBE USAR EL METODO EQUALS
        * omparacion por caracteres
        *
        *
        * */
        //aqui compara el contenido mas no las referencias.
        System.out.println(cadena1.equals(cadena3));

    }
}
