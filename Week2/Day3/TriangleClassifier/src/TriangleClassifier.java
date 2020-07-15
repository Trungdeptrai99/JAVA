public class TriangleClassifier {
    public static boolean isNormals(int a, int b, int c) {
        if (a != b && a != c && b != c) {
            return true;
        }
        return false;
    }
    public static boolean isDeu(int a, int b, int c) {
        if (a == b && a == c) {
            return true;
        }
        return false;
    }
    public static boolean isCan(int a, int b, int c) {
        if (a == b|| a == c||b==c) {
            return true;
        }
        return false;
    }

    public static boolean isTriangleClassifier(int a, int b, int c){
        int max = a;
        if(max<b){
            max=b;
        }
        if(max<c){
            max=c;
        }
       if(a+b+c<=2*max||a<0||b<0||c<0){
           return false;
       }

        return true;
    }

    public static String chekcTriangleClassifier(int a, int b, int c) {
       if(isTriangleClassifier(a,b,c)){
           if (isNormals(a, b, c)) {
               return "Tam giác thường";
           }
           if(isDeu(a,b,c)){
               return "Tam giác đều";
           }
           if(isCan(a,b,c)){
               return "Tam giác cân";
           }
       }

        return "Đéo phải tam giác";
    }
}