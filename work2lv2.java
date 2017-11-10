import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class work2lv2 {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("0.00");
        Scanner in = new Scanner(System.in);
        System.out.print("红包个数：");
        double number1 = in.nextDouble();
        System.out.print("红包的金额：");
        double total = in.nextDouble();
        double each = total / number1;
        System.out.println("每个人获得的金额：" + f.format(each));

        Random random=new Random();List array=new ArrayList();
        int sum=0;double j,j1,max=0;int middle=0;
        System.out.print("红包个数：");
        int   beforenumber = in.nextInt();
        int[] number=new int[beforenumber];
        if(total<0.01*beforenumber){System.out.println("每个红包的大小不得小于0.01元。");main(args); }
        double remain1=total, remain=total-0.01*beforenumber;
        for(int i=0;i<number.length;i++){
            number[i]=random.nextInt(100);
           if(i<number.length) {
              haha: if (number[i] >= max) {
                   max = number[i];
                   middle = i + 1;
               }
               if (i == number.length - 1) {
                   System.out.println("运气王是第" + middle+"个人");
               }
           }


            sum+=number[i]; }

            for(int i=0;i<number.length;i++){
            j=remain*number[i]/sum;
            BigDecimal b=new BigDecimal(j);
            j1=b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
             j1=j1+0.01;
           if(i<number.length-1) {remain1-=j1;System.out.println("红包"+(i+1)+":"+f.format(j1));}
           else if(i==number.length-1){System.out.println("红包"+(i+1)+":"+f.format(remain1));}
            }

}}