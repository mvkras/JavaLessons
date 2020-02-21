package Udemy.testing;

public class Lesson16_String {
    static String s="Welcome back, 47";
//------------------------------------------------Методы, показывающие количество символов String (длину массива)
    public static void main(String[] args) {
        int x=s.length();
        System.out.println(s);

//-------------------------------------------------CharAt(int index)---------------------------------
        char c=s.charAt(4);    //Выводит символ на экран, согласно индексу, начиная с нуль,1,2,3...
        System.out.println(c);
//--------------------------------------------------IndexOf(на каком индексе, какой символ)----------
        int y=s.indexOf("47");
        System.out.println(y);

        int z=s.indexOf('W');
        System.out.println(z);
//-------------------------------------------------StartsWith(Начиная с) EndsWith(Заканчивая с)-------------------
        boolean a=s.startsWith("l",2); //Строка L начинается с L - нет и выводится будет false
        System.out.println(a);
        boolean b=s.endsWith("47");
        System.out.println(b);
//---------------------------------------------------------trim(); (Убирает пробелы по бокам)---------------------
        String d=s.trim();
        System.out.println(d);

    }
}
