package practice.matrix;

public class Main {
    public static void main(String[] args) {
        Integer[][] matrix1 = {{5,3,2},{6,4,2}};
        Integer[][] matrix2 = {{1,-3,7},{11,4,7}};
        Matrix<Integer> matrix = new Matrix<>();
        matrix.printMatrix(matrix1);
        matrix.printMatrix(matrix2);
        matrix.printMatrix(matrix.sum(matrix1,matrix2));
    }
}
