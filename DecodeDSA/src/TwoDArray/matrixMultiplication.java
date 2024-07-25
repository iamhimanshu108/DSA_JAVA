package TwoDArray;

public class matrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {{1,2,1},{2,1,2}};
        int[][] b = {{1,0,1,2},{2,1,0,0},{0,3,1,1}};

        if(a[0].length!=b.length){
            System.out.println("Multiplication not possible");
        }
    }
}
