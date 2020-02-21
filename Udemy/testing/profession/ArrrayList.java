package Udemy.testing.profession;
import java.util.ArrayList;   //импортируем ArrayList
import java.util.List;

public class ArrrayList {
    public static void main(String[] args) {

      List<Integer> list=new ArrayList<>();  //Создаем ArrayList
       for(int i=0;i<45;i++) //создаем цикл для обозначения длины массива
       {
           list.add(i);  //добавляем массив
       }
       System.out.println("1. Весь массив: "+list); //выводим на экран
        System.out.println("2. Определенный индекс массива: "+list.get(25));  //выводим определенный индекс на экран
        System.out.println("3. Длина массива: "+list.size()); //узнаем размер массива
    }
}
