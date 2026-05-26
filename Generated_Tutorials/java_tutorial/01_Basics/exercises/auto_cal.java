import java.util.Scanner;
import java.util.Stack;

// automatic calculator that takes input as a string and evaluates it, multiple operations should be allowed together, and follow the BODMAS rule, e.g. 3 + 4 * 2 should return 11, and (1 + 2) * 3 should return 9
public class auto_cal {

    // Determine operator precedence
    static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    // Apply an operation
    static double applyOp(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) throw new ArithmeticException("Cannot divide by zero!");
                return a / b;
            default: return 0;
        }
    }

    // Evaluate expression using two stacks (one for values, one for operators)
    static double evaluate(String expression) {
        Stack<Double> values = new Stack<>();
        Stack<Character> ops = new Stack<>();
        
        expression = expression.replaceAll("\\s+", "");
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            
            // If current character is a digit, parse the entire number
            if (Character.isDigit(c)) {
                double num = 0;
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                values.push(num);
            }
            // If current character is '(', push it to ops stack
            else if (c == '(') {
                ops.push(c);
            }
            // If current character is ')', pop and evaluate until we find '('
            else if (c == ')') {
                while (!ops.empty() && ops.peek() != '(') {
                    values.push(applyOp(values.pop(), values.pop(), ops.pop()));
                }
                ops.pop(); // Remove the '('
            }
            // If current character is an operator
            else if (c == '+' || c == '-' || c == '*' || c == '/') {
                // Pop operators with higher or equal precedence and apply them
                while (!ops.empty() && precedence(ops.peek()) >= precedence(c)) {
                    values.push(applyOp(values.pop(), values.pop(), ops.pop()));
                }
                ops.push(c);
            }
        }
        
        // Pop remaining operators and apply them
        while (!ops.empty()) {
            values.push(applyOp(values.pop(), values.pop(), ops.pop()));
        }
        
        return values.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Mathematical Expression (e.g. 3 + 4 * 2 or (1 + 2) * 3): ");
        String expression = scanner.nextLine();
        scanner.close();
        
        try {
            double result = evaluate(expression);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
