import java.util.Scanner;

public class Triangle extends Shape {

    public double getPerimeter(){
        return getSide1()+getSide2()+getSide3();
    }

    public Triangle(){}

    public Triangle(double canh1,double canh2, double canh3){
        super(canh1,canh2,canh3);
    }

    public double getArea(){
       double area = Math.sqrt(getPerimeter()/2*
               (getPerimeter()/2-getSide1())*
               (getPerimeter()/2-getSide2())*
               (getPerimeter()/2-getSide3()));
       return area;
    }

    public static void main(String[] args) {
        Triangle a = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh 1");
        double canh1 = sc.nextDouble();
        System.out.println("Nhập cạnh 2");
        double canh2 = sc.nextDouble();
        System.out.println("Nhập cạnh 3");
        double canh3 = sc.nextDouble();
        Triangle b = new Triangle(canh1,canh2,canh3);
        System.out.println(a.getPerimeter()+"-"+a.getArea());
        System.out.println(b.getPerimeter()+"-"+b.getArea());
    }
}
