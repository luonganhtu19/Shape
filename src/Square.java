import java.awt.*;

public class Square extends Rectangle {
    Square(){};
    Square(double side){
        super(side,side);
    };
    Square(double side,String  color,boolean filled){
        super(side,side,color,filled);
    };

    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }
    public double getSide(){
        return getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                ", which is a subclass of"+super.toString()+
                '}';
    }
}
