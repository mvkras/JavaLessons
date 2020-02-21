package Udemy.testing;

public class Lesson25_Abstract_Classes_AND_Methods {
}
//-------------------------------------Абстрактные классы и методы------------------------------------------------------
abstract class Figure{  //создадим общий класс фигура с общими параметрами, называем его абстрактным, т.к.
int kol_vo_storon=0; //для каждой фигуры будут своим методы нахождения площади, периметра и тд. Данный класс абстрактный
abstract void perimetr();  //раз тела нам не известны, убираем их тела {} и пишем абстрактный метод
abstract void square();
void showInfo(){System.out.println("Эта фигура: ");};

Figure(int kol_vo_storon)//Конструктор абстрактного класса
{
    this.kol_vo_storon=kol_vo_storon;
}
}

//-------------------------------------------ПОДКЛАССЫ КЛАССА ФИГУРА-(КВАРДРАТ)-----------------------------------------
class Kvadrat extends Figure{
    Kvadrat(int kol_vo_storon)
    {
        super(kol_vo_storon);
    }
    int kol_vo_storon=4;
    int storona1=10;
    @Override           //Перезаписали методы (@override)
    public void perimetr(){System.out.println("Периметр квадрата равен: "+storona1);};
    @Override
    public void square(){System.out.println("Площадь квадрата равна: "+storona1*storona1);};
}

//-----------------------------------------------ПРЯМОУГОЛЬНИК----------------------------------------------------------
class Pryamougolnik extends Figure{
    Pryamougolnik (int kol_vo_storon)
    {
        super(kol_vo_storon);
    }
    int kol_vo_storon=4;
    int storona2=8;
    int storona3=10;
    @Override
    public void perimetr(){System.out.println("Периметр прямоугольника равен: "+(storona2+storona3)*2);};
    @Override
    public void square(){System.out.println("Площадь прямоугольника равна: "+storona3*storona2);};
}

//-------------------------------------------------ОКРУЖНОСТЬ-----------------------------------------------------------
class Krug extends Figure{
    Krug(int kol_vo_storon)
    {
        super(kol_vo_storon);
    }
    int kol_vo_storon=0;
    int radius1=3;
    @Override
    public void perimetr(){System.out.println("Периметр окружности равен: "+2*3.14*radius1);};
    @Override
    public void square(){System.out.println("Площадь окружности равна: "+3.14*radius1*radius1);};
}

//----------------------------------------------ЧЕТЫРЕХУГОЛЬНИК---------------------------------------------------------
abstract class Quadrangle extends Figure{
    Quadrangle(int kol_vo_storon)
    {
        super(kol_vo_storon);
    }
    void def (){System.out.println("Это четырехугольник: ");}
}
class abc {
    public static void main(String[] args) {
Krug kr=new Krug(0);
kr.square();
kr.perimetr();
    }
}