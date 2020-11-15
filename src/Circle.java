public class Circle extends Shape {
    private double radius;
    Circle(){ this.radius=1;}
    Circle(double radius){
        this.radius=radius;
    }
    Circle(double radius,String color,boolean filled){
        this.radius=radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with{" +
                "radius=" + getRadius() +
                " , which is a subclass of "+
                super.toString()+
                '}';
    }
}
