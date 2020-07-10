package hihi;

public class Circle {
    private String color="Red";

    private double radius;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double area = this.radius*this.radius*Math.PI;
        return area;
    }

}
