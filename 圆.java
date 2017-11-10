public class 圆 {
    public static void main(String[] args) {
        for(float i=0;i<51;i+=1){
            for(float j=0;j<51;j+=1){
                if((25-i)*(25-i)+(25-j)*(25-j)<25&&(25-i)*(25-i)+(25-j)*(25-j)>15||j==25)
                    System.out.print("*");
                else if(i==25)System.out.print("*");
                 else System.out.print(" ");

            }System.out.println();
        }
    }
}
