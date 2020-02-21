package Udemy.testing;
import java.time.*;

public class Lesson30_DATE_TIME {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
       LocalDate ld1=LocalDate.of(2015,10,15); //Создаем объект
        System.out.println(ld1);
    }
}
