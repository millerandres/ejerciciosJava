package sepracionCaracteres;

import java.io.File;

public class SeparacionCaracter {
    public static void main(String[] args) {
        //caracter de separacion de nombre de archivos
        String separacionCaracter = File.separator;
        System.out.println(separacionCaracter);
        //caracter de separacion de rutas
        String sepracionRutas = File.pathSeparator;
        System.out.println(sepracionRutas);
    }
}
