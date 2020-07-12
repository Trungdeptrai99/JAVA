import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,col,row;
        do {
            System.out.println("Nhập số hàng");
            row = sc.nextInt();
            System.out.println("Nhập số cột");
            col = sc.nextInt();

        }while (row<=0||col<0);
        int Arr[][]= new int[row][col];
        for(int i=0;i<Arr.length;i++){
            for (int j=0;j<Arr[i].length;j++){
                System.out.println("Nhập phần tử ở vị trí hàng" +i+" cột "+j);
                Arr[i][j]= sc.nextInt();
            }
        }
         int min = Arr[0][0];
        for(int i=0;i<Arr.length;i++){
            for (int j=0;j<Arr[i].length;j++){
               if(min>Arr[i][j]){
                   min= Arr[i][j];
               }
            }
        }
        System.out.println("Phần từ nhỏ nhất trong mảng là "+min);
    }
}
