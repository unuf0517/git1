import java.util.Scanner;

public class work3_0409 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入所购买物品数量");
        int num;
        double sum=0;
        double max=0;
        while(true){
            if(sc.hasNextInt()){
                num=sc.nextInt();
                break;
            }
            sc.next();
            System.out.println("输入不合法请重新输入");
        }
        double[] good=new double[num];
        System.out.println("依次输入每一件商品的价格");
        for (int i = 0; i < good.length; i++) {
            double price;
            while (true) {
                System.out.println("第"+(i+1)+"件商品的价格：");
                if (sc.hasNextDouble()) {
                    price = sc.nextDouble();
                    if (price <= 0) {
                        System.out.println("商品价格为正数，请重新输入");
                        continue;
                    }
                    break;
                }
                sc.next();
                System.out.println("输入不合法请重新输入");
            }
            good[i] = price;
            sum += price;
            if (price > max) max = price;
        }
        System.out.println("商品总价为："+sum+"，最高价商品价格为："+max);
    }
}
