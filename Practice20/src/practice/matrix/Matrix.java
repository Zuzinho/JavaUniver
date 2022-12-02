package practice.matrix;

import practice.calculator.Calculator;

public class Matrix<N extends Number> {

    public N[][] sum(N[][] matrix1, N[][] matrix2){
        int height = matrix1.length;
        int width = matrix1[0].length;
        for(int i = 0;i<height;i++){
            for(int j = 0;j<width;j++){
                matrix1[i][j] = Calculator.sum(matrix1[i][j] ,matrix2[i][j]);
            }
        }
        return matrix1;
    }

    public void printMatrix(N[][] matrix){
        int height = matrix.length;
        int width = matrix[0].length;
        for(int i = 0;i<height;i++){
            for(int j = 0;j<width;j++) System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
