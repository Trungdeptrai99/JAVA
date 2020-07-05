import java.util.Scanner;
public class hienthisonguyentodautien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean songuyento =true;
        System.out.println("Nhập số lượng số nguyên tố muốn hiện thị vào đây");
        int amout = scanner.nextInt();
        int count =0;
        int numberCheck= 2;
        while (count<amout){
            songuyento= true;
            for(int i=2;i<=Math.sqrt(numberCheck);i++){
                if(numberCheck%i==0){
                     songuyento= false;
                 }
            }
                 if(songuyento){
                     count++;
                     System.out.println(numberCheck);
                 }

             numberCheck++;

        }
    }
}
