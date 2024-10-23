package Java_Programs_100;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionMatrix {
    public static void main(String[] args) {
        int [][]matrix1 = {{1,2,3,4},{5,6,7,8}};
        int [][]matrix2 = {{5,6,7,8},{1,2,3,4}};
        int [][]sum = new int [matrix2.length][matrix1.length];
        for(int i = 0;i< matrix1.length;i++){
            for(int j = 0;j< matrix1[i].length;j++){
                sum[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(sum));
    }
}
