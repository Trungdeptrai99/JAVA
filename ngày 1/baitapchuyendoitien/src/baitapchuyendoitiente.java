import java.util.Scanner;
public class baitapchuyendoitiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số USD vào đây bạn eiii: ");
        double Usd = scanner.nextDouble();
        double VND = Usd*23000;
        System.out.println(Usd+"USD to VND is: "+VND);

    }
}
