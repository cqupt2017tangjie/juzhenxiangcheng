import java.util.Scanner;

public class juzhenxiangcheng {
    public static void main(String[] args) {
       int[][] a={{3,4,5},{4,5,6},{6,7,8}};
       int[][] b={{1,4,5,6},{1,6,7,8},{1,7,8,9}};
        int n = a.length;
        int m = b[0].length;
        int x = b.length;
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = 0;
                for (int k = 0; k < x; k++) {
                    sum += a[i][k] * b[k][j];
                }
                c[i][j] = sum;
                for (int q = 0; q < n; q++) ;
                {
                    for (int p = 0; p < m; p++) ;
                    System.out.print(c[i][j]+" ");


                }
            }System.out.println("");
        }

    }}