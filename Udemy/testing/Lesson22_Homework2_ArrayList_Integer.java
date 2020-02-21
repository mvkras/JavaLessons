package Udemy.testing;
import java.util.ArrayList;
import java.util.Collections;


public class Lesson22_Homework2_ArrayList_Integer {

    public ArrayList<Integer> xyz(Integer...k) //Создаем метод ArrayList
    {
        ArrayList<Integer> celoe=new ArrayList<>();
        for(Integer k1:k)  //Создаем метод foreach
        {
            if(!celoe.contains(k1))  //Если целое не содержит k1
            {
                celoe.add(k1);     //Добавляем k1 в ArrayList
            }
        }
        Collections.sort(celoe);
        System.out.println(celoe);
        return celoe;
    }

    public static void main(String[] args) {
      Lesson22_Homework2_ArrayList_Integer array2=new Lesson22_Homework2_ArrayList_Integer();  //Создаем объект класса, затем придаем значения
        array2.xyz(25,17,24,0,12,2); //Придали значение

    }

}
