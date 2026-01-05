// Basic visualization without external dependencies for this file
public class RecursionVisualized {

    public static int factorial(int n, int depth) {
        // Indentation for visual depth
        String indent = new String(new char[depth * 4]).replace("\0", " ");
        
        // System.out.print("\033[H\033[2J"); // Optional clrscr
        System.out.println(indent + "-> Calling factorial(" + n + ")");
        
        try { Thread.sleep(500); } catch (Exception e) {}

        if (n <= 1) {
            System.out.println(indent + "-> Base Case! Return 1");
            return 1;
        }

        int result = n * factorial(n - 1, depth + 1);
        
        System.out.println(indent + "<- Returning " + result);
        try { Thread.sleep(500); } catch (Exception e) {}

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Calculating 5! with visualizer...");
        factorial(5, 0);
    }
}
