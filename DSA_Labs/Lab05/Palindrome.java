import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static boolean isPalindrome(int n) {
        String numberString = String.valueOf(n);

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < numberString.length(); i++) {
            char digit = numberString.charAt(i);
            stack.push(digit);
            queue.add(digit);
        }

        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int num1 = 101;
        int num2 = 256652;
        int num3 = 1221;
        int num4 = 121;

        System.out.println(num1 + " is palindrome: " + isPalindrome(num1));
        System.out.println(num2 + " is palindrome: " + isPalindrome(num2));
        System.out.println(num3 + " is palindrome: " + isPalindrome(num3));
        System.out.println(num4 + " is palindrome: " + isPalindrome(num4));
    }
}