import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhập number");
            int number = sc.nextInt();
            System.out.println(FizzBuzz.fizzBuzz(number));
           if(number==10){
               System.out.println("Muoi");
           }else {
            int hangchuc =number/10;
            int hangDonVi = number%10;
            System.out.println(FizzBuzz.speakHangChuc(hangchuc)+" "+ FizzBuzz.speakUnit(hangDonVi));
           }
        }while (true);
    }
}
