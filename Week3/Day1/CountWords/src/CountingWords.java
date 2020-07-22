import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountingWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao 1 chuoi: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] ArrStr = string.split("");
        for (String e : ArrStr
        ) {
            System.out.println(e);
        }

        Map<String, Integer> map = new TreeMap<String, Integer>();

        for (String str : ArrStr) {
            str = str.toUpperCase();
            int countKey = 1;

            if (map.containsKey(str)) {
                countKey++;
                map.put(str, countKey);
            } else
                map.put(str, countKey);


        }
        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " : " + entry.getValue() + " " + entry.getKey());
    }
}