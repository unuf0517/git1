import java.util.Scanner;

public class text1_0328 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        //三元运算符
        System.out.println((a > b ? a : b) > c ? (a>b ? a : b) : c);

        //多分支
        //1
        if(a>b){
            if(a>c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else{
            if(b>c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }

        //2
        if(a>=b && a>=c){
            System.out.println(a);
        }else if(b>=a && b>=c){
            System.out.println(b);
        }else if(c>=a && c>=b){
            System.out.println(c);
        }

        //单分支
        if(a>=b && a>=c){
            System.out.println(a);
        }
        if(b>=a && b>=c){
            System.out.println(b);
        }
        if(c>=a && c>=b){
            System.out.println(c);
        }
    }
}
