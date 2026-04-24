import java.util.Scanner;

public class work1_0404_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入层数");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(" ".repeat(n-i));
            System.out.print("*".repeat(2 * i + 1));
            System.out.println();
        }
    }
}
