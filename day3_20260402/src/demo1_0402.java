import java.util.Scanner;

public class demo1_0402 {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("请输入第一条边");
        int a=sc.nextInt();
        System.out.println("请输入第二条边");
        int b=sc.nextInt();
        System.out.println("请输入第三条边");
        int c=sc.nextInt();
        int sum=a+b+c;
        int max = a >= b ? (a >= c ? a : c) : (b >= c ? b : c);
        if(sum-max>=max){
            System.out.println("可以构成三角形");
        }else{
            System.out.println("不可以构成三角形");
        }
    }
}
