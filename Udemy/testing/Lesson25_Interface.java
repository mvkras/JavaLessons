package Udemy.testing;

public class Lesson25_Interface {

    String name;
    int age;
    int experience;

    public static void main(String[] args) {
        Help_able help=new Doctor();
        swim_able sw=new Teacher();
        Doctor doc=new Doctor();
        doc.age=25;
        doc.name="Василий";
        doc.special_skill="Heal";
        doc.eat();
        doc.heal();
        sw.swim();
        help.first_aid();

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
    static class Doctor extends Lesson25_Interface implements Help_able
    {
        String special_skill;
        void heal(){System.out.println("Лечить: ");}
        //Перезаписываем методы, чтобы наш класс Доктор не был абстрактным
       public void first_aid(){System.out.println("Доктор оказывает помощь");}
       public void fire_off(){System.out.println("Доктор тушит пожар");}
    }


     static class Teacher extends Lesson25_Interface implements Help_able,swim_able
    {
        String skill;
        void learn_kids(){System.out.println("Обучать детей: ");}
        public void first_aid(){System.out.println("Учитель оказывает помощь");}
        public void fire_off(){System.out.println("Учитель тушит пожар");}
        public void swim(){System.out.println("Учитель плавает");}
    }

}
//------------------------------------------------ИНТЕРФЕЙСЫ------------------------------------------------------------
interface Help_able{
   void first_aid();//Добавляем метод первой помощи он абстрактный, поэтому нет тела
   void fire_off();
}

interface swim_able{
    void swim();
}
