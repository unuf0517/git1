import java.net.SocketTimeoutException;
import java.util.Scanner;

public class work10_3_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("能构成三角形");
        }else{
            System.out.println("不能构成三角形");
        }
    }
}
