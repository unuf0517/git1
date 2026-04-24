import java.util.Scanner;

public class work7_0328_0402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int age = sc.nextInt();
            if(age>=0 && age<=3){
                System.out.println("婴儿");
            }else if(age>=4 && age<=12){
                System.out.println("儿童");
            }else if(age>=13 && age<=18){
                System.out.println("青少年");
            }else if(age>=19 && age<=60){
                System.out.println("成年");
            }else if(age>=60){
                System.out.println("老年");
            }
        }else{
            System.out.println("输入不合法");
        }

    }
}
