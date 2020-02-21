package Udemy.testing;
import java.util.ArrayList;         //Чтобы делать фильтрацию студента по определенным параметрам

public class Lesson31_Lambda {
    public static void main(String[] args) {
    ArrayList<Student1>list=new ArrayList<>();
    //Создали объекты студентов
    Student1 st1=new Student1("Дмитрий",27,'M',4,4.5f);
    Student1 st2=new Student1("Степан",26,'M',4,4.8f);
    Student1 st3=new Student1("Настя",25,'Ж',3,4.0f);
    Student1 st4=new Student1("Мария",26,'Ж',3,3.7f);
    Student1 st5=new Student1("Кеша",24,'M',2,4.2f);
    //-----------------------------------------------------------------------------------------------------------------
        //добавили студентов в лист массива
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        //Создаем объект класса студент инфо
        StudentInfo si=new StudentInfo();
//        si.printStudent(st1);//Вызываем метод
//        si.printStudent(st2);
//        si.printStudent(st3);
//        si.printStudent(st4);
//        si.printStudent(st5);
        si.printStudentsOverGrade(list,4.0f);   //у кого средняя оценка >4.0
        System.out.println("---------------------------------------------------------");
        si.printStudentsUnderGrade(list,4.0f);  //у кого меньше
        System.out.println("---------------------------------------------------------");
        si.printStudentsOverAge(list,25);
        System.out.println("---------------------------------------------------------");
        si.printStudentsSex(list,'Ж');
    }
}

    class Student1{
String name;
int age;
char sex;
int course;
float avggrade;

Student1(String name, int age, char sex, int course, float avggrade)//Создаем конструктор
{
    this.name=name;
    this.age=age;
    this.sex=sex;
    this.course=course;
    this.avggrade=avggrade;
}
}

    class StudentInfo{
    void printStudent(Student1 st) //Создаем Метод
    {
        System.out.println("Имя: "+st.name+", Пол: "+st.sex+", Возраст: "+st.age+", Курс: "+st.course+", Средний бал: "+st.avggrade);
    }
    //-----------------------------------------------Метод, фильтрации студентов-по оценкам---------------------------------------
    void printStudentsOverGrade(ArrayList<Student1>al, float avggrade) //Будем проводить фильтрацию студентов
    {
        for(Student1 x:al){         //Из списка берутся студенты по одному и проверяются их средняя оценка
            if(x.avggrade>avggrade)
            {
                printStudent(x);
            }
        }
    }

        void printStudentsUnderGrade(ArrayList<Student1>al, float avggrade) //Будем проводить фильтрацию студентов
        {
            for(Student1 x:al){         //Из списка берутся студенты по одному и проверяются их средняя оценка
                if(x.avggrade<avggrade) //Оценка меньше той, что есть в методе
                {
                    printStudent(x);
                }
            }
        }

//----------------------------------------Фильтрация по возрасту--------------------------------------------------------
        void printStudentsOverAge(ArrayList<Student1>al, int age) //Будем проводить фильтрацию студентов, которые старше
        {
            for(Student1 x:al){         //Из списка берутся студенты по одному и проверяются их средняя оценка
                if(x.avggrade>age) //Оценка меньше той, что есть в методе
                {
                    printStudent(x);
                }
            }
        }

        void printStudentsUnderAge(ArrayList<Student1>al, int age) //Будем проводить фильтрацию студентов, которые младше
        {
            for(Student1 x:al){         //Из списка берутся студенты по одному и проверяются их средняя оценка
                if(x.avggrade<age) //Оценка меньше той, что есть в методе
                {
                    printStudent(x);
                }
            }
        }
//---------------------------------------Фильтрация по полу-------------------------------------------------------------
void printStudentsSex(ArrayList<Student1>al, char sex) //Будем проводить фильтрацию студентов, которые младше
{
    for(Student1 x:al){         //Из списка берутся студенты по одному и проверяются их средняя оценка
        if(x.sex==sex) //Оценка меньше той, что есть в методе
        {
            printStudent(x);
        }
    }
}

//--------------------------------------------Смешанная фильтрация------------------------------------------------------
void printStudentsMIX(ArrayList<Student1>al, float avggrade, int age, char sex) //Будем проводить фильтрацию студентов, которые младше
{
    for(Student1 x:al){         //Из списка берутся студенты по одному и проверяются их средняя оценка
        if(x.avggrade>avggrade && x.age<age && x.sex==sex) //Оценка меньше той, что есть в методе
        {
            printStudent(x);
        }
    }
}

}
