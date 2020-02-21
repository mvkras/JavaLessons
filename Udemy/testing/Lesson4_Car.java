package Udemy.testing;
//------------------------------------СОЗДАЕМ КЛАСС CAR---------------------------------------
public class Lesson4_Car {
    String color;
    String engine;
}

//-------------------------------------Создаем новый класс CAR TEST----------------------------

class Car_Test{
    public static void main(String[] args) {
        //---------------------------------СОЗДАЕМ ОБЪЕКТЫ класса CAR---------------------------
        Lesson4_Car bmw=new Lesson4_Car();
        Lesson4_Car toyota=new Lesson4_Car();
        Lesson4_Car subaru=new Lesson4_Car();
        Lesson4_Car honda=new Lesson4_Car();
        //-----------------------------------------BMW-------------------------------------
        bmw.color="Yellow";
        bmw.engine="V2.0";
        System.out.print("BMW color: "+bmw.color);
        System.out.println("  engine: "+bmw.engine);

        //---------------------------------------TOYOTA-------------------------------------
        toyota.color="Silver";
        toyota.engine="V1.8";
        System.out.print("Toyota color: "+toyota.color);
        System.out.println("  engine: "+toyota.engine);

        //---------------------------------------SUBARU-------------------------------------
        subaru.color="Red";
        subaru.engine="V6";
        System.out.print("Subaru color: "+subaru.color);
        System.out.println("  engine: "+subaru.engine);

        //---------------------------------------HONDA---------------------------------------
        honda.color="Blue";
        honda.engine="2.6";
        System.out.print("Honda color: "+honda.color);
        System.out.println("  engine: "+honda.engine);
    }
}