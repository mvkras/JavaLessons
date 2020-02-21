package Udemy.testing;

public class Lesson15_Homework_Time {

    //-------------------------------------------Написать цикл времени с использованием DO WHILE--------------------------------
        public static void main(String[] args) {
           int hour=0;
           int minute=0;
           int second=0;
            OUTHER:  while (hour<23)
                                {hour++;}
            {
                MIDDLE:    do
                {
                    minute++;
                }
                while (minute<59);
                {
                    INNER:   while (second<59)
                    {second++;}
                    {
                        System.out.println(hour+":"+minute+":"+second);
                    }
                }
            }

        }
    }

