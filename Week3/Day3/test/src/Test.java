import java.util.Scanner;

public class Test {
    public static int NhiPhanVongLap(int[] arr, int X) {
        for (int i = 0; i < arr.length; i++) {
            int mid = arr.length / 2;
            if (X < arr[mid]) {
                while (arr[mid] != 0) {
                    System.out.println("hihi1");
                    for (int j = 0; j < arr[mid]; j++) {
                        if (arr[mid] == X) {
                            return X;
                        } else mid = mid / 2;
                    }
                }
            }
            if (X > arr[mid]) {
                while (arr[mid] != arr.length) {
                    System.out.println("hihi2");
                    for (int j = arr[mid]; j < arr.length; j++) {
                        if (arr[mid] == X) {
                            return X;
                        } else mid = (arr.length+mid)/2;
                    }
                }
            }

        }
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng vào đây");
        int option = sc.nextInt();
        int arr[]= new int[option];
        for(int i=0;i<option;i++){
            arr[i]= i;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        long start = System.nanoTime();
        System.out.println(NhiPhanVongLap(arr, 3)+"Hihi");
        long end = System.nanoTime();
        System.out.println("Thời gian là" +(-(start-end)));
    }
}
