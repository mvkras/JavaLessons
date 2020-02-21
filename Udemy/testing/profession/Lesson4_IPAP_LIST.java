package Udemy.testing.profession;

import java.util.ArrayList;
import java.util.List;

public class Lesson4_IPAP_LIST {
    public static void main(String[] args) {
System.out.println("Pass"+(5+(-5))+"rd");

    int x = 312;
    int y = 641;
    while ((x != y) && (x> 1) && (y>1)){
         if (x > y) {
             x = x - y;
             System.out.print(" "+x+" ");
         }
      else  if (y > x)
        {
             y = y - x;
             System.out.print(" "+ y+ " ");
         }
      else if (x == y) {
          System.out.print("Результат равен "+x);
         }
      else {
          System.out.print("Результат равен "+1);
         }

    }

    }

}


