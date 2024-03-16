import java.util.Arrays;

public class MultiplyMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{2,5},{1,3}};
        int[][] matrix2 = {{4,-2},{-1,3}};
        int[][] result = new int[matrix1[0].length][matrix2.length];

        int e = 0; 
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++,e=0) {
                for (int k = 0; k < matrix2.length; k++) {
                    e += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = e;
            }
        }

        System.out.println(Arrays.toString(result[0]) + "\n" + Arrays.toString(result[1]));
        
    }
}
