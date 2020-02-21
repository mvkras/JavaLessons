package Udemy.testing;

public class Lesson8_Final {
    static int count;
    public final static  float PI=3.14f;

    public float s(float radius)  //Находим площадь круга
    {
        count++;
        float pi=PI+radius+radius;
        return pi;

    }

    public static float dlina(float rad)
    {

        float dl=2*PI*rad;
        return dl;
    }
    public void info(float redius2)               //Метод вывода информации по площади и длины
    {

        System.out.println(count+" Радиус: "+redius2);
        System.out.println(count+" Площадь: "+s(redius2));
        System.out.println(count+" Длина: "+dlina(redius2));

    }
}

class Test_Square
{
    public static void main(String[] args) {
        Lesson8_Final fff=new Lesson8_Final();
        fff.s(4);
        fff.info(3);
        Lesson8_Final.dlina(7);

    }
}