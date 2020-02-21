package Udemy.testing;

public class Lesson5_Auto { //Создаем класс Auto, вводим параметры
    String name;              //Марка машины
    String color;             //Цвет машины
    String drive_unit;       //Привод
    String engine;             //Объем двигателя
    int speed;              //Скорость

    //--------------------------------------СОЗДАЕМ 3 МЕТОДА:-----------------------------------------------
    //1) МЕТОД - УВЕЛИЧИВАЕТ СКОРОСТЬ на определенное количество
        int speedUp(int skorost)  //пишем тип возвращаемой переменной (int)
        {
            System.out.println(" ");
            System.out.println("Марка машины: "+name);
            System.out.println("Цвет машины: "+color);
            System.out.println("Привод машины: "+drive_unit);
            System.out.println("Объем двигателя машины: "+engine);
            System.out.println("Начальная скорость автомобиля "+speed+" км/ч");
           speed+=skorost; //Увеличиваем speed на skorost
            System.out.println("Увеличенние скорости на: "+skorost+" км");
            System.out.println("Текущая скорость: "+speed+" км/ч");
            System.out.println(" ");
            return speed;
        }

        //2) Метод - ТОРМОЖЕНИЕ АВТОМОБИЛЯ
    int speedDown(int tormoz)  //В примере он оставил skorost
    {
        System.out.println(" ");
        System.out.println("Марка машины: "+name);
        System.out.println("Цвет машины: "+color);
        System.out.println("Привод машины: "+drive_unit);
        System.out.println("Объем двигателя машины: "+engine);
        System.out.println("Начальная скорость автомобиля "+speed+" км/ч");
        speed-=tormoz;   //Уменьшаем скорость (уменьшает на skorost)
        System.out.println("Торможение на: "+tormoz+" км/ч");
        System.out.println("Текущая скорость: "+speed+" км/ч");
        System.out.println(" ");
        return speed;
    }

    //3) МЕТОД - ВЫДАЕТ ИНФОРМАЦИЯ О МАШИНЕ
   /* void information()  //В данном методе можно не использовать выход данных, используем void
    {
        System.out.println("Марка машины: "+name);
        System.out.print(" Цвет машины: "+color);
        System.out.print("; Привод машины: "+drive_unit);
        System.out.print("; Объем двигателя машины: "+engine);
        System.out.println("; Скорость машины: "+speed);

    }
    */

}
//------------------------------------------СОЗДАЕМ НОВЫЙ КЛАСС ДЛЯ СОЗДАНИЯ ОБЪЕКТОВ КЛАССА АВТОМОБИЛЬ
class Auto{
    public static void main(String[] args) {
        Lesson5_Auto K = new Lesson5_Auto();   //Создаем объекты
        Lesson5_Auto F = new Lesson5_Auto();
        Lesson5_Auto L = new Lesson5_Auto();
        Lesson5_Auto J = new Lesson5_Auto();
//-------------------------------------------------------------------------------------------------------------
        //----------------------------------------------Даем значения нашим автомобилям
        K.name="Kia";
        K.color="Белый";
        K.drive_unit="4WD";
        K.engine="V6";
        K.speed=240;
        //Выводим на экран информацию:
       //K.information();          //не вызываем вывод на экран, так как он у нас отражен в методе уже (все параметры вывода)
           K.speedUp(30);     //Увеличиваем скорость машины

                   // K.speedDown(50); //Уменьшаем скорость машины
                        //Показывет изменение скорости

        //-----------------------------------------------------------------------------
        F.name="Ford";
        F.color="Синий";
        F.drive_unit="2WD";
        F.engine="V2.0";
        F.speed=220;

            // F.speedUp(15);

                F.speedDown(85);

        //-----------------------------------------------------------------------------
        L.name="Lexus";
        L.color="Черный";
        L.drive_unit="4WD";
        L.engine="V6";
        L.speed=245;

            // L.speedUp(10);

                L.speedDown(65);


        //-----------------------------------------------------------------------------
        J.name="Jeep";
        J.color="Желтый";
        J.drive_unit="AWD";
        J.engine="V8";
        J.speed=260;

            J.speedUp(25);

               // J.speedDown(60);

    }
}
