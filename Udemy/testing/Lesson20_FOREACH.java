package Udemy.testing;
import java.util.Arrays;

public class Lesson20_FOREACH {
    public static void main(String[] args) {
        int []array={0,8,10,4};  //Создали массив
        for(int a:array)//Делаем цикл foreach, вводим новую переменную а с тем же типом данных, что и array и с ним уже работаем
        { //переменная а принимает значения массива и выводит их на экран
            System.out.print(a+" ");
            System.out.println(" ");
        }
        //---------------------------------------------------------------------------------------------------
        System.out.print("Выводим двумерный массив: ");
        int [][] array2={{78},{15,-10,-2,14},{0,3} }; //Двумерный массив
        System.out.print("{ ");
        for (int i=0; i<array2.length;i++) //int i - это количество элементов массива (его общая длина) сами скобки, сколько их {} {} {}
        {
            System.out.print("{");
            for (int j=0; j<array2[i].length; j++) //int j - это сами элементы массивов, числа, что в скобках
            {
                if(j!=array2[i].length-1)
                {
                    System.out.print(array2[i][j]+", ");
                }
                else {
                    System.out.print(array2[i][j]);
                }
            }
            if(i!=array2.length-1)
            {
                System.out.print("}, ");
            }
            else  {
                System.out.print("}");
            }
        }
            System.out.print("}");
        System.out.println(" ");

        //------------------------------------------Двумарный массив с помощью FOREACH----------------------------------
        System.out.print("Выводим двумерный массив FOREACH: ");
        int [][] array3={{78},{15,-10,-2,14},{0,3} }; //Двумерный массив
        for(int[] array4:array3)
        {
            for(int a:array4)
            System.out.print(a+" ");
        }

    }
}
