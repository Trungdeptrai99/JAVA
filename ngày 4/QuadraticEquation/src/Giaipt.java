import java.sql.SQLOutput;
import java.util.Scanner;

public class Giaipt {
    public static void main(String[] args) {
       boolean isStop= false;
       while (!isStop){
           Scanner sc= new Scanner(System.in);
           System.out.println("Nhập a");
           double a = sc.nextDouble();
           System.out.println("Nhập b");
           double b= sc.nextDouble();
           System.out.println("Nhập c");
           double c = sc.nextDouble();
           QuadraticEquation qe = new QuadraticEquation(a,b,c);
           if(qe.getDiscriminant()<0){
               System.out.println("Phương trình vô nghiệm bạn tôi ơi!");
           }else if(qe.getDiscriminant()==0){
               System.out.println("Phương trình có nghiệm duy nhất" +(-b/2*a));
           }else {
               System.out.println("Phương trình có 2 nghiệm");
               System.out.println("x1= "+(-b+Math.sqrt(qe.getDiscriminant()))/(2*a) );
               System.out.println("x2= "+(-b-Math.sqrt(qe.getDiscriminant()))/(2*a) );
           }
           System.out.println("1.Giải tiếp");
           System.out.println("2.Exit");
           int option = sc.nextInt();
           switch (option){
               case 1:{
                   isStop = false;
                   break;
               }
               case 2:{
                   isStop= true;
               }
           }
       }
    }
}
