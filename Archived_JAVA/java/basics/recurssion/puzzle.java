
//YOu are in  0,0. U have to traverse to 2,2 in a 3x3 matrix numbering starts from 0.
//The flag is in 2,2. Find and traverse the paths using recursion.
// X 0 0
// 0 0 G

public class puzzle {
    public static int findPath(int startingRow, int startingCol, int endingRow, int endingCol, String path){

        // valid path
        if (startingRow == endingRow && startingCol == endingCol){
            System.out.println(path);
            return 1;
        }

        // outof boundary
        if(startingRow > endingRow || startingCol > endingCol){
            return 0;
        }

        return findPath(startingRow, startingCol + 1, endingRow,  endingCol, path+"L") + 
        findPath(startingRow +1, startingCol, endingRow, endingCol, path+"D");

        
    }

    public static void main(String[] args) {
        int result = findPath(0, 0, 2, 2,"");  

        System.out.println(result);
    }
}