package ConversionDeTiempo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ConversionTiempo {
    public static void main(String[] args) {
        //convertir de segundos a una fecha
        Instant horaFecha = Instant.ofEpochSecond(10000000L);
        System.out.println(horaFecha);
        //convertir de segundos Unix a zona Horaria
        ZoneId zonaActual = ZoneId.systemDefault();
        ZonedDateTime ahora = ZonedDateTime.ofInstant(horaFecha,zonaActual);
        System.out.println("\n"+ ahora);

        //conversion zona horaria
        LocalDateTime fechaHoraActuales = LocalDateTime.now();
        ZonedDateTime londres = fechaHoraActuales.atZone(ZoneId.of("Europe/London"));
        System.out.println("\n"+londres);
    }
}
