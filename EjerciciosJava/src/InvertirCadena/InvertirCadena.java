package InvertirCadena;

import java.util.Stack;
import java.util.StringTokenizer;

public class InvertirCadena {
    public static void main(String[] args) {
        String lenguaje = "lenguajes de programacion";
        //invertimos la cadena caracter por caracter
        /*
        * StringBuilder:
        *La clase StringBuilder es similar a la clase String en el sentido de que sirve
        * para almacenar cadenas de caracteres. No obstante, presenta algunas diferencias relevantes.
        *
         *Su tamaño y contenido pueden modificarse.
         *  Los objetos de éste tipo son mutables. Esto es una diferencia con los String
         *
         *Un StringBuilder está indexado.
         *  Cada uno de sus caracteres tiene un índice: 0 para el primero,1 para el segundo, etc
         *
         *
         * .
        * */
        // inversion de caracter por caracter
        StringBuilder sb = new StringBuilder(lenguaje);
        System.out.println(sb.reverse()); // invierte la cadena que se pasa como argumento

        //inversion de caracteres por palabras
        Stack<String> palabras = new Stack<>();
        StringTokenizer st = new StringTokenizer(lenguaje," ");

        while (st.hasMoreTokens()){
            palabras.add(st.nextToken());
        }

        while (!palabras.empty()){
            System.out.print(palabras.pop());
            System.out.print(" ");
        }

    }

}
