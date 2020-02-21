package Udemy.testing;

public class Lesson5_Methods {
    int sum (int a,int b, int c)  //Создаем метод. Сперва пишем rutern type(void и другие)тип возвращения.
    {                             //результат работы нашего метода. То, что возвращает нам метод. Обязательный элемент
          int result=a+b+c;                     //Тело метода
        return result;//показываем выход (output). На выходе должен показывать сумму. На входе int и на выходе тоже должен быть int
    }
}

//---------------------------------Создаем новый класс для вызова метода (в нем должно быть main)
class method_call{
    public static void main(String[] args) {
        Lesson5_Methods method=new Lesson5_Methods(); //Создали объект класса метода, для его вызова
        method.sum(25,48,16);//теперь с помощью созданного объекта вызываем метод другого класса
        int abc=method.sum(25,48,16); //Для вывода создаем новую переменную с типом данных int и присваеваем значение метода
        System.out.println("Сумма a,b,c= "+abc);//Выводим на экран значение
    }
}
