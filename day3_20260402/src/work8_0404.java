import java.util.Scanner;

public class work8_0404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int n;
        while(true){
            if(sc.hasNextInt()){
                n=sc.nextInt();
                break;
            }
            sc.next();
            System.out.println("输入不合法，请重新输入一个整数");
        }
        if(n<=0){
            System.out.println("不是质数");
            return;
        }
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i!=0){
                System.out.println("是质数");
                return;
            }
        }
        System.out.println("不是质数");
    }
}
