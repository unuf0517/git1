package HitMouse;

import java.util.Scanner;

public class Game {
    static Scanner sc=new Scanner(System.in);

    private int score=0;
    private int level=0;

    public Game() {
        System.out.println("**********************");
        System.out.println("***欢迎来到打地鼠游戏**");
        System.out.println("**********************");
    }

    /**
     * 选择难度
     */
    public void setLevel(){
        System.out.println("请选择游戏难度");
        System.out.println("简单--1，普通--2，困难级--3");
        while(true){
            if(sc.hasNextInt()){
                level=sc.nextInt();
                if(level!=1 && level!=2 && level!=3){
                    continue;
                }
                break;
            }
            sc.next();
            System.out.println("输入不合法，请重新输入");
        }
    }


    /**
     * 打地鼠
     */
    public boolean hitMouse(int mouseX, int mouseY,String[][] map){
        int row=-1;
        int col=-1;
        while(true){
            System.out.println("输入0退出游戏");
            row=input(map[0].length,"行")-1;
            col=input(map.length,"列")-1;
            if(row==mouseX && col==mouseY){
                return true;
            }else{
                return false;
            }
        }
    }

    /**
     * 输入
     */
    public int input(int scope,String object){
        int ais;
        while(true){
            System.out.println("输入地鼠的"+object+"数");
            if(sc.hasNextInt()){
                ais=sc.nextInt();
                if(ais>scope){
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
    public void plus(){
        score+=1;
        System.out.print("+1分  ");
        System.out.println("分数："+score);

    }

    /**
     * 减分
     */
    public void reduce(){
        score-=1;
        System.out.print("-1分  ");
        if(score<0){
            System.out.println("你输了!");
            System.exit(0);
        }
        System.out.println("分数："+score);
    }


    public int getLevel(){
        return level;
    }

}
