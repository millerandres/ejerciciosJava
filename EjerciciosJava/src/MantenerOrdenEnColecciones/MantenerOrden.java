package MantenerOrdenEnColecciones;

import java.util.TreeSet;

public class MantenerOrden {
    public static void main(String[] args) {
        TreeSet<String> escritores = new TreeSet<>();
        escritores.add("juan");
        escritores.add("pedro");
        escritores.add("Carlos");
        escritores.add("pepe");
        escritores.add("Maria");

        for (String escritor : escritores){
            System.out.println(escritor);
        }
    }
}
