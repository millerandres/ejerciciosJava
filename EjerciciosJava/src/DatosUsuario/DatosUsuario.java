package DatosUsuario;

import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        String nombre;
        System.out.println("Escriba su nombre");
        nombre = lector.nextLine();

        System.out.println("bienvenido "+ nombre);
    }
}
