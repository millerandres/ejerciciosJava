package Ejercicio48CadenaDeCaracteresEnMInusculasYMayusculas;

public class ConversionCadenasCaracteres {
    public static void main(String[] args) {
        String lenguaje1 = "java es genial";
        String lenguaje2 = "JAVA ES GENIAL";

        //conversion de texto a mayusculas
        String lenguaje3 = lenguaje1.toUpperCase();
        System.out.println(lenguaje3);

        String lenguaje4 = lenguaje2.toLowerCase();
        System.out.println(lenguaje4);

        //comparando dos textos sin tener en cuenta mayusculas y minusculas
        System.out.println(lenguaje1.equalsIgnoreCase(lenguaje2));
    }
}
