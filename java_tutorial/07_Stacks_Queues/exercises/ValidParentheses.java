import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    
    // TODO: Check if the string has valid parentheses: (), {}, []
    public static boolean isValid(String s) {
        // Deque<Character> stack = new ArrayDeque<>();
        
        for (char c : s.toCharArray()) {
            // Push open brackets
            // Check close brackets against stack.peek() / stack.pop()
        }
        
        // return stack.isEmpty();
        return false; // Replace
    }

    public static void main(String[] args) {
        System.out.println("{[]} : " + isValid("{[]}")); // true
        System.out.println("([)] : " + isValid("([)]")); // false
    }
}
