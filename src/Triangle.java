public class Triangle extends Shape{
    private float side1=0;
    private float side2=0;
    private float side3=0;

    Triangle(){};
    Triangle(float side1,float side2,float side3){
            this.side1=side1;
            this.side2=side2;
            this.side3=side3;
    };

    public float getSide1() {
        return side1;
    }

    public float getSide2() {
        return side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }

    private boolean checkSide(float side1, float side2, float side3){
        if (side1+side2>side3&&side2+side3>side1&&side1+side3>side2){
            return true;
        }else return false;
    }
    public double getArea(){
        float halfPerimeter=(float) getPerimeter()/2;
        return Math.pow(halfPerimeter*(halfPerimeter-side1)*(halfPerimeter-side2)*(halfPerimeter-side3),0.5);
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    @Override
    public String toString() {

        return checkSide(side1,side2,side3)?"Triangle{" +
                                            "side1=" + side1 +
                                            ", side2=" + side2 +
                                            ", side3=" + side3 +
                                            ", getArea="+getArea()+
                                            ", getPerimeter"+getPerimeter()+
                                            '}'
                                            :"Not create Triangle";
    }

}
