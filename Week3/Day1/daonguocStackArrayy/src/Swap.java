import java.util.Stack;

public class Swap {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7};
        Stack<Integer> stack = new Stack();
        System.out.println(stack.capacity());
        System.out.println("Capacity của Stack là: " + stack.capacity());
        for (int i = 0; i < list.length; i++) {
            stack.push(list[i]);
            System.out.println("Capacity của Stack là: " + i + " " + stack.capacity());
        }
        System.out.println("Capacity của Stack là: " + stack.capacity());
        for (int i = 0; i < stack.size(); ) {
            System.out.println(stack.pop());
        }
    }
}

