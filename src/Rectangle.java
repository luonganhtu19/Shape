public class Rectangle extends Shape {
    private double width;
    private double length;

    Rectangle(){};
    Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    };
    Rectangle(double width,double length,String color,boolean filled){
        this.width=width;
        this.length=length;
        this.setColor(color);
        this.setFilled(filled);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", isFiller"+isFilled()+
                '}';
    }

}
