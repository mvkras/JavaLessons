package Udemy.testing;
import java.util.ArrayList;

public class Lesson31_Continue_Interface {
    public static void main(String[] args) {
        ArrayList<Student3>list=new ArrayList<>();
        Student3 st1=new Student3("Дмитрий",27,'M',4,4.5f);
        Student3 st2=new Student3("Степан",26,'M',4,4.8f);
        Student3 st3=new Student3("Настя",25,'Ж',3,4.0f);
        Student3 st4=new Student3("Мария",26,'Ж',3,3.7f);
        Student3 st5=new Student3("Кеша",24,'M',2,4.2f);
        StudentInfo si=new StudentInfo();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
    Find_Students_Overgrade fso=new Find_Students_Overgrade();



    }
}

class Student3{
    String name;
    int age;
    char sex;
    int course;
    float avggrade;

    Student3(String name, int age, char sex, int course, float avggrade)//Создаем конструктор
    {
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.course=course;
        this.avggrade=avggrade;

    }
}

class StudentInfo1{
    void printStudent(Student3 st) //Создаем Метод
    {
        System.out.println("Имя: "+st.name+", Пол: "+st.sex+", Возраст: "+st.age+", Курс: "+st.course+", Средний бал: "+st.avggrade);
    }
    //-----------------------------------------------Метод, фильтрации студентов-по оценкам---------------------------------------
    void printStudentsOverGrade(ArrayList<Student3> al, float avggrade) //Будем проводить фильтрацию студентов
    {
        for(Student3 x:al){         //Из списка берутся студенты по одному и проверяются их средняя оценка
            if(x.avggrade>avggrade)
            {
                printStudent(x);
            }
        }
    }

    void printStudentsUnderGrade(ArrayList<Student3>al, float avggrade) //Будем проводить фильтрацию студентов
    {
        for(Student3 x:al){         //Из списка берутся студенты по одному и проверяются их средняя оценка
            if(x.avggrade<avggrade) //Оценка меньше той, что есть в методе
            {
                printStudent(x);
            }
        }
    }

    //----------------------------------------Фильтрация по возрасту--------------------------------------------------------
    void printStudentsOverAge(ArrayList<Student3>al, int age) //Будем проводить фильтрацию студентов, которые старше
    {
        for(Student3 x:al){         //Из списка берутся студенты по одному и проверяются их средняя оценка
            if(x.avggrade>age) //Оценка меньше той, что есть в методе
            {
                printStudent(x);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student3>al, int age) //Будем проводить фильтрацию студентов, которые младше
    {
        for(Student3 x:al){         //Из списка берутся студенты по одному и проверяются их средняя оценка
            if(x.avggrade<age) //Оценка меньше той, что есть в методе
            {
                printStudent(x);
            }
        }
    }
    //---------------------------------------Фильтрация по полу-------------------------------------------------------------
    void printStudentsSex(ArrayList<Student3>al, char sex) //Будем проводить фильтрацию студентов, которые младше
    {
        for(Student3 x:al){         //Из списка берутся студенты по одному и проверяются их средняя оценка
            if(x.sex==sex) //Оценка меньше той, что есть в методе
            {
                printStudent(x);
            }
        }
    }

    //--------------------------------------------Смешанная фильтрация------------------------------------------------------
    void printStudentsMIX(ArrayList<Student3>al, float avggrade, int age, char sex) //Будем проводить фильтрацию студентов, которые младше
    {
        for(Student3 x:al){         //Из списка берутся студенты по одному и проверяются их средняя оценка
            if(x.avggrade>avggrade && x.age<age && x.sex==sex) //Оценка меньше той, что есть в методе
            {
                printStudent(x);
            }
        }
    }
    void testStudent(ArrayList<Student3> al, StudentChecks sc){
        for (Student3 x:al){
            if(sc.testStudent(x)){
                printStudent(x);
            }
        }
    }
}



class Find_Students_Overgrade implements StudentChecks{

    @Override
    public boolean testStudent(Student3 x){
        return x.avggrade>(4.0f);
    }
}

//-------------------------------Интерфейс, который содержит в себе абстрактный метод-----------------------------------
interface StudentChecks{
boolean testStudent(Student3 x);
}