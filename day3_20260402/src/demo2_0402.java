import java.util.Scanner;

public class demo2_0402 {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int i=sc.nextInt();
        switch(i){//char\String....
            case 1:
                System.out.println("注册");
                break;
            case 2:
                System.out.println("登录");
                break;
            case 3:
                System.out.println("查询用户信息");
                break;
            case 4:
                System.out.println("退出系统");
                break;
        }
        //条件范围用if，有确切的值用switch

    }
}
