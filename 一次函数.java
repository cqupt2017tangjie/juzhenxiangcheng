public class 一次函数 {    public static void main(String[] args) {
    int x = 49, y = 49;
    String [][] q =new String [x][y];
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            if (i == j||i==25||j==25 ) {
                q[i][j] = "*";
            } else {
                q[i][j] = " ";
            }System.out.print(q[i][j]);

        }System.out.println();
    }
}}

