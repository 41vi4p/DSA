import java.util.Scanner;

class copy_array_ele_into_another {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];    
        System.out.print("Enter array elements:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt(); 
    }

        int[] arr2 = new int[n];
        copyArray(arr1, arr2);
        
        System.out.print("Copied array elements:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        sc.close();
    }
    static void copyArray(int[] sc, int[] dest) {
        for (int i = 0; i < sc.length; i++) {
            dest[i] = sc[i];
        }
    }
}