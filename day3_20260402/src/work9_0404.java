import java.util.Scanner;

public class work9_0404 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum=0;
        int num=0;
        System.out.println("请依次输入商品价格");
        while(true){
            if(sc.hasNextDouble()){
                double price=sc.nextDouble();
                if(price<0){
                    System.out.println("商品价格为正数，请重新输入");
                    continue;
                }else if(price==0){
                    break;
                }
                sum+=price;
                num++;
                continue;
            }
            sc.next();
            System.out.println("输入不合法，请重新输入");
        }
        System.out.println("商品数量:"+num+",总价:"+sum);
    }
}
