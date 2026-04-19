import java.util.Scanner;

public class work4_0409 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] arr=new String[5];
        System.out.println("依次输入同学的名字");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextLine();
        }
        a:while(true){
            System.out.println("输入要查询的学生的名字,输入0退出系统");
            String student=sc.nextLine();
            if(student.equals("0")){
                break;
            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i].equals(student)){
                    System.out.println("存在");
                    continue a;
                }
            }
            System.out.println("不存在");
        }
    }
}
