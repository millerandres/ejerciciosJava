package DIferenciaEntreFechas;

import java.time.LocalDate;
import java.time.Period;

public class DiferenciaFechas {
    public static void main(String[] args) {
        LocalDate anio2000 = LocalDate.of(2000,1,1);
        LocalDate fechaActual = LocalDate.now();

        Period diferenciaFechas = Period.between(anio2000,fechaActual);
        System.out.println(diferenciaFechas);
        System.out.println("año: "+ diferenciaFechas.getYears());
        System.out.println("meses: "+ diferenciaFechas.getMonths());
        System.out.println("dias: "+ diferenciaFechas.getDays());
    }
}
