public class 素数 {
    public static void main(String[] args) {
    haha: for (int i=20171022; i >= 1; i++) {
         for (int j = 2; j < i; j++) {
             if (i % j == 0) {
                continue haha
                        ;
             }
         }

         System.out.println(i);break;  }

    }
}

