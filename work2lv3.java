import java.util.Random;

class poker{
    void Random(int n){System.out.println(Math.random());}





}







    public class work2lv3 {
        public static void main(String[] args) {
   Random r=new Random();
   double remain=5.0,sum=0,money=0;
   for(int i=1;i<=5;i++){ remain-=money;
   money=r.nextDouble()*remain;
      if(i<=4) System.out.println(String .format("%.2f",money));
      if(i==5)System.out.println(String.format("%.2f",remain));
   }

        }
    }