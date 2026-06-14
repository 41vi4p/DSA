package strings;
public class test {
    public static void main(String[] args) {
        int count = (args.length > 0) ? Integer.parseInt(args[0]) : 3;  // Default to 3 if no arg
        System.out.println("from main 1, iteration: " + (4 - count));  // Shows current iteration
        if (count > 1) 
            main(new String[]{String.valueOf(count - 1)});  // Recursive call with decremented count
        
    }
}