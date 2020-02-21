package Udemy.testing;

public class Lesson3_Udemy {
    public static void main(String[] args)
    {
        //ДОМАШНЕЕ ЗАДАНИЕ №2:
        //1. Вычислите следующую часть кода:
        int i1=5;
        int i2=11;
        double d1=5.5;
        double d2=1.3;
        long l=20L;
        double result=0;
        result=i2/d1+d2%i1-l;
        System.out.println(result);

        //2. Чему равны выражения:
      int a=5;
      int c=(a-- - --a + ++a + a++ + a);
      System.out.println(c);
        //5-3+4+4+5=15
        int b=8;
        int d=(++b - b++ + ++b - --b);
       System.out.println(d);
        //9-9+11-10=1
    }
}
