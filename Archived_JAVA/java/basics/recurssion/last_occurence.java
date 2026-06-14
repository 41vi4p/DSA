

public class last_occurence {
    
// find the last occurrence of given target element

// Sample Test Case : arr = [3, 3, 1, 5, 8, 0, 1, 3, 5, 1], target = 1
// Expected output  : 2

// Sample Test Case : arr = [3, 3, 1, 5, 8, 0, 1, 3, 5, 1], target = 10
// Expected output  : -1

// constraints
// ---------------
//   0 <= arr.legth < 10^3
//   -2147483648 <= arr[n] <= 2147483647

// Note : TC : O(N) ---> avg

    public static int findOccurence(int[] arr, int target){
        int end = arr.length-1;
        if(arr.length==0)
            return -1;

        int start=0;
        int answer = -1;
        int answer_l=-1;
        
        while(start<=end){
            //check first pointer
            if(arr[end]==target)
                answer_l= end; //if found then store

            if(arr[start]==target)
                answer=start; // Store but continue, no return like first
            //check second pointer
            

            start++;
            end--;
            
        }
        System.out.println("First Occ: "+answer);
        System.out.println("Last Occ: "+answer_l);
        return answer;
    }
    
    public static void main(String[] args) {
        System.out.println(findOccurence(new int[]{1,2,3,4,5,6,7,1,3}, 3));
    }
    

}
