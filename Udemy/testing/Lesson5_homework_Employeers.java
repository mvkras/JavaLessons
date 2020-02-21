package Udemy.testing;

public class Lesson5_homework_Employeers {

    int id;
   public String name;
    int age;
    String department;
    private float salary;

     float payday()
    {

        salary*=2;
        System.out.println(salary);
        return salary;
    }

    public void getSalary() {
        System.out.println(salary);
    }
}

//Создаем еще 1 класс и создаем объекты класса работники
class EmployeersTest
{
    public static void main(String[] args) {
        Lesson5_homework_Employeers man1=new Lesson5_homework_Employeers();  //Создали объекты
        Lesson5_homework_Employeers woman1=new Lesson5_homework_Employeers();
        //---------------------------------------------------------------

        //------------------------------------Вносим значения--------------------
        man1.id=1;
        man1.name="Малыш";
        man1.age=23;
        man1.department="Отдел Нравов";
        man1.getSalary();
        System.out.println(" ");
      // System.out.println("Имя сотрудника: "+man1.name+" Зарплата: "+man1.salary+" рублей");
       man1.payday();
       // System.out.println("Имя сотрудника: "+man1.name+" Увеличенная зарплата: "+man1.salary+" рублей");
        System.out.println(" ");


        woman1.id=2;
        woman1.name="Света";
        woman1.age=28;
        woman1.department="Склад";
        woman1.getSalary();
        System.out.println(" ");
       //System.out.println("Имя сотрудника: "+woman1.name+" Зарплата: "+woman1.salary+" рублей");
       woman1.payday();
        //System.out.println("Имя сотрудника: "+woman1.name+" Увеличенная зарплата: "+woman1.salary+" рублей");
        System.out.println(" ");



    }
}
