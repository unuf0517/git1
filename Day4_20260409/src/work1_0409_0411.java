import java.util.Arrays;
import java.util.Scanner;

public class work1_0409_0411 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入要输入数字个数");
        int num;
        while(true){
            if(sc.hasNextInt()){
                num=sc.nextInt();
                break;
            }
            sc.next();
            System.out.println("输入不合法，请重新输入");
        }
        double[] arr=new double[num];
        System.out.println("请输入"+num+"个数字");
        for(int i=0;i<arr.length;i++){
            while(true){
                System.out.println("第"+(i+1)+"个");
                if(sc.hasNextDouble()){
                    arr[i]=sc.nextDouble();
                    break;
                }
                sc.next();
                System.out.println("输入不合法，请重新输入");
            }
        }
        //顺序排列
        for(int i=0;i<arr.length-1;i++){
            boolean flag=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    flag=true;
                    double temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!flag) break;//0411
        }
        System.out.println(Arrays.toString(arr));

        double[] arr2=new double[num];
        for(int i=0;i<num;i++){
            arr2[i]=arr[i];
        }

        //逆序排列
        for(int i=0;i<arr2.length-1;i++){
            boolean flag=false;
            for(int j=0;j<arr2.length-1-i;j++){
                if(arr2[j]<arr2[j+1]){
                    double temp=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag) break;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
