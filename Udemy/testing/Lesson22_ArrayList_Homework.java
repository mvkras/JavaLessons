package Udemy.testing;
import java.util.ArrayList;
import java.util.Collections;

public class Lesson22_ArrayList_Homework {

    public ArrayList<String> abc (String...s) //Создаем метод ArrayList abc (в скобках varargs)
    {
        ArrayList<String> arrList=new ArrayList<>();  //объявляем ArrayList
        for(String s1:s)  //Используем цикл foreach
        {
           if(!arrList.contains(s1)) //Создаем условие, если ArrayList не содержит s1, то в arrList добавляем s1
           {
               arrList.add(s1); //добавляем в arrayList значение s1
           }
        }
        Collections.sort(arrList);  //Сортируем массив
        System.out.println(arrList);
        return arrList;
    }

    public static void main(String[] args) {
      Lesson22_ArrayList_Homework arr1=new Lesson22_ArrayList_Homework();   //Создаем объект класса, даем значения
        arr1.abc("Значение 1", "Значение 2", "Значение 3");
    }

}
