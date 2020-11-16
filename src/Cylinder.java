public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
    }
    public  Cylinder(double height){
        this.height=height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double volumeCircle(){
        return height*getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height= " + height +
                " radius= "+ getRadius()+
                " volume Circle= "+volumeCircle() +
                '}';
    }
}
