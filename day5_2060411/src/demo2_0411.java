import java.util.Random;
import java.util.Scanner;

public class demo2_0411 {//张志贤
    static Random r=new Random();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String name=name();//玩家名字
        String robname=robname();//机器名字
        welcome(name,robname);
        int[] score={0,0};
        game(name,robname,score);

    }

    /**
     * 输入玩家姓名
     */
    public static String name(){
        System.out.println("输入你的名字");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        return name;
    }

    /**
     * 欢迎界面
     */
    public static void welcome(String name,String robname){
        System.out.println("**********猜拳游戏**********");
        System.out.println("欢迎"+name+"来到猜拳游戏，与你对战的是"+robname);
        System.out.println("***************************");
    }

    /**
     * 生成机器姓名
     */
    public static String robname(){
        Random r=new Random();
        String[] name={"张飞","吕布","刘备","关羽","曹操"};
        return name[r.nextInt(name.length-1)];
    }

    /**
     * 游戏主体
     * @param name 玩家名字
     * @param robname 机器名字
     * @param score 总分
     */
    public static void game(String name,String robname,int[] score){
        while(true){
            int x=youres(score);
            int y=robres();
            String[] game={"","剪刀","石头","布"};
            System.out.println(name+"出"+game[x]+","+robname+"出"+game[y]);
            if(x>y){
                System.out.println(name+"赢了");
                score[0]+=1;
                System.out.println(name+"+1分,当前比分："+score[0]+":"+score[1]);
            }else if(x<y){
                System.out.println(robname+"赢了");
                score[1]+=1;
                System.out.println(robname+"+1分,当前分数："+score[0]+":"+score[1]);
            }else{
                System.out.println("平局,当前分数"+score[0]+":"+score[1]);
            }
        }

    }

    /**
     * 输入玩家输入
     */
    public static int youres(int[] score){
        int x;
        System.out.println("请输入");

        System.out.println("退出游戏--0，剪刀--1，石头--2，布--3");
        while(true){
            if(sc.hasNextInt()){
                x=sc.nextInt();
                if(x!=0 && x!=1 && x!=2  && x!=3){
                    System.out.println("没有这个选项，请重新输入");
                    continue;
                }
                break;
            }
            sc.next();
            System.out.println("输入不合法，请重新输入");
        }
        if(x==0) end(score);
        return x;
    }

    /**
     * 生成机器出的
     */
    public static int robres(){

        int y=r.nextInt(2)+1;
        return y;
    }

    /**
     * 退出游戏
     */
    public static void end(int[] score){
        System.out.println("游戏结束，最终比分"+score[0]+":"+score[1]);
        System.exit(0);
    }

}
