public class Matrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    public static void main(String[] args) {

        int row = 4;
        int col = 4;

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row-1; i++) {

            for (int k = 0; k < col-1; k++) {

                if (i == k) {
                    matrix[i][k] = 1;
                } else {
                    matrix[i][k] = 0;
                }
            }
        }

        for (int i = 0; i <= row-1; i++) {
            System.out.println("\r\n");
            for (int j = 0; j <= col-1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
