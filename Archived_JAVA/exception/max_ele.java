
// Give an unsorted array and find the maximum element between an array
public class max_ele {
    public static void main(String[] args) {
        // int[] arr = {1, 2,4,9,10};
        int[] arr={};
        try{
            System.out.println("Maximum element in the array: " + findMax(arr));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }  
    }

    public static int findMax(int[] arr) throws Exception {
        int max= Integer.MIN_VALUE;
        int start=0;
        int end=arr.length-1;

        if(arr.length==0)  
            throw new Exception("Empty Array");

        while(start<=end){
            if(arr[start] > max)
                max = arr[start];

            if(arr[end] > max)
                max = arr[end];

            Thread t = new Thread();
            start++;
            end--;
        }  
        return max;
    }
}