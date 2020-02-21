package Udemy.testing;
import Udemy.testing.Lesson24_OOP_INCAPSULATION;   //ИМПОРТИРОВАЛИ КЛАСС ИЗ ПРОШЛОГО УРОКА


public class Lesson24_OOP_INCAPCULATION_2 {
    public static void main(String[] args) {
        Human people=new Human("male");  //Создаем объект класса Человек
        Human people2=new Human("female"); //Задаем этот аттрибут при создании человека (пол)
//----------------------------------------------------------------------------
        people.setName("Григорий");   //Создали человека
        people.setAge(27);
        people.setWeight(86);
        System.out.println("Имя: "+people.getName());//Выводим на экран
        System.out.print("Возраст: "+people.getAge()+",");
        System.out.println(" Вес: "+people.getWeight()+".");
//----------------------------------------------------------------------------
        people2.setName("Настя"); //Создали бабу
        people2.setAge(33);
        people2.setWeight(65);
        System.out.println("Имя: "+people2.getName());//Выводим на экран
        System.out.print("Возраст: "+people2.getAge()+",");
        System.out.println(" Вес: "+people2.getWeight()+".");

    }
}
