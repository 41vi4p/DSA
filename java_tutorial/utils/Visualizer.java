// Place this in a utils folder. Can be compiled separately or copy-pasted if needed for simplicity.

import java.util.List;
import java.util.Arrays;

public class Visualizer {

    public static void clearScreen() {
        // ANSI escape code to clear screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void printLine() {
        System.out.println("----------------------------------------");
    }

    public static void drawArray(int[] arr, int highlightIndex, String label) {
        System.out.print(label + ": [ ");
        for (int i = 0; i < arr.length; i++) {
            if (i == highlightIndex) {
                System.out.print("[" + arr[i] + "] ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("]");
    }
    
    // Overload for List (generics)
    public static <T> void drawList(List<T> list, int highlightIndex, String label) {
        System.out.print(label + ": [ ");
        for (int i = 0; i < list.size(); i++) {
            if (i == highlightIndex) {
                System.out.print("[" + list.get(i) + "] ");
            } else {
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println("]");
    }
}
