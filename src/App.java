public class App {

    static int[][] transposeMatrix(int[][] matrix) {
        int[][] tranpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tranpose[j][i] = matrix[i][j];
            }
        }
        return tranpose;
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println("Matris");
        printMatrix(matrix);
        System.out.println("Transpoze");
        printMatrix(transposeMatrix(matrix));

    }
}
