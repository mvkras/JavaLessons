package Udemy.testing;

public class Lesson2_Udemy {
    public static void main(String[] args)
    {
        //-------------------Представляем числа в разных системах счисления:--------------------
        int a=60; //10тиричная система счисления
        int b=0b111100;  //Двоичная чистема счисления (ставим 0b)
        int c=074;  //В 8ми-ричной счистеме счисления (ставим нуль)
        int d=0x3c;  //В 16ти-ричной системе счисления (ставим нуль x-икс)
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        //----------------------------------------------------------------------------------------
        //----------------------------ДОМАШНЕЕ ЗАДАНИЕ--------------------------------------------
        //Создать по 4 переменных и записать их во всех системах счисления (2ичная, 8ми ричная, 10ти ричная 16ти ричная)

        //----------------------------------BYTE------------------------------------
        byte x=12; //10ти ричная
            byte x1=0b1100; //Двоичная
                 byte x2=014; //8ми ричная
                    byte x3=0xC; //16ти ричная
        System.out.println(x);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

        //-----------------------------------SHORT-----------------------------------
        short y =1300; //Десятиричная
            short y1 =0b101_0001_0100; //Двоичная
                 short y2 =02424; //8ми ричная
                     short y3 =0x514; //16ти ричная
        System.out.println(y);
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);

        //------------------------------------INT----------------------------------
        int z=0;     //Десятиричная
            int z1=0b0; //Двоичная
                 int z2=00; //8ми ричная
                    int z3=0x0; //16ти ричная
        System.out.println(z);
        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);

        //-------------------------------------LONG---------------------------------
        long ln=123456789L;         //Десятиричная
            long ln1=0b111_0101_1011_1100_1101_0001_0101L; //Двоичная
                long ln2=0726_746_425L; //8ми ричная
                    long ln3=0x75BCD15L;  //16ти ричная
        System.out.println(ln);
        System.out.println(ln1);
        System.out.println(ln2);
        System.out.println(ln3);

        //--------------------------------FLOAT, DOUBLE, BOOLEAN-----------------
        float fl=14.88f;
        double db=320.044484d;
        boolean bool=true;
        System.out.println(fl);
        System.out.println(db);
        System.out.println(bool);

        //----------------------------------------CHAR----------------------------
        char j='a';
        char j1=25;
        char j2='\u0019';
        System.out.println(j);
        System.out.println(j1);
        System.out.println(j2);

    }
}
