
//YOu are in  0,0. U have to traverse to 2,2 in a 3x3 matrix numbering starts from 0.
//The flag is in 2,2. Find and traverse the paths using recursion.
// X 0 0
// 0 0 G

// Step 1: Check if we reached destination
//    if (startingRow == endingRow && startingCol == endingCol)
//    → Found a valid path! Print it and return 1

// Step 2: Check if move is invalid
//    if (out of bounds OR already visited)
//    → Can't go this way, return 0

// Step 3: Mark current cell as visited
//    visited[startingRow][startingCol] = true
//    → Prevents going back to same cell in this path

// Step 4: Explore all 4 directions
//    Right (R):  startingCol + 1
//    Down (D):   startingRow + 1
//    Up (U):     startingRow - 1
//    Left (L):   startingCol - 1

// Step 5: Backtrack (undo the visit)
//    visited[startingRow][startingCol] = false
//    → Allows OTHER paths to use this cell

public class move_all_dir {

    public static int findPath(int startingRow, int startingCol, int endingRow, int endingCol, String path, boolean[][] visited){

        // valid path
        if (startingRow == endingRow && startingCol == endingCol){
            System.out.println(path);
            return 1;
        }

        // outof boundary
        if(startingRow < 0 || startingRow > endingRow ||
            startingCol < 0 || startingCol > endingCol ||
            visited[startingRow][startingCol]){
            return 0;
        }
        //mark as visited
        visited[startingRow][startingCol]= true;

        //Explore all directions
        int result = findPath(startingRow, startingCol + 1, endingRow,  endingCol, path+"R", visited) + //right
                     findPath(startingRow +1, startingCol, endingRow, endingCol, path+"D", visited) + //downn
                     findPath(startingRow - 1, startingCol, endingRow, endingCol, path+"U", visited)+ //up
                     findPath(startingRow, startingCol-1, endingRow, endingCol, path+"L", visited); //left

        
        //resets to start position 0,0
        visited[startingRow][startingCol]=false;

        return result;
        
    }

    public static void main(String[] args) {
        boolean[][] visited = new boolean[3][3];
        int result = findPath(0, 0, 1, 2,"", visited);  

        System.out.println(result);
    }
}
