package Udemy.testing;

//---------------------------------------------ООП: НАСЛЕДОВАНИЕ--------------------------------------------------------

public class Lesson24_OOP_PARENTS_Nasledovanie {
    String name;
    int age;
    int experience;

    public static void main(String[] args) {
        Doctor doc=new Doctor();
        doc.age=25;
        doc.name="Василий";
        doc.special_skill="Heal";
        doc.eat();
        doc.heal();

    }
    void eat()
    {
        System.out.println("Есть: ");
    }
    void sleep()
    {
        System.out.println("Спать: ");
    }

    //-------------------------------------Создаем подклассы (детей)----------------------------------------------------
    static class Doctor extends Lesson24_OOP_PARENTS_Nasledovanie
    {
        String special_skill;
        void heal(){System.out.println("Лечить: ");}
    }

    class Teacher extends Lesson24_OOP_PARENTS_Nasledovanie
    {
        String skill;
        void learn_kids(){System.out.println("Обучать детей: ");}
    }

}

