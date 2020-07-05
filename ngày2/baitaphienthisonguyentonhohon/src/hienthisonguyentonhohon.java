import java.util.Scanner;
public class hienthisonguyentonhohon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số nguyên tố nhỏ hơn");
        int number = scanner.nextInt();
        for(int i=2;i<=number;i++){
            boolean songuyento= true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    songuyento=false;
                }
            }
            if(songuyento){
                System.out.println(i);
            }
        }

    }
}
