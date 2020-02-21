package Udemy.testing;

import java.util.Scanner;

public class Lesson4_Homework_Student {
    int id;
    String name;
    int age;
    float math;
    float eng;
    float economy;
    //float avg_mark=(math+economy+eng)/3;  //Средний бал по предметам

    float middle_mark(Lesson4_Homework_Student student)
    {
        float avg_mark=(student.math+student.economy+student.eng)/3;
        System.out.println("Имя студента: "+student.name+" Средняя оценка= "+avg_mark);
        return avg_mark;
    }

    Lesson4_Homework_Student( int id1, String name1, int age1, float math1, float eng1, float economy1)
    {
        id=id1;
        name=name1;
        age=age1;
        math=math1;
        eng=eng1;
        economy=economy1;
    }

    Lesson4_Homework_Student(int id2, String name2, int age2)
    {
        this(id2,name2,age2,0.0f,0.0f,0.0f);

    }

    Lesson4_Homework_Student()
    {
        //this(0, null, 0, 0.0f,0.0f,0.0f); либо так, либо так
    }

}

class Student{
    public static void main(String[] args) {


        //-----------------------------------СОЗДАЕМ ОБЪЕКТЫ----------------------------------------------
        Lesson4_Homework_Student student1=new Lesson4_Homework_Student();
        Lesson4_Homework_Student student2=new Lesson4_Homework_Student();
        Lesson4_Homework_Student student3=new Lesson4_Homework_Student();
        Lesson4_Homework_Student student4=new Lesson4_Homework_Student();
        Lesson4_Homework_Student student5=new Lesson4_Homework_Student();

        //--------------------------------ПРИПИСЫВАЕМ ЗНАЧЕНИЯ ОБЪЕКТАМ-----------------------------------
        student1.id=1;
        student1.name="Дмитрий";
        student1.age=4;
        student1.math=4.5f;
        student1.eng=5.0f;
        student1.economy=3.8f;


        //----------------------------------------STUDENT 2------------------------------------------
        student2.id=2;
        student2.name="Саша";
        student2.age=3;
        student2.math=3.5f;
        student2.eng=4.0f;
        student2.economy=4.8f;


        //---------------------------------------STUDENT 3----------------------------------------------
        student3.id=3;
        student3.name="Настя";
        student3.age=5;
        student3.math=2.9f;
        student3.eng=4.5f;
        student3.economy=4.4f;

        //-------------------------------------STUDENT 4-------------------------------------------------
        student4.id=4;
        student4.name="Лена";
        student4.age=2;
        student4.math=3.5f;
        student4.eng=5.0f;
        student4.economy=4.3f;


        //------------------------------------STUDENT 5----------------------------------------------------
        student5.id=5;
        student5.name="Паша";
        student5.age=1;
        student5.math=3.7f;
        student5.eng=3.9f;
        student5.economy=4.8f;

//-----------------------------------------------Создаем объект класса студент для вывод информации средней оценки
        Lesson4_Homework_Student st=new Lesson4_Homework_Student();
        st.middle_mark(student1);
        st.middle_mark(student2);
        st.middle_mark(student3);
        st.middle_mark(student4);
        st.middle_mark(student5);

        Lesson4_Homework_Student std1=new Lesson4_Homework_Student();
        System.out.println(std1.name);
        Lesson4_Homework_Student std2=new Lesson4_Homework_Student(1,"Петров",4,3.5f,5.0f,4.4f);
        System.out.println(std2.name+" "+std2.age+" "+std2.math);
        Lesson4_Homework_Student std3=new Lesson4_Homework_Student(1,"Сидоров", 3);
        System.out.println(std3.id+" "+std3.name+" "+std3.age+" "+std3.economy);


/*
        int a,b;
        System.out.println("Введите 2 числа: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b&& b!=0)
            System.out.println(a%b);
        else
            if(a!=0)
                System.out.println(b%a);

 */
    }
}

