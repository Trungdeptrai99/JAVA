import java.util.Scanner;
public class hienthicachinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        int input = scanner.nextInt();
        switch (input) {
            case 1: {
                for (int i = 0; i <= 3; i++) {
                    String draw = "";
                    for (int j = 1; j <= 7; j++) {
                        draw = draw + "*";
                    }
                    System.out.println(draw);
                }
                break;
            }
            case 2: {
                String draw = "";
                for (int i = 1; i <= 5; i++) {
                    draw = draw + "*";
                    System.out.println(draw);
                }
                break;
            }
            case 3: {
                for (int i = 5; i >= 1; i--) {
                    String draw="";
                    for (int j = 1; j <= i; j++) {
                        draw=draw+"*";
                    }
                    System.out.println(draw);
                }
            }
            case 4:{
                System.exit(4);
            }
            default:
                System.out.println("Chạy lại bạn ei");
        }
    }
}