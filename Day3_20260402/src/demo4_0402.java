import java.util.Random;
import java.util.Scanner;

public class demo4_0402 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int num=r.nextInt(100)+1;
        while(true){
            System.out.println("请输入所猜想的数字");
            int a=sc.nextInt();
            if(a==num){
                System.out.println("对了");
                break;
            }
            if(a>num){
                System.out.println("太大了");
            }else if(a<num){
                System.out.println("太小了");
            }
        }
    }
}
