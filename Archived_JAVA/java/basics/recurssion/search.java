
// find the first occurrence of given target element

// Sample Test Case : arr = [3, 3, 1, 5, 8, 0, 1, 3, 5, 1], target = 1
// Expected output  : 2

// Sample Test Case : arr = [3, 3, 1, 5, 8, 0, 1, 3, 5, 1], target = 10
// Expected output  : -1

// constraints
// ---------------
//   0 <= arr.legth < 10^3
//   -2147483648 <= arr[n] <= 2147483647

// Note : TC : O(N) ---> avg

public class search {
    public static int findOccurence(int[] arr, int target){
        int end = arr.length-1;
        if(arr.length==0)
            return -1;

        int start=0;
        int answer = -1;
        
        while(start<=end){
            //check first pointer
            if(arr[start]==target)
                return start;
            //check second pointer
            if(arr[end]==target)
                answer= end; //if found then store

            start++;
            end--;
        }
        return answer;
    }
    
    public static void main(String[] args) {
        System.out.println(findOccurence(new int[]{1,2,3,4,5,6,7,1,3}, 3));
    }
    
}
