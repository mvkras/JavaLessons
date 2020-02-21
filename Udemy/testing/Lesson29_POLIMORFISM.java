package Udemy.testing;

import javax.print.Doc;

public class Lesson29_POLIMORFISM {
    public static void main(String[] args) {
//       Bus_driver[] array1={new Bus_driver(),new Bus_driver()};     //Можно сделать с помощью массива
//        Help_skills[] array2={new Bus_driver(),new Teacher(),new Doctor()};
//        Employee[] array3={new Bus_driver(),new Teacher(),new Doctor()};
        Employee math=new Teacher();
//        math.work();
        Employee doc=new Doctor();
//        doc.work();
        Employee driver=new Bus_driver();
//        driver.work();
//        driver.sleep();
//       Help_skills h=new Doctor();
//       h.help();
        //--------------------------------2й вариант написания этого же кода с помощью FOREACH цикла--------------------
        Employee[] array3={math,doc,driver};
        for(Employee emp:array3){
            emp.work();
        }

    }
}

abstract class Employee implements Help_skills{
    String name;
    int age;
    String skills;
    void sleep(){System.out.println("Работник волоебит");}
    abstract void work();
}

class Teacher extends Employee{
    @Override
void work(){System.out.println("Учит детей");}
public void help(){System.out.println("Исцеляет");}
}

class Doctor extends  Employee implements Help_skills{
    @Override
void work(){System.out.println("Лечит больных");}
public void help(){System.out.println("Исцеляет");}
}

class Bus_driver extends Employee{
    @Override
void work(){System.out.println("Возит пассажиров");}
public void help(){System.out.println("Исцеляет");}  //Добавляем методы интерфейса, чтобы пропала ошибка, т.к мы добавили интерфейс в абстрактный класс Employee
}

interface Help_skills{
    void help();
}