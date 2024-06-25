package FechaHoraActuales;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FechaHoraActuales {
    public static void main(String[] args) {
        //Hora actual
        LocalTime horaActual = LocalTime.now();
        System.out.println("hora actual "+ horaActual);

        //fecha actual
        LocalDate fechaActual = LocalDate.now();
        System.out.println("fecha actual "+ fechaActual);

        //hora y fecha
        LocalDateTime fechaHora = LocalDateTime.now();
        System.out.println("\n Fecha y hora actuales "+fechaHora);
    }




}
