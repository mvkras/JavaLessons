package Udemy.testing;
import java.util.ArrayList;
import java.util.function.Supplier;     //Поставщик, поставляет объекты, когда его метод вызывается
import java.util.function.Consumer;     //Потребитель, потребляет объект. что-то сделать с объектом

public class Lesson31_Lambda2 {
    static void def(test t){
    System.out.println(t.abc("Привет!"));
    }

//    public static void main(String[] args) {
//       def(x->x.length());   //вызвывем метод def
//    }
}

    interface test{
        int abc(String s);//метод abc
        }

        class Auto1{
    String model;
    String color;
    double engine;

    Auto1(String model,String color,double engine){
    this.model=model;
    this.color=color;
    this.engine=engine;
    }
    public String toString() {
        return "Наша машина: " + model + ", " + color + ", " + engine;
    }
}

class Test{
    public static ArrayList<Auto1> create_cars(Supplier<Auto1> car_Supplier){
        ArrayList<Auto1> al=new ArrayList<>();  //Создаем ArrayList внутри метода
        for(int i=0;i<3;i++)
        {
            al.add(car_Supplier.get()); //Вызываем car_Supplier и его единственный метод get
        }
        return al;  //Возвращаем ArrayList
    }
    public static void ChangeCar(Auto1 car, Consumer<Auto1>consumer){      //CONSUMER (ПОТРЕБИТЕЛЬ)
        consumer.accept(car);
    }
    public static void main(String[] args) { //Данный метод не принимает параметров, создает тип Авто (машину создаем на ходу)
        ArrayList<Auto1>ourCars=create_cars(()->new Auto1("BMW","Желтый",2.0));
        System.out.println("Наши машины: "+ourCars);
        ChangeCar(ourCars.get(0),car->{car.color="silver"; car.engine=2.4;System.out.println("Изменненная машина: "+car);});
        System.out.println(ourCars);
    }
}

