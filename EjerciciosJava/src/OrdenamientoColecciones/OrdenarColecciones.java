package OrdenamientoColecciones;

import java.util.*;

public class OrdenarColecciones {
    public static void main(String[] args) {
        String[] prog = new String[5];

        prog[0] = "word";
        prog[1] = "excel";
        prog[2] = "power point";
        prog[3] = "photoshop";
        prog[4] = "paint";

        //recorreindo el array

        for(String x : prog){
            System.out.println(x);
        }

        //ordenando la coleccion
        System.out.println("array ordenado");
        Arrays.sort(prog);
        for(String x : prog){
            System.out.println(x);
        }

        System.out.println("Mostrando arrayList");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(13);
        numeros.add(15);
        numeros.add(1);
        numeros.add(5);
        numeros.add(3);
        numeros.add(4);

        for (Integer numero: numeros){
            System.out.println(numero);
        }
        System.out.println("ordenando el ArrayList");

        Collections.sort(numeros);
        for (Integer numero: numeros){
            System.out.println(numero);
        }
    }
}
