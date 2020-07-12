import java.util.Scanner;

public class Gopmang {
  Scanner sc = new Scanner(System.in);
  int size;
  public void creatArray(int a){
      int n;
      String hihi =  "arr";
       do {
           System.out.println("Nhập số phần tử của mảng thứ "+a+ " vào đây");
           n = sc.nextInt();
           size=size+ n;
       }while (n<=0);
       int Arr[] = new int[n];
       for(int i=0;i<Arr.length;i++){
           System.out.println("Nhập phần tử thứ i của mảng" );
           Arr[i]= sc.nextInt();
       }
   }

    public static void main(String[] args) {
        Gopmang a = new Gopmang();
        a.creatArray(2);
        int[] arr = new int[a.size];

    }
}
