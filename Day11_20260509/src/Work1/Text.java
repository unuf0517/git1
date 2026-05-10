package Work1;

import java.util.Scanner;

public class Text {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double r;
        while (true){
            System.out.println("请输入一个非负数");
            if(sc.hasNextInt()){
                r=sc.nextInt();
                break;
            }
            System.out.println("输入不合法，请重新输入");
            sc.next();
        }
        Circle c=new Circle(r);
        c.show();
        System.out.println(c.getArea());
    }
}
