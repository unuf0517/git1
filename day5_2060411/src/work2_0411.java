import java.util.Random;
import java.util.Scanner;

public class work2_0411 {//张志贤
    static Scanner sc=new Scanner(System.in);
    static Random r=new Random();
    public static void main(String[] args) {
        int[] score={0};
        int[] lw={0};
        choice(lw);
        int l=lw[0];
        int w=lw[0];
        a:while(true){
            int[][] arr=new int[l][w];
            random(arr,lw);
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
    public static void random(int[][] arr,int[] choice){
        int x=r.nextInt(arr.length);
        int y=r.nextInt(arr.length);
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

    /**
     * 选择难度
     */
    public static void choice(int[] choice){
        int c;
        System.out.printf("请选择游戏难度");
        System.out.println("简单--1，普通--2，困难级--3");
        while(true){
            if(sc.hasNextInt()){
                c=sc.nextInt();
                if(c!=1 &&  c!=2 && c!=3){
                    continue;
                }
                break;
            }
            sc.next();
            System.out.println("输入不合法，请重新输入");
        }
        switch(c){
            case 1:
                choice[0]= 3;
                break;
            case 2:
                choice[0]= 5;
                break;
            case 3:
                choice[0]= 7;
                break;
        }
    }
}
