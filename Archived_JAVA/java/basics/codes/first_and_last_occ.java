import java.util.Arrays;

public class first_and_last_occ {
    public int firstOccurrence(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        int answer = -1;

        while (start <= end){
            // find mid element
            int mid = (start + end) / 2;

            // is found
            if(target == arr[mid]){
                answer = mid;
                end = mid - 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return answer;
    }

    public int lastOccurrence(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        int answer = -1;

        while (start <= end){
            // find mid element
            int mid = (start + end) / 2;

            // is found
            if(target == arr[mid]){
                answer = mid;
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return answer;
    }

    public int[] searchRange(int[] nums, int target) {

        return new int[]{
            firstOccurrence(nums, target),
            lastOccurrence(nums, target)
        };
    }

    public static void main(String[] args) {
        first_and_last_occ s= new first_and_last_occ();
        System.out.println(Arrays.toString(s.searchRange(new int[]{1,2,3,4,2,1,3},3)));
    }
}
