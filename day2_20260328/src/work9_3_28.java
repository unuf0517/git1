import java.util.Scanner;

public class work9_3_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//153
        int temp=n;
        if(n<100 || n>999){
            return;
        }
        int m=0;
        for(int i=1;i<=3;i++){
            m+=Math.pow(n%10,3);
            n/=10;
        }
        if(m==temp){
            System.out.println(temp+"是水仙花数");//153是水仙花数
        }else{
            System.out.println(temp+"不是水仙花数");
        }
    }
}
