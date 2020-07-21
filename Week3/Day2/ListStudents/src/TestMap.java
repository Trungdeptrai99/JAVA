import java.util.*;
public class TestMap {
    public static void main(String[] args) {
      Map<String, Float> hashMap = new HashMap<>();
      hashMap.put("Smith", 30f);
      hashMap.put("Anderson", 31f);
      hashMap.put("Lewis", 29f);
      hashMap.put("Cock", 29f);
      System.out.println("Display entries in HashMap");
      System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap(hashMap);
        System.out.println("Display entries in ascending order of key Trung Đẹp Trai");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 32);
        linkedHashMap.put("Cook", 33);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
