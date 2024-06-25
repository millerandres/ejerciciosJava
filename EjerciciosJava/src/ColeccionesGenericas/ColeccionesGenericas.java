package ColeccionesGenericas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ColeccionesGenericas {

    public static void main(String[] args) {

        //ArrayList
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(5.3);
        numeros.add(7.2);
        numeros.add(8.4);

        //HashMap: clave valor
        HashMap<Integer,String> nombres = new HashMap<>();
        nombres.put(1,"Notepad++");
        nombres.put(2,"word");
        nombres.put(3,"excel");

        //HashSet : estos no permiten elementos duplicados
        HashSet<Integer> numerosEnteros = new HashSet<>();
        numerosEnteros.add(5);
        numerosEnteros.add(3);
        numerosEnteros.add(7);
        numerosEnteros.add(5);
    }



}
