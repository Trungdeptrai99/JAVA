import java.util.Scanner;
public class ungdungtinhtienlaichovay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền vào đây");
        double money = scanner.nextDouble();
        System.out.println("Nhập lãi suất theo tháng vào đây");
        double percent = scanner.nextDouble();
        System.out.println("Nhập số tháng gửi vào đây");
        double month = scanner.nextDouble();
        double tienlai = money*percent*month/100/12;
        System.out.println(tienlai);
    }
}
