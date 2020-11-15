public class Shape {
    private String color;
    private boolean filled;

    Shape(){
        this.color="red";
        this.filled=true;
    }
    Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
