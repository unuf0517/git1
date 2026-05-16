package Register;

import java.util.Scanner;

public class ExceptionText{
    public static void main(String[] args) throws RegisterException{
        String[] User={"张三","李四","王五"};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        String name=sc.nextLine();
        for(String Username:User){
            if(Username.equals(name)) throw new RegisterException("哥哥用户名已经存在了哦, 不允许重复注册");
        }
        System.out.println("注册成功");
    }
}
