public class Cylinder {
    public static double getBaseArea(int radius){
        return Math.PI*Math.pow(radius,2);
    }

    public static double getVolume(int radius, int height){
        double volume =  height  * getBaseArea(radius);
        return volume;
    }
}
