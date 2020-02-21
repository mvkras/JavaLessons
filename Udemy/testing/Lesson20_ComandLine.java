package Udemy.testing;

public class Lesson20_ComandLine {
    //-------------------------------Добавление бесконечного числа аргументов Varargs
    public static void summa(String s, int ... x)
    {
        int summa=0;
        for (int i=0; i<x.length;i++)  //Выводим цикл для массива
        {
            summa+=x[i]; //Увеличиваем значение сумма, на число, которое будет в массиве
        }
        System.out.println(s+summa);

    }

    public static void main(String[] args) {
        summa("Вывод суммы на экран: ",12,14,16); // подставляем любые числа, любой длины
    }
}
