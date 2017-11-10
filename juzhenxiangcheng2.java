import java.util.Scanner;

public class juzhenxiangcheng2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入矩阵a的行数和列数");
        int x1=in.nextInt();
        int y1=in.nextInt();
        int [][]a=new int[x1][y1];
        System.out.println("输入矩阵b的行数与列数");
        int x2=in.nextInt();
        int y2=in.nextInt();
        int[][] b=new int[x2][y2];
        int n = a.length;
        int m = b[0].length;
        int x = b.length;
        if(y1!=x2){System.out.print("这两个矩阵不可相乘");}
        System.out.println("矩阵a的元素");
        int[][] c = new int[n][m];
        for(int i1=0;i1<x1;i1++)
            for (int j1=0;j1<y1;j1++){
            a[i1][j1]=in.nextInt();
            } System.out.println("矩阵b的元素");
            for(int i2=0;i2<x2;i2++)
                for(int j2=0;j2<y2;j2++)
                {b[i2][j2]=in.nextInt();}
                System.out.println();
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

