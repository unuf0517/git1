import java.util.Scanner;

public class work11_0404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入班级人数");
        int n = sc.nextInt();
        double max=0;
        double sum=0;
        System.out.println("请依次输入每个同学的成绩");
        for(int i=1;i<=n;){
            System.out.println("第"+i+"名同学的成绩:");
            double score = 0;
            if(sc.hasNextDouble()){
                score=sc.nextDouble();
                if(score<0){
                    System.out.println("输入错误，分数不小于零，请重新输入该同学的分数");
                    continue;
                }
            }else{
                sc.next();
                System.out.println("输入不合法，请重新输入");
                continue;
            }
            i++;
            if(score>max){
                max=score;
            }
            sum+=score;
        }
        System.out.println("平均分:"+(sum/n)+",最高分:"+max);
    }
}
