import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class RedPocket{
    Scanner in = new Scanner(System.in);
    DecimalFormat f = new DecimalFormat("0.00");
    void normalredpocket(){
        System.out.print("红包个数：");
        double number1 = in.nextDouble();
        System.out.print("红包的金额：");
        double total = in.nextDouble();
        for(int i=0;i<number1;i++){
            double each = total / number1;
            System.out.println("每个人获得的金额：" + f.format(each));}
    }
    void luckyredepocket(){
        Random random=new Random();List array=new ArrayList();
        int sum=0;double j,j1,max=0;int middle=0;
        System.out.print("红包个数：");
        int   beforenumber = in.nextInt();
        System.out.print("红包的金额：");
        double total = in.nextDouble();
        int[] number=new int[beforenumber];
        double remain1=total, remain=total-0.01*beforenumber;
        for(int i=0;i<number.length;i++){
            number[i]=random.nextInt(100);
            if(i<number.length) {
                if (number[i] >= max) {
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
    } void commandredpocket(){
        System.out.println("你要输入的口令：");
        String finalcommand=in.next();
        Random random=new Random();List array=new ArrayList();
        int sum=0;double j,j1,max=0;int middle=0;
        System.out.print("红包个数：");
        int   beforenumber = in.nextInt();
        System.out.print("红包的金额：");
        double total = in.nextDouble();
        int[] number=new int[beforenumber];
        double remain1=total, remain=total-0.01*beforenumber;
        for(int i=0;i<number.length;i++) {
            number[i] = random.nextInt(100);
            sum += number[i];
        }

        for(int i=0;i<number.length;i++){
            for(int i1=0;i1>=0;i1++) {
                System.out.println("口令：");
                String eachcommand = in.next();
                if (eachcommand.equals(finalcommand)) {
                    break;
                } else {
                    System.out.println("口令错误，请重新输入");
                }
            }
            j=remain*number[i]/sum;
            BigDecimal b=new BigDecimal(j);
            j1=b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
            j1=j1+0.01;
            if(i<number.length-1) {remain1-=j1;System.out.println("红包"+(i+1)+":"+f.format(j1));}
            else if(i==number.length-1){System.out.println("红包"+(i+1)+":"+f.format(remain1));}}
    }


}




public class work2lv2 {
    public static void main(String[] args) {
        RedPocket normal=new RedPocket ();

        Scanner in=new Scanner(System.in);
        System.out.println("请选择你要派发的红包类型（运气红包，普通红包，口令红包）：");
        String style=in.next();
        if(style.equals("普通红包")){normal.normalredpocket();}
        if(style.equals("运气红包")){normal.luckyredepocket();}
        if(style.equals("口令红包")){normal.commandredpocket();}


    }

}