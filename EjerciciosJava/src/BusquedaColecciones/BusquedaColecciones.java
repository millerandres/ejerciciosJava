package BusquedaColecciones;

import java.util.Arrays;

public class BusquedaColecciones {
    public static void main(String[] args) {
        //busqueda en un arreglo de enteros

        int[] numeros = {7,9,13,2,5,0,18};
        //ordenamos el array
        Arrays.sort(numeros);
        //Mostrando el orden
        for(int numero : numeros){
            System.out.println(numero);
        }
        //buscando la posicion del numero que queremos buscar
        System.out.println(Arrays.binarySearch(numeros,5));

    }
}
