import java.util.Stack;

public class Reverse {
    public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");

        Stack<String> stack = new Stack<>();
        for (String word : words) {
            stack.push(word);
        }

        StringBuilder reversedSentence = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedSentence.append(stack.pop()).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "I like apple";
        String reversed = reverseSentence(sentence);
        System.out.println("Reversed sentence: " + reversed);
    }
}