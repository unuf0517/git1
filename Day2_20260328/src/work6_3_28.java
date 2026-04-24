import java.util.Scanner;

public class work6_3_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();//2026
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("是闰年");
        }else{
            System.out.println("不是闰年");//不是闰年
        }
    }
}
