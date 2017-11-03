import java.util.Scanner;

public class 时间戳 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("输入一个时间戳：");
        int x=in.nextInt()+8*3600;
        int year=1970;
        int x1=x/86400,x2=(x-86400*x1)/3600,x3=(x-86400*x1-3600*x2)/60,x4=x%60;
        int n =x1+1;
        for(;n-365>0;n-=365)
        {year+=1;
        if(year%4==0&&year%100!=0||year%400==0){n--;}
        }
        int yue,day;
        for(int q;;){
        n=n-31;if(n<=0){yue=1;day=n+31;break;}
        if(year%4==0&&year%100!=0||year%400==0){n=n-28;}
        else {n=n-29;}if(n<=0)if(year%4==0&&year%100!=0||year%400==0){yue=2;day=n+28;break;}else{yue=2;day=n+29;}
        n=n-31;if(n<=0){yue=3;day=n+31;break;}
        n=n-30;if(n<=0){yue=4;day=n+30;break;}
        n=n-31;if(n<=0){yue=5;day=n+31;break;}
        n=n-30;if(n<=0){yue=6;day=n+30;break;}
        n=n-31;if(n<=0){yue=7;day=n+31;break;}
        n=n-31;if(n<=0){yue=8;day=n+31;break;}
        n=n-30;if(n<=0){yue=9;day=n+30;break;}
        n=n-31;if(n<=0){yue=10;day=n+31;break;}
        n=n-30;if(n<=0){yue=11;day=n+30;break;}
        n=n-31;  yue=12;day=n+31;}System.out.print(year+"年"+yue+"月"+day+"日"+x2+":"+x3+":"+x4);



}}

