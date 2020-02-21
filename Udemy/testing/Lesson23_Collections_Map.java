package Udemy.testing;
import java.util.Collection;
import java.util.HashMap;   //Импортируем оба класса
import java.util.Map;       //Импортируем оба класса
import java.util.Set;

public class Lesson23_Collections_Map {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>(); //У Коллекции Map, есть 2 значения key/value (ключ и значение) Например: Бейджик: №25/Имя:mvkras
        map.put(25,"mvkras");  //С помощью метода put мы можем добавлять значения
        map.put(5,"avkras");
        map.put(21,"potro");
        map.put(1,"Elpotro");
        map.put(4,"WidowMaker");
        System.out.println("map: "+map); //Выводим на экран коллекция map
        map.remove(21);   //Удаляем одного обитателя нашей планеты, кто самое слабое звено?!
        System.out.println(map);

    }
}
