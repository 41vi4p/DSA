
import java.util.Arrays;

public class binary_search {
    public static int searchBinary(int arr[],int target){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //find mid eleement
            int mid=(start+end)/2;

            //is found
            if(target==arr[mid]){
                while(mid>0 && target==arr[mid-1])
                {
                    if(arr[mid-1]==target)
                        mid-=1;
                    else    
                        break;

                }
                return mid;
            }
                
            else if(target<arr[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(searchBinary(new int[]{41,2,41,45,43,5,9,4,8,4},4));
    }
}
