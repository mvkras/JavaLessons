package Udemy.testing;

public class Lesson9_Predel_Vidimosti {
    String name;
    String color;
    String engine;
    static int count;  //Будет подсчитывать количество машин, которые мы создали

    Lesson9_Predel_Vidimosti (String name, String color, String engine)  //Создаем конструктор с параметрами
    {
        count++;  //count будет увеличивать количество машин
       this.name=name;
        this.color=color;
        this.engine=engine;
        System.out.println(count+" Марка машины: "+name+" Цвет: "+color+" Объем двигателя: "+engine);
    }

    //---------------------------------------Создаем 2 метода в этом же классе-------------------------------
  public void info_car(String name2)
    {
        System.out.println("Марка машины: "+name);
        this.name=name2;
    }

    public void info_Color()
    {
        System.out.println("Цвет машины: "+color+" Объем двигателя "+engine); //Показывает цвет машины
        this.change_Color("yellow");
       System.out.println("Объем двигателя: "+engine);
       this.engine="V12";
    }

    public void change_Color(String color2)     //Изменяем цвет машины
    {
        System.out.println(count+" Новый цвет машины: "+color2+" Цена машины: ");
        int price=5000;  //Начальная цена машины
        this.color=color2; //После того, как поменяли цвет, изменилась цена
        price+=1000;  //Увеличение цены машины, после покраски
    }
}
class MyCar
{
    public static void main(String[] args) {
        Lesson9_Predel_Vidimosti car=new Lesson9_Predel_Vidimosti("bmw","black","v2.0");
        car.change_Color("white");
        Lesson9_Predel_Vidimosti car2=new Lesson9_Predel_Vidimosti("Toyota","silver","V12");
        car2.change_Color("green");
        Lesson9_Predel_Vidimosti car3=new Lesson9_Predel_Vidimosti("Kia","white","V1.8");

    }
}