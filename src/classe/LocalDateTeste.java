package classe;

import java.time.*;

public class LocalDateTeste {

    public static void main(String[] args) {

        LocalDate data = LocalDate.now();
        Month month = data.getMonth();
        System.out.println(month);

        DayOfWeek dayOfWeek = data.getDayOfWeek();
        System.out.println(dayOfWeek);

        Year year = Year.of(data.getYear());
        System.out.println(year);

        LocalDateTime hora = LocalDateTime.now();
        System.out.println(hora);

        LocalDateTime hora2 = LocalDateTime.of(2025, 12,5,22,30);
        System.out.println(hora2);

           }
}
