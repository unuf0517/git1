import java.util.Random;
import java.util.Scanner;

public class Demo1 {
    static Scanner sc=new Scanner(System.in);
    static Random r=new Random();
    public static void main(String[] args) {
        wellcome();
        int[] score={0};
        while(true){
            int level=level();
            String[][] map=initMap(level);
            printMap(map);
            while(true){
                creatMouse(map);
                System.out.println("****老鼠出现了****");
                printMap(map);
                if(hitMouse(map)){
                    plus(score);
                    map=initMap(level);
                }else{
                    reduce(score);
                    map=initMap(level);
                }
            }



        }
    }

    /**
     * 欢迎界面
     */
    public static void wellcome(){
        System.out.println("**********************");
        System.out.println("***欢迎来到打地鼠游戏**");
        System.out.println("**********************");
    }

    /**
     * 选择难度
     */
    public static int level(){
        int c;
        System.out.println("请选择游戏难度");
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
        return c;
    }

    /**
     * 初始化地图
     */
    public static String[][] initMap(int level){
        String[][] map=null;
        switch (level){
            case 1:
                map= new String[5][5];
                break;
            case 2:
                map= new String[10][10];
                break;
            case 3:
                map= new String[20][20];
                break;
        }
        for (int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++){
                map[i][j]="O";
            }
        }
        return map;
    }

    /**
     * 打印地图
     */
    public static void printMap(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    /**
     * 随机地鼠位置
     */
    public static void creatMouse(String[][] map){
        int row=r.nextInt(map.length);
        int col=r.nextInt(map[0].length);
        int[] random={row,col};
        map[row][col]="M";
    }

    /**
     * 打地鼠
     */
    public static boolean hitMouse(String[][] map){
        int low=-1;
        int col=-1;
        while(true){
            System.out.println("输入0退出游戏");
            low=input(map[0].length,"行");
            col=input(map.length,"列");
            if(map[low-1][col-1]=="M"){
                return true;
            }else{
                return false;
            }
        }
    }

    /**
     * 输入
     */
    public static int input(int a,String object){
        int ais;
        while(true){
            System.out.println("输入地鼠的"+object+"数");
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