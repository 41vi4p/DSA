import java.util.Arrays;

// Simple standalone visualizer for bubble sort
public class BubbleSortVisualized {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void sleep(int ms) {
        try { Thread.sleep(ms); } catch (Exception e) {}
    }

    public static void printArray(int[] arr, int activeIdx1, int activeIdx2) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i == activeIdx1 || i == activeIdx2) {
                System.out.print("[" + arr[i] + "] ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Starting Bubble Sort Visualization...");
        sleep(1000);

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                clearScreen();
                System.out.println("Comparing indices " + j + " and " + (j+1));
                printArray(arr, j, j+1);
                sleep(300);

                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    clearScreen();
                    System.out.println("SWAPPING!");
                    printArray(arr, j, j+1);
                    sleep(400);
                }
            }
        }

        clearScreen();
        System.out.println("Sorted!");
        printArray(arr, -1, -1);
    }
}
