package TEST;
import java.util.Scanner;
import TEST2.*;
public class Simple{
    public static void main(String args[]) {
        System.out.println("Nhập lựa chọn vào đây");
        System.out.println("1.Hello in Vietnamese");
        System.out.println("2.Lời hay ý đẹp ");
         Scanner sc = new Scanner(System.in);
         int option = sc.nextInt();
         switch (option){
             case 1:{
                hihi.say();
                 break;
             }
             case 2:{
                 hihi2 a = new hihi2();
                 a.loihayydep();
             }
         }

    }
}

