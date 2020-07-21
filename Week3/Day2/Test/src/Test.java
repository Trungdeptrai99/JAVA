import java.util.*;

public class Test {
    public static final int NUM_OF_ELEMENT = 5;
    public static void main(String[] args) {
        ArrayList collection1 = new ArrayList();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");

        System.out.println("Danh sách các thành phố của collection1:");
        System.out.println(collection1);
        System.out.println("\n Dallas có trong collection1? "
             + collection1.contains("Dallas"));

       collection1.remove("Dallas");
       System.out.println("\n" + collection1.size() +
                " Thành phố có trong collection1 lúc này: ");
        System.out.println(collection1);
        System.out.println("-&&-&& Trung Đẹp trai -&&-&&");
       for(int i =0;i<10;i++){
           System.out.println("\n");
       }





        List<String> arrayList = new ArrayList<>();
        for (int i = 1; i <= NUM_OF_ELEMENT; i++) {
            arrayList.add("0" + i);
        }
        System.out.println("ArrayList: " + arrayList);

        List<String> linkedList = new LinkedList<>();
        for (int i = 1; i <= NUM_OF_ELEMENT; i++) {
            linkedList.add("0" + i);
        }
        System.out.println("LinkedList: " + linkedList);

        Set<String> hashSet = new HashSet<String>();
        for (int i = 1; i <= NUM_OF_ELEMENT; i++) {
            hashSet.add("0" + i);
        }
        System.out.println("HashSet: " + hashSet);

        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 1; i <= NUM_OF_ELEMENT; i++) {
            hashMap.put("Key0" + i, i);
        }
        System.out.println("HashMap: " + hashMap);
    }
}