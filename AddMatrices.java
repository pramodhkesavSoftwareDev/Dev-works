public class AddMatrices {
 
    public static void main(String[] args) {
        int rows = 3, columns = 3;
        int[][] firstMatrix = { {1,2,3}, {4,5,6},{7,8,9} };
        int[][] secondMatrix = { {9,8,7}, {6,5,4},{3,2,1} };
 
        // Adding Two matrices
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
 
        // Displaying the result
        System.out.println("Sum of three matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}