package SumasRestarFechas;

import java.time.LocalDate;
import java.time.Period;

public class SumarRestarFechas {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.ofDays(317);

        LocalDate fechaNueva = fechaActual.plus(periodo);
        System.out.println("fecha actual "+fechaActual);
        System.out.println("fecha Nueva "+fechaNueva);

        periodo =Period.ofDays(-317);
        fechaNueva = fechaActual.minus(periodo);
        System.out.println("fecha actual "+fechaActual);
        System.out.println("fecha Nueva "+fechaNueva);
    }
}
