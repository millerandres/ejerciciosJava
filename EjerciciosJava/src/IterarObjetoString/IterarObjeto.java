package IterarObjetoString;

public class IterarObjeto {
    public static void main(String[] args) {

        String lenguaje = "ja es genial";

        //for normal
        for (int i =0;i<lenguaje.length();i++){
            System.out.printf("%c ",lenguaje.charAt(i));
            //la salida muestra caracter a caracter
        }
        //for mejorado
        //toCharArray: nos muestra un arrglo de caracteres
        System.out.println("****");
        for (char caracter : lenguaje.toCharArray()){
            System.out.printf("%c ",caracter);
        }


    }
}
