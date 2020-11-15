import java.awt.*;

public class Square extends Rectangle implements Colorable {
    Square(){};
    Square(double side){
        super(side,side);
    };
    Square(double side,String  color,boolean filled){
        super(side,side,color,filled);
        howToColor();
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

    @Override
    public void resize(double percent) {
        double side=(double) Math.round(this.getSide()*percent*100)/100;
        this.setSide(side);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
