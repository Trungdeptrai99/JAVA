import java.util.Scanner;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        boolean isX3 = number%10==3;
        boolean is3X = number/10==3;
        boolean is5X= number/10==5;
        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz||isX3||is3X)
            return "Fizz";

        if(isBuzz||is5X)
            return "Buzz";

        return number + "";
    }
    public static String speakUnit(int number){
        if(number==1){
            return "Mot";
        }
        if(number==2){
            return "Hai";
        }
        if(number==3){
            return "Ba";
        }
        if(number==4){
            return "Bon";
        }
        if(number==5){
            return "Lam";
        }
        if(number==6){
            return "Sau";
        }
        if(number==7){
            return "Bay";
        }
        if(number==8){
            return "Tam";
        }
        if(number==9){
            return "Chin";
        }
        return "muoi";
    }
    public static String speakHangChuc(int number){
        if(number==1){
            return "Muoi";
        }
        if(number==2){
            return "Hai";
        }
        if(number==3){
            return "Ba";
        }
        if(number==4){
            return "Bon";
        }
        if(number==5){
            return "Lam";
        }
        if(number==6){
            return "Sau";
        }
        if(number==7){
            return "Bay";
        }
        if(number==8){
            return "Tam";
        }
        if(number==9){
            return "Chin";
        }
        return "muoi";
    }

}
