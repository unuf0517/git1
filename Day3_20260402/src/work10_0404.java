import java.util.Scanner;

public class work10_0404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password="123456";
        for(int i=0;i<3;i++){
            String n=sc.nextLine();
            if(password.equals(n)){
                System.out.println("登录成功");
                break;
            }else if(i==2){
                System.out.println("账号锁定");
                break;
            }else{
                System.out.println("密码错误，剩余"+(2-i)+"次机会");
            }
        }
    }
}
