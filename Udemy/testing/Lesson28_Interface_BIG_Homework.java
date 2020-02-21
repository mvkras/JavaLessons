package Udemy.testing;

public class Lesson28_Interface_BIG_Homework {
    public static void main(String[] args) {
        Mechenosec sword_fish=new Mechenosec("Nemo");
        sword_fish.eat();
        sword_fish.swim();
        sword_fish.sleep();
        System.out.println("Ее зовут "+sword_fish.name);
//----------------------------------------------------------
        Speakeble shkipper=new Pinguin("Шкипер");
        shkipper.speak();
        System.out.println("Имя пингвина: ");

//----------------------------------------------------------
        Animal simba=new Lion("Симба");
        simba.eat();
        simba.sleep();
        System.out.println("Имя льва: "+simba.name);
// ---------------------------------------------------------
        Mammal simba2=new Lion("Симба 2");
        simba2.run();
        System.out.println("Второе имя льва: "+simba2.name);
    }
}
                          //Делаем абстрактный класс и конструктор к нему
abstract class Animal{
    String name;
    Animal(String name){this.name=name;}
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal{

    Fish(String name) {
        super(name);
    }
    @Override
    void sleep(){System.out.println("Всегда интересно наблюдать, как спять рыбы, храпят ли они?");}
    abstract void swim();
}

abstract class Bird extends Animal implements Speakeble{
    Bird(String name)
    {
        super(name);
    }
    public void speak(){System.out.println(name+"sings");}
abstract void fly();
}

abstract class Mammal extends Animal implements Speakeble{  //Mammal - млекопитающее
    Mammal(String name){super(name);}
    abstract void run();
}

   class Mechenosec extends Fish{
    Mechenosec(String name){super((name));}
    @Override
    void swim(){System.out.println("Меченосец, как крестоносец, ему бы в Diablo поиграть");}
    @Override
    void eat(){System.out.println("Меченосец - обычная рыба, которая есть рыбий корм");}
}

class Pinguin extends Bird{
    Pinguin(String name){super(name);}
    @Override
    void eat(){System.out.println("Пингвин любит есть рыбу");}
    @Override
    void sleep(){System.out.println("Пингвины спят, прижавшись друг к дургу");}
    @Override
    void fly(){System.out.println("Пингвины не умеют летать");}
    @Override
    public void speak(){System.out.println("Пингвины не умеют петь как соловьи");}
}

class Lion extends Mammal{
    Lion(String name){super(name);}
    @Override
    void eat(){System.out.println("Лев, как любой хищник любит мясо");}
    @Override
    void sleep(){System.out.println("Больше всего времени львы - спят");}
    @Override
    void run(){System.out.println("Лев - это не самая быстрая кошка");}
}
//---------------------------------------------<СОЗДАЕМ ИНТЕРФЕЙС)>-----------------------------------------------------
interface Speakeble{
default void speak(){System.out.println("Кто-то говорит");};
}