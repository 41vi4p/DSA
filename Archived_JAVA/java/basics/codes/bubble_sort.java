public class bubble_sort {
    public static int[] bubbleSort(int[] arr){
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr.length;col++){
                if(arr[col]>arr[col+1])
                {
                    int tempVar=arr[col];
                    arr[col] = arr[col+1];
                    arr[col+1] = tempVar;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        
    }
}
