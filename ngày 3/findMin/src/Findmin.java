import java.util.Scanner;

public class Findmin {
    public static int minValue(int [] arr) {
        int min = arr[0];
        for (int a : arr
        ) {
            if(min>a){
                min= a;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Nhập độ dài mảng");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int i=0;
        int[] array = new int[size];
        while (i<size){
            System.out.println("Nhập phần từ " +i +" của mảng array");
            array[i]= sc.nextInt();
            i++;
        }
        System.out.println("Giá trị nhỏ nhất của mảng array là:" + minValue(array));
    }
}