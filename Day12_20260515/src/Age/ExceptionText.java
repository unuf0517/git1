package Age;

import java.util.Scanner;

public class ExceptionText {
    public static void main(String[] args) throws AgeException {
        //键盘录入一个年龄，判断大小，小于0或者大于100，抛出年龄异常
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年龄");
        int age=sc.nextInt();
        if(age<0 || age>100){
            throw new AgeException("年龄超出范围："+age);
        }
    }
}
