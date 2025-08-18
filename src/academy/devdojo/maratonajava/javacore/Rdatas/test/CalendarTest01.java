package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        // Presente em sistemas legados, como Date.
        Calendar c = Calendar.getInstance(); // Instancia dependendo das configurações da máquina.
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){ // Se o primeiro dia daquele país é DOMINGO
            System.out.println("Domingou!!");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); // c.get() recebe INT
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 5);
        c.roll(Calendar.HOUR, 12);

        Date date = c.getTime(); // esse metodo retorna 'Date'
        System.out.println(date);
    }
}
