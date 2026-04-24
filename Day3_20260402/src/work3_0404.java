import java.util.Scanner;

public class work3_0404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("输入一个数字");
        while(true){
            if(sc.hasNextInt()){//输入缓冲区残留了非法字符，会导致死循环
                n = sc.nextInt();
                break;
            }
            sc.next();//必须用 sc.next() 把错误内容读取并丢弃，缓冲区才会空，程序才会等待新输入
            System.out.println("输入不合法请重新输入");
        }
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
