import java.awt.*;

public class ProgramTest {
    public static void main(String[] args) {
        Shape shape=new Shape();
        System.out.println(shape);

        long start=System.currentTimeMillis();
        shape=new Shape("red",false);
        System.out.println(shape);


        Circle circle=new Circle();
        System.out.println(circle);
        circle= new Circle(3.5);
        System.out.println(circle);
        circle= new Circle(3.5,"indigo",false);
        System.out.println(circle);

        long end=System.currentTimeMillis();
        System.out.println(end-start);

        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);

       rectangle=new Rectangle(2.5,3.8);
        System.out.println(rectangle);

        rectangle=new Rectangle(2.5,3.8,"orange",true);
        System.out.println(rectangle);

        Square square=new Square();
        System.out.println(square);

        square=new Square(2.3);
        System.out.println(square);

        square=new Square(5.8,"yellow",true);
        System.out.println(square);
    }
}
