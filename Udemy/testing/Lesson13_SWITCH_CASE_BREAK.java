package Udemy.testing;

public class Lesson13_SWITCH_CASE_BREAK {
}

class Schoolboy{
    int mark;

    Schoolboy(int mark) //Создадим конструктор
    {
        this.mark=mark;
    }

    //--------------------------------Выводим инфу, как учится школьник----------
    public static void main(String[] args) {
        Schoolboy boy=new Schoolboy(4);
        if(boy.mark>3)
        {
            System.out.println("Парень учится хорошо "+boy.mark);
        }
        else if(boy.mark==3)
        {
            System.out.println(" Парень учится плохо "+boy.mark);
        }
        else
        {
            System.out.println(" Парень отсталый даун "+boy.mark);
        }

        //-----------------------------------------------SWITCH-----------------------------
        switch (boy.mark) //Пишем, что будем сравнивать
        {
            case 2:System.out.println("Школьник отстает ");  break; //Условие 1
            case 3:System.out.println("Школьнику нужно наверстать ");  break; //Условие 2
            case 4:System.out.println("Школьник хорошист ");  break;
            case 5:System.out.println("Школьник отличник ");  break;
            default: System.out.println("Ничего не вышло: "); break; //если ничего не сработало
        }
    }
}