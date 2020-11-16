import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ProgramTest {
    public static void main(String[] args) {
        do {
            menu();
            System.out.print("Choice menu: ");
            int choice=(int) checkNumber("choice menu");
            long start=System.currentTimeMillis();
            switch (choice){
                case 1:
                    circles();
                    break;
                case 2:
                    square();
                    break;
                case 3:
                    rectangle();
                    break;
                case 4:
                    circleComparator();
                    break;
                case 5:
                    cylinder();
                case 0:
                    System.out.println("Bye bye");
                    return;
            }
            long end=System.currentTimeMillis();
            System.out.println(end-start);
        }while (true);
    }
    public static void menu(){
        System.out.println("Menu: ");
        System.out.println("1. Circles");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. CircleComparator");
        System.out.println("5. Cylinder");
        System.out.println("0. Exit");
    }
    public static void circles(){
        Circle circle = new Circle();
        circle.resize(randomPercent());
        System.out.println(circle);

        circle = new Circle(3.5);
        circle.resize(randomPercent());
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        circle.resize(randomPercent());
        System.out.println(circle);
    }
    public static void cylinder(){
        Cylinder cylinder=new Cylinder(7.8);
        System.out.println(cylinder);
    }
    public static void square(){
        Shape shape=new Shape();
        System.out.println(shape);
        shape=new Shape("yellow",false);
        System.out.println(shape);

        Square square=new Square();
        System.out.println(square);

        square=new Square(2.3);
        System.out.println(square);

        square=new Square(5.8,"yellow",true);
        System.out.println(square);
    }
    public static void rectangle(){
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);
        rectangle=new Rectangle(2.5,3.8);
        System.out.println(rectangle);

        rectangle=new Rectangle(2.5,3.8,"orange",true);
        System.out.println(rectangle);
    }
    public static void circleComparator(){
        ComparableCircle[] circles=new ComparableCircle[5];
        circles[0]=new ComparableCircle(3.5);
        circles[1]=new ComparableCircle();
        circles[2]=new ComparableCircle(7);
        circles[4]=new ComparableCircle(3.5,"indigo",false);

        circles[3]=new ComparableCircle(7,"while",false);


        System.out.println("Pre-sorted");
        for (ComparableCircle circle1:circles){
            System.out.println(circle1);
        }
        Arrays.sort(circles);
        System.out.println("After-sorted");
        for (ComparableCircle circle1:circles){
            System.out.println(circle1);
        }

        Arrays.sort(circles,new CircleComparator());
        System.out.println("After-sorted-comparator");
        for (ComparableCircle circle1:circles){
            System.out.println(circle1);
        }

        Arrays.sort(circles, new Comparator<ComparableCircle>() {
            @Override
            public int compare(ComparableCircle o1, ComparableCircle o2) {
                if (o1.getRadius()>o2.getRadius()) return -1;
                else if(o1.getRadius()<o2.getRadius()) return 1;
                else
                    return o1.getColor().compareTo(o2.getColor());
            }
        });
        System.out.println("After-sorted-comparator-2if");
        for (ComparableCircle circle1:circles){
            System.out.println(circle1);
        }
    }
    public static double randomPercent(){
        return Math.random()+1;
    }
    public static double checkNumber(String mess){
        boolean check=true;
        double number=0;
        Scanner input= new Scanner(System.in);

        do {
            try{
                number=Double.parseDouble(input.nextLine());
                check=false;
            }catch (Exception e){
                System.out.println(" Please try again "+mess);
            }
        }while (check);
            return number;
    }
}
