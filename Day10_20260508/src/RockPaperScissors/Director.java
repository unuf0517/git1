package RockPaperScissors;

import java.util.Scanner;

public class Director {
    Scanner sc=new Scanner(System.in);
    public void start(){
        Judge judge=new Judge();
        judge.weclome();
        System.out.println("请输入昵称:");
        String name=sc.next();
        Player player=new Player();
        Robot robot=new Robot();
        robot.setName("1");
        player.setName(name);
        String pname=player.getName();
        String rname=robot.getName();
        System.out.println("欢迎玩家：【"+pname+"】");
        System.out.println("对手的名字：【"+rname+"】");
        while(true){
            System.out.println("请出拳：1-石头 2-剪刀 3-布 88-退出 99-重新开始");
            int ri=robot.way(1);
            int pi=player.way(playerInput());
            System.out.println("【"+pname+"】"+"出的是："+judge.output(pi));
            System.out.println("【"+rname+"】"+"出的是："+judge.output(ri));
            int judgement= judge.judgeMent1(pi,ri);
            judge.winner(judgement,player,robot);
            System.out.println("当前比分：["+judge.getpscore()+":"+judge.getRscore()+"]");
            judgement= judge.judgeMent2();
            if(judge.finalWinner(judgement,player,robot)){
                break;
            }
        }

    }

    public  int playerInput(){
        while(true){
            if(sc.hasNextInt()){
                int input=sc.nextInt();
                if(input!=1 && input!=2 && input!=3){
                    if(input==88) System.exit(0);
                    if(input==99) GameText.main(null);
                    System.out.println("没有这个选项请重新输入");
                    continue;
                }
                return input;
            }
            System.out.println("输入不合法，请重新输入");
            sc.next();
        }
    }
}
