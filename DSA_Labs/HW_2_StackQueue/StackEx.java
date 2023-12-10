import java.util.*;

public class StackEx {
    // reverse a string using Stack
    public static String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        String rs = "";
        while (! stack.empty()) {
            rs += stack.pop();
        }
        return rs;
    }

    //evalute stackEX
    public static int evaluate(String exp) {
        Stack<Integer> stack = new Stack<>();
    
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid expression");
                }
                int op2 = stack.pop();
                int op1 = stack.pop();
                int res;
    
                switch (c) {
                    case '+':
                        res = op1 + op2;
                        break;
                    case '-':
                        res = op1 - op2;
                        break;
                    case '*':
                        res = op1 * op2;
                        break;
                    case '/':
                        if (op2 == 0) {
                            throw new ArithmeticException("Division by zero");
                        }
                        res = op1 / op2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator");
                }
                stack.push(res);
            }
        }
    
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid expression");
        }
    
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("123456"));
        
        String expression = "2 3 + 4 * 8 9 + -";
        int res = evaluate(expression);
        System.out.println("Result: " + res);
    }

}