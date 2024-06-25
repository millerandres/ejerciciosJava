package EncontrarPalabrasConlongitud;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findPalabras {
    public static void main(String[] args) {
        String texto = "Este es un ejemplo de una expresion RegEx.";
        /*
        * \b: es para delimitar palabras
        * {2}: indica la longitud de la palabra que queremos buscar
        *
        *
        * */
        String cadenaPatron = "\\b[a-zA-Z]{2}\\b";

        //esta linea compila la expresion que representa el patron
        Pattern patron = Pattern.compile(cadenaPatron);
        //Matcher encuentra las coincidencias sobre el texto
        Matcher matcher = patron.matcher(texto);

        //se va a repetir siempre y cuando haya una coincidencia
        System.out.println("resultado con longitud 2");
        while (matcher.find()){

            System.out.println(matcher.group());
        }

        String texto2 = "Este es un ejemplo de una expresion RegEx.";

        String cadenaPatron2 = "\\bE[:alpha:]\\b";

        //esta linea compila la expresion que representa el patron
        Pattern patron2 = Pattern.compile(cadenaPatron2);
        //Matcher encuentra las coincidencias sobre el texto
        Matcher matcher2 = patron2.matcher(texto2);

        //se va a repetir siempre y cuando haya una coincidencia
        System.out.println("resultado qu  extrae palabras que empiecen por la letra E");
        while (matcher2.find()){

            System.out.println(matcher2.group());
        }

    }
}
