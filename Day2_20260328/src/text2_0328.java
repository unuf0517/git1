import java.util.Scanner;

public class text2_0328 {
    public static void main(String[] args) {
        //分解三位数
        Scanner sc = new Scanner(System.in);

        //1
        int n = sc.nextInt();
        int a=n%10;
        n/=10;
        int b=n%10;
        n/=10;
        int c=n%10;
        System.out.println(a+" "+b+" "+c);

        //2
        int m = sc.nextInt();
        for(int i=0;i<3;i++){
            System.out.print(m%10+" ");
            m/=10;
        }
    }
}
