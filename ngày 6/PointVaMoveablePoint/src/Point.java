public class Point {
    private float x = 10.0f;
    private float y =2.0f;
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }
    Point(){}

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x= x;
        this.y=y;
    }
    public float[] getXY(){
        float[] arr = new float[2];
        return arr;
    }

    @Override
    public String toString() {
        return "("+this.x+"," +this.y+")";
    }
}
