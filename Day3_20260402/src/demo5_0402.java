import java.util.Random;
import java.util.Scanner;

public class demo5_0402 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        for(int i=0;i<4;i++){
            int num=r.nextInt(26);
            System.out.print((char)(num+97));
        }
    }
}
