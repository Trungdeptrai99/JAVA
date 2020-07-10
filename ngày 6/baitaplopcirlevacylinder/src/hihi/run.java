package hihi;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       boolean isRun = true;
       while (isRun){
           System.out.println("Nhập bán kính");
           double a = sc.nextDouble();
           System.out.println("Nhập chiều cao");
           double b =sc.nextDouble();
           Cylinder obj1 = new Cylinder(a,b);
           System.out.println("Chiều cao là " +obj1.getHeight());
           System.out.println("Bán kính là "+obj1.getRadius());
           System.out.println("Diện tích đáy là "+obj1.getArea());
           System.out.println("Thể tích là " + obj1.getVolume());
           System.out.println("1. Tiếp tục");
           System.out.println("2. Exit");
           int option = sc.nextInt();
           switch (option){
               case 1:{
                   isRun = true;
                   break;
               }
               case 2:{
                   isRun= false;
               }
           }
       }
    }
}
