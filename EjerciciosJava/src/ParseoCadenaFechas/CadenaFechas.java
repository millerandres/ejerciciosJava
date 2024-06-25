package ParseoCadenaFechas;

import java.time.LocalDate;

public class CadenaFechas {
    public static void main(String[] args) {
        //convertimos de una cadena a una fecha
        String cadenaFecha = "1984-05-21";
        LocalDate fecha1 = LocalDate.parse(cadenaFecha);
        System.out.println(fecha1);


    }
}
