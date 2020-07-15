import org.junit.Test;

public class TEST {

    public static boolean isLeapYear(int number) {

        if (number % 400 == 0) {
            return true;
        }
        if (number % 100 == 0) {
            return false;
        }
        if (number % 4 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 2020; i++) {
            if (isLeapYear(i)) {
                System.out.println(i +" Là năm nhuận");
            } else System.out.println("Trung đẹp trai");
        }

    }
}