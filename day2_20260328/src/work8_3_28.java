import java.util.Scanner;

public class work8_3_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price=sc.nextDouble();//12.5
        int n=sc.nextInt();//30
        double sum=price*n;
        double sum_=0;
        if(sum>=500){
            sum_=sum*0.8;
        }else if(sum>=300){
            sum_=sum*0.9;
        }
        System.out.println("原价："+sum+"折后价："+sum_);
        //原价：375.0折后价：337.5
    }
}
