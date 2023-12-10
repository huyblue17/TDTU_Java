import java.util.*;

public class QueueEx {
    // reverse an positive integer using queue
    public static int reverseInt(int a) {
        Queue<Integer> queue = new LinkedList<>();
        int d;

        while (a > 0) {
            d = a % 10; // 123 % 10 = 3
            queue.offer(d);
            a = a / 10; // 123 / 10 = 12
        }

        while (! queue.isEmpty()) {
            d = queue.poll();
            a = a * 10 + d; // 12 * 10 + 3 = 123
        }

        return a;
    }

    public static String extractLow(String s) {
        StringBuilder result = new StringBuilder();
    
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                result.append(c);
            }
        }
    
        return result.toString();
    }
    


    public static void main(String[] args) {
        System.out.println(reverseInt(123456));
    }
}
