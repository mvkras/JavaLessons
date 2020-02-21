package Udemy.testing;

public class Lesson15_DO_WHILE {
    public static void main(String[] args) {
        int x=4;
        while (x<10)                    //Пока x меньше 10 - выводи на экран условие, затем увеличивай число на +1
        {                               //Затем цикл прекращается
            System.out.println("Проверка условия: "+x);
            x++;
        }

        int money=500;
        while (money>0)
        {
            System.out.println(" ");
            System.out.println("Ваши деньги: "+money);
            System.out.println("Делайте ставку: 100");
            System.out.println(" ");
            money-=100;

        }

        //-----------------------------------------------DO WHILE--------------------------------------------------
        int car=1;
        do {

            System.out.println("Машина №:"+car);
            car++;
        }
        while (car<=6);

//---------------------------------------------------DO WHILE TIME---------------------------------------------------
   int hour=0;
  OUTHER:
   do{
       int minute=0;
        INNER:
       while (minute<=59)       //Внутренний цикл
       {
           System.out.println(hour+":"+minute);  //будет продолжаться цикл, до тех пор, пока минута не будет равно 59
           minute++;
       }
       hour++;  //после того, как минута стала 59, час увеличивается на 1
   }
   while (hour<=23);   //до тех пор, пока час не будет равен 23

    }

}
