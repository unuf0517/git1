import java.util.Scanner;

public class work12_0404 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int time;
        System.out.println("输入上机时间");
        while(true){
            if(sc.hasNextInt()){
                time=sc.nextInt();
                if(time<0){
                    System.out.println("时长应为正数，请重新输入");
                    continue;
                }
                break;
            }
            sc.next();
            System.out.println("输入不合法，请重新输入");
        }
        int hour=time/60;
        int minute=time%60;
        System.out.println("一共上机"+(hour+minute/60.0)+"小时");
        if(minute>0){
            hour++;
        }
        System.out.println("应付款"+(hour*5)+"元");
    }
}
