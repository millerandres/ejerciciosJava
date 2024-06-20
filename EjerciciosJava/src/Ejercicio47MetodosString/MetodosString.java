package Ejercicio47MetodosString;

import java.sql.SQLOutput;

public class MetodosString {

    public static void main(String[] args) {
        String cadena = "jola";
        //metodo isBlank()
        System.out.println(cadena.isBlank());

        //metodo strip: elimina espacios a la izquierda y a la derecha
        cadena = "     f    hola mundo    ggggg    ";
        System.out.println(cadena.strip());

        //metodo stripLeading: elimina solo espacios de la izquierda
        System.out.println(cadena.stripLeading());

        //stripTrailing: elimina espacios a la derecha.
        System.out.println(cadena.stripTrailing());
    }



}
