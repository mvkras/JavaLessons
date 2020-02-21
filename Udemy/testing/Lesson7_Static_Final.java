package Udemy.testing;

public class Lesson7_Static_Final {
    static float a=10f, b=4f, c=2f;

    static float mult()
    {
        return a*b*c;
    }

   static void multyply()                //Метод, который ничего не выводит void
    {                                   //к Static, обращаемся через класс

        System.out.println(a/b+a%b);
    }
}

class Lesson7_Test                           //ОБЪЕКТЫ НЕ СОЗДАЕМ, ТАК КАК ИСПОЛЬЗУЕМ STATIC МЕТОДЫ, ВЫВОДИМ ЧЕРЕЗ КЛАСС ИХ
{
    public static void main(String[] args) {
        System.out.println(Lesson7_Static_Final.mult());
        Lesson7_Static_Final.multyply();
    }
}