package Udemy.testing;

public class Lesson12_IF_ELSE {

    public static void main(String[] args) {
        int x=45;
        int y=75;

        if (x<=45 && y>70)
        {

            System.out.println(x+" "+y);
        }
        else
        {
            x--;
            System.out.println("Error "+x);
        }
    }
}
