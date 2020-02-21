package Udemy.testing;

public class Lesson11_CarRefference {

}
class Car {
    String color;
    String engine;
    int doors;

    //-----------------------------------------СОЗДАЕМ КОНСТРУКТОР----------------------------
    public Car(String color, String engine, int doors)
    {
        this.color=color;
        this.engine=engine;
        this.doors=doors;
    }
}

class Test_car
{
    void change_door(Car auto,int doors)   //Изменяем количество дверей
    {
        auto.doors=doors;  //присваиваем значение дверей класса, новым дверям
    }

    void  change_color(Car auto1, Car auto2) //----------------------Изменяем цвета машины
    {
        String color=auto1.color; //Используем ссылочный тип, ссылаясь друг к другу
        auto1.color=auto2.color;
        auto2.color=color;
    }


    public static void main(String[] args) {
        Test_car auto=new Test_car();
        Car auto1=new Car("white","V2.0",8);
        Car auto2=new Car("green","V2.0",5);
        auto.change_color(auto1,auto2);
        auto.change_door(auto1,2); //Поменяли количество дверей на 1м авто
        System.out.println("Информация о первой машщине: "+auto1.color+" "+auto1.doors+" "+auto1.engine);
        System.out.println("Информация о первой машщине: "+auto2.color+" "+auto2.doors+" "+auto2.engine);

    }
}