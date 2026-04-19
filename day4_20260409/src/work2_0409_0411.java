import java.util.Random;
import java.util.Scanner;

public class work2_0409_0411 {//张志贤
    static Scanner sc=new Scanner(System.in);
    static Random r=new Random();
    public static void main(String[] args) {
        int[] score={0};
        int l=3;
        int w=3;
        a:while(true){
            int[][] arr=new int[l][w];
            random(arr);
            int xais;
            int yais;
            while(true){
                System.out.println("输入0退出游戏");
                xais=input(l,"x");
                yais=input(w,"y");
                if(arr[xais-1][yais-1]==1){
                    plus(score);
                    continue a;
                }else{
                    reduce(score);
                    continue a;
                }
            }

        }
    }

    /**
     * 随机地鼠位置
     */
    public static void random(int[][] arr){
        int x=r.nextInt(3);
        int y=r.nextInt(3);
        arr[x][y]=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    /**
     * 输入
     */
    public static int input(int a,String object){
        int ais;
        while(true){
            System.out.println("输入地鼠"+object+"轴");
            if(sc.hasNextInt()){
                ais=sc.nextInt();
                if(ais>a){
                    System.out.println("超出范围请重新输入");
                    continue;
                }
                break ;
            }
            sc.next();
            System.out.println(object+"为正整数，请重新输入");
        }
        if(ais==0) System.exit(0);
        return ais;
    }


    /**
     *加分
     */
    public static void plus(int[] score){
        score[0]+=1;
        System.out.print("+1分  ");
        System.out.println("分数："+score[0]);
    }

    /**
     * 减分
     */
    public static void reduce(int[] score){
        score[0]-=1;
        System.out.print("-1分  ");
        if(score[0]<0){
            System.out.println("你输了!");
            System.exit(0);
        }
        System.out.println("分数："+score[0]);
    }
}
