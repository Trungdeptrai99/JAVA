public class MoveablePoint extends Point {

    private float xSpeed=0.0f;

    private float ySpeed=0.0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed= xSpeed;
        this.ySpeed= ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed= xSpeed;
        this.ySpeed= ySpeed;
    }

    public MoveablePoint(){}

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed= xSpeed;
        this.ySpeed= ySpeed;
    }

    public float[] getSpeed(){
        float[] arr = {this.xSpeed,this.ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return "("+this.getX()+"," +this.getY()+")"+","+"Speed="+"("+this.getySpeed()+"," +this.ySpeed+")";
    }
    public float move(float xSpeed, float ySpeed){
       setX(getX()+xSpeed);
       setY((getY()+ySpeed));
       return getX()+getY();
    }

    public static void main(String[] args) {
        MoveablePoint a = new MoveablePoint();
        System.out.println(a.toString());
    }

}
