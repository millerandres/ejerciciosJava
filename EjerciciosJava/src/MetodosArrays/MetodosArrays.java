package MetodosArrays;

import java.util.Arrays;

public class MetodosArrays {

    public static void main(String[] args) {
        //copyOf: es una copia de un arreglo
        int[] numeros = new int[10];
        for(int i=0;i<numeros.length;i++){
            numeros[i] = i;
        }

        int[] numerosCopia = Arrays.copyOf(numeros,20);
        for(int numero : numerosCopia){
            System.out.println(numero + " ");
        }

        //comprobamos si un arreglo es igual a otro
        int[] numerosCopia2 = numeros;
        System.out.println("Numeros es igual a numerosCopia2: "+ Arrays.equals(numeros,numerosCopia2));



        //uso del metodo fill:
        int[] valores = new int[10];
        Arrays.fill(valores,5);
        for(int valor : valores){
            System.out.println(valor);
        }

        //uso del metodo hashcode
        System.out.println(Arrays.hashCode(valores));

        //uso del metodo ToString
        System.out.println(Arrays.toString(valores));
    }


}
