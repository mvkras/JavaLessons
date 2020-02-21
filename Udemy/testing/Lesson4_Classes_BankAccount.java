package Udemy.testing;

public class Lesson4_Classes_BankAccount { //Создали класс Банковского счета, прописали значения
    int id;
    String name;
    double balance;

    double add_money(double popolnenie) //1 Метод - пополнение наличных
    {
        System.out.println(" ");
        System.out.println("Информация о счете клиента: "+name +" "+ balance+" рублей");
        System.out.println("Пополнение на сумму: "+ popolnenie+" рублей");
        balance+=popolnenie;
        System.out.print("Баланс после пополнения: "+balance);
        System.out.println(" ");
        return balance;
    }

    double take_money(double snyatie) //2 Метод - Снятие денег
    {
        System.out.println(" ");
        System.out.println("Информация о счете клиента: "+name +" "+ balance+" рублей");
        System.out.println("Снятие на сумму: "+snyatie+" рублей");
        balance-=snyatie;
        System.out.println("Баланс после снятия: "+balance+ "рублей");
        System.out.println(" ");
        return balance;
    }


                    //ИСПОЛЬЗУЕМ ЭТОТ КЛАСС КАК ШАБЛОН, А ВО 2м - сами операции
        public static void main(String[] args)//Создали объект
        {
    //--------------------------Создаем 3 объекта класса------------------------------
        Lesson4_Classes_BankAccount Mybank=new Lesson4_Classes_BankAccount();
        Lesson4_Classes_BankAccount Hisbank=new Lesson4_Classes_BankAccount();
        Lesson4_Classes_BankAccount Thembank=new Lesson4_Classes_BankAccount();
        //-----------------------------------------------------------------------------------
        Mybank.id=1;//Присваиваем значения объекту
        Mybank.name="Andrew";
        Mybank.balance=245_000;
            Mybank.add_money(21_900);



        //------------------------------------------------------------------------
        Hisbank.id=2;
        Hisbank.name="Mike";
        Hisbank.balance=1_898_445;
        Hisbank.add_money(215_545);


        //-----------------------------------------------------------------------
        Thembank.id=3;
        Thembank.name="Sasha";
        Thembank.balance=415_080;
            Thembank.take_money(80);




    }

}





//--------------------------------------СОЗДАЕМ ЕЩЕ ОДИН КЛАСС-----------------------------------------------------
/*
    class BankAccountTest   //Внутри класса записываем метод main
    {                           //В этом классе проводим операции над объектами банка
        public static void main(String[] args) {

            //--------------------------Создаем 3 объекта класса------------------------------
            Lesson4_Classes_BankAccount Mybank = new Lesson4_Classes_BankAccount();
            Lesson4_Classes_BankAccount Hisbank = new Lesson4_Classes_BankAccount();
            Lesson4_Classes_BankAccount Thembank = new Lesson4_Classes_BankAccount();
            //-----------------------------------------------------------------------------------
            Mybank.id = 1;//Присваиваем значения объекту
            Mybank.name = "Andrew";
            Mybank.balance = 245_000;
            System.out.println("Мой баланс: " + Mybank.balance);

            //------------------------------------------------------------------------
            Hisbank.id = 2;
            Hisbank.name = "Mike";
            Hisbank.balance = 1_898_445;
            System.out.println("Его баланс: " + Hisbank.balance);

            //-----------------------------------------------------------------------
            Thembank.id = 3;
            Thembank.name = "Sasha";
            Thembank.balance = 415_080;
            System.out.println("Их баланс: " + Thembank.balance);
        }

    }

 */



