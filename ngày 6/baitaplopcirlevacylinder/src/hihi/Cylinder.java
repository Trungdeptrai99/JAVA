package hihi;

public class Cylinder extends Circle {
    private double height;


    public Cylinder(double radius,double height){
        this.height= height;
        this.setRadius(radius);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        double volume= this.height*this.getArea();
        return volume;
    }

    public double getHeight() {
        return height;
    }

}
