

class Graph<T>{
    T[][] matrix;
    boolean directed;

    public Graph(int size, boolean directed){
        this.matrix = (T[][]) new int[size][size];
        this.directed = directed;
    }
    public void edges(int i, int j){
        this.matrix[i][j]=1;
    }
}

public class graph {
    public static void main(String[] args) {
        
    }
    
}
