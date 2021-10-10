// Работа с Датой

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main (String[]args){

        LocalDate date = LocalDate.now(); // получаем текущую дату
        System.out.println(date);
        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        System.out.printf("%d.%d.%d \n", dayOfMonth, month, year);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek + "\n");

        
        
        LocalDate date1 = LocalDate.of(1914, 7, 28); // создание даты
        date1 = date1.plusYears(4);
        date1 = date1.plusMonths(3);
        date1 = date1.plusDays(14);
        System.out.println(date1);   // 1918-11-11

        date1 = date1.minusMonths(10);
        date1 = date1.minusDays(3);
        System.out.println(date1);   // 1918-01-08
        
    }
}
