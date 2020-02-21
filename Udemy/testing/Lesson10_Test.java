package Udemy.testing;

public class Lesson10_Test {
   static int a;   //Значение, которое использовал вместо count
    float b;
    float c;

    Lesson10_Test(float b, float c)
    {
        a++;
        this.b=b;
        this.c=c;
        float result=b*c;
        System.out.println(a+" Произведение b и c равна: "+result);
    }

    public static void main(String[] args) {
        Lesson10_Test test=new Lesson10_Test(5f,7f);
        Lesson10_Test test2=new Lesson10_Test(17f,7f);
        Lesson10_Test test3=new Lesson10_Test(1f,1f);

    }
}

