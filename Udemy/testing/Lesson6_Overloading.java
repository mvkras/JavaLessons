package Udemy.testing;

public class Lesson6_Overloading {
    int a, b, c, d;


     int num_1 (int a)
    {
        return a+0+0+0;
    }

    int num_2 (int a1, int b1)
    {
        System.out.println(a1+b1);
        return  a1+b1+0+0;
    }

    int num_3 (int a2,int b2, int c2)
    {
        return a2+b2+c2+0;
    }

    int num_4 (int a3,int b3, int c3, int d3)
    {

        a=a3;
        b=b3;
        c=c3;
        d=d3;
        return a+b+c+d;
    }

    int num_5 ()
    {
        return 0+0+0+0;
    }

    public static void main(String[] args) {
        Lesson6_Overloading st1=new Lesson6_Overloading();
        Lesson6_Overloading st2=new Lesson6_Overloading();
        Lesson6_Overloading st3=new Lesson6_Overloading();
        Lesson6_Overloading st4=new Lesson6_Overloading();
        Lesson6_Overloading st5=new Lesson6_Overloading();

        System.out.println(st5.num_5());
        System.out.println(st4.num_4(23,16,0,5));
        System.out.println(st3.num_3(2,8,16));
        //System.out.println(st2.num_2(5,7));
        st2.num_2(5,10);
        System.out.println(st1.num_1(1));

    }

}
