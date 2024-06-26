package IterarColecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class IterarColeccion {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i<=11;i++){
            numeros.add(i);
        }
        //recorriendo el array
        for (int i = 1; i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }
        //utilizando iterator

        //recorreindo con el for mejorado
        System.out.println("\nrecorriendo con el for mejorado");
        for (Integer num : numeros){
            System.out.println(num + " ");
        }

        //recorreindo con foreach
        System.out.println("\nrecorriendo con foreach");
        numeros.forEach(numero -> System.out.println(numero + " "));
    }
}
