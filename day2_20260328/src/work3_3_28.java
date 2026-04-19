import java.util.Scanner;

public class work3_3_28 {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int score=sc.nextInt();//61
        if(score<0 || score>100){
            return;
        }
        System.out.println(score >= 60 ? "及格" : "不及格");//及格
    }
}
