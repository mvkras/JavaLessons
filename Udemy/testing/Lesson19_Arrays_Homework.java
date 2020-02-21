package Udemy.testing;
import java.util.Arrays;          //ИМПОРТИРУЕМ ПАКЕТ java.util.Arrays; ДЛЯ СОРТИРОВКИ МАССИВА

public class Lesson19_Arrays_Homework {
}

class Array{
    int[] sortirovka;


    public static void main(String[] args) {
       Array array=new Array();
       System.out.println("Неотсортированный массив: ");
        int [] sortirovka={5,10,17,0,-5,-4,-2,2,1,3,9};
        for (int i=0; i<sortirovka.length;i++) {
            System.out.print(sortirovka[i] + ", ");

        }
        System.out.println(" ");

//-------------------------------------------СОРТИРУЕМ МАССИВ С ПОМОЩЬЮ ARRAYS.SORT-------------------------------------
        Arrays.sort(sortirovka);
        System.out.println("Отсортированный массив: ");
        for(int i=0; i<sortirovka.length;i++) {
            System.out.print(sortirovka[i] + ", ");

        }


    }
}