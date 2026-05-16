package Multiplication;

import java.util.Scanner;

public class ExceptionText {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws MultiplicatonException{
        System.out.println("请输入非负数");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        if(a<=0 || b<=0){
            throw new MultiplicatonException("geigei输入的数字不合法哦");
        }
        System.out.println(a*b);
    }
}
