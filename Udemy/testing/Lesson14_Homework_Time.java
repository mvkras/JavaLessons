package Udemy.testing;

public class Lesson14_Homework_Time {
}

class Time
{
    public static void main(String[] args) {
      OUTHER:  for (int hour=0; hour<=6;hour++)
        {
        MIDDLE:    for(int minute=0;minute<=59;minute++)
            {
                if(hour>1&& minute %10==0) {break OUTHER;}
         INNER:   for(int second=0;second<=59;second++)
            {
                if(second*hour>minute)   { continue INNER;}
                System.out.println(hour+":"+minute+":"+second);
            }
            }
        }

    }
}