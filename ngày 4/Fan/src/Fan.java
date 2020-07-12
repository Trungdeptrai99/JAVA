public class Fan {

    public final int slow = 1;

    public final int medium = 2;

    public final int fast = 3;

    public int speed = slow;

    private boolean on = false;

    private double radius=5;

    private String color ="blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){}

    @Override
    public String toString() {
        if(isOn()){
            return "Bán kính "+ radius+" Tốc độ "+ speed+" Màu "+ color+" Fan is on";
        }
        else return "fan is off";
    }

    public static void main(String[] args) {
        Fan a= new Fan();
        a.setOn(true);
        System.out.println(a);
    }
}
