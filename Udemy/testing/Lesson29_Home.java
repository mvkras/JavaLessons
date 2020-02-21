package Udemy.testing;

public class Lesson29_Home {
    public static void main(String[] args) {
    Number_1 num=new Number_2();
    System.out.println(num.x);
        System.out.println(num.y);
    }
}

abstract class Number_1{
    protected int x;
    public int y;
}

class Number_2 extends Number_1{
    public Number_2(){
        this.x=10;
        this.y=12;
    }
}

