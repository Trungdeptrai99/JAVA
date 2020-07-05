import java.util.Scanner;
public class kiemtrasonguyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số đây bạn eiii");
        int number = scanner.nextInt();
        boolean songuyento = true;
        if (number < 2) {
            System.out.println(number + " Không phải số nguyên tố");
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    songuyento = false;
                    break;
                }
            }
            if (songuyento) {
                System.out.println(number + " là số nguyên tố");
            } else System.out.println(number + " không là số nguyên tố");
        }
    }
}