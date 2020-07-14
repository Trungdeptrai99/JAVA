public class Run {
    public static void main(String[] args) {
        Circle[] circles=new Circle[10];
        for(int i=0;i<circles.length;i++){
            circles[i]= new Circle(i);
        }
        for(int i=0;i<=50;i++){
        circles[1].resize(i);
            System.out.println("Bán kính sau khi tăng "+i+"% là:" + circles[1].getRadius());
        }
        }
    }

