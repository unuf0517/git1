package RockPaperScissors;

public class Judge {
    private String name="蜻蜓队长";
    private int pscore=0;
    private int rscore=0;
    public void weclome(){
        System.out.println("********************");
        System.out.println("欢迎来到猜拳游戏");
        System.out.println("********************");
    }
    public String output(int input){
        String[] arr={"石头","剪刀","布"};
        return arr[input-1];
    }

    public int judgeMent1(int pi,int ri){
        if((pi==1 && ri==2) || (pi==2 && ri==3) || (pi==3 && ri==1)){
            pscore+=2;
            return 1;
        }else if(pi==ri){
            return 0;
        }
        rscore+=2;
        return 2;
    }

    public int judgeMent2(){
        if(pscore==10) return 3;
        if(rscore==10) return 4;
        return 0;
    }

    public boolean finalWinner(int judgement,Role player,Role robot){
        if(judgement==3){
            System.out.println("*******************");
            System.out.println("【"+name+"】"+"判断最终["+player.getName()+"]胜利!!!!!");
            System.out.println("最终比分【"+pscore+":"+rscore+"】");
            return true;

        }else if(judgement==4){
            System.out.println("*******************");
            System.out.println("【"+name+"】"+"判断最终["+robot.getName()+"]胜利!!!!!");
            System.out.println("最终比分【"+pscore+":"+rscore+"】");
            return true;
        }
        return false;
    }

    public void winner(int judgement,Role player,Role robot){
        if(judgement==1){
            System.out.println("【"+name+"】判定："+player.getName()+"胜");
        }else if(judgement==2){
            System.out.println("【"+name+"】判定："+robot.getName()+"胜");
        }else if(judgement==0){
            System.out.println("【"+name+"】判定：平局");
        }
    }


    public String getName() {
        return name;
    }

    public int getpscore() {
        return pscore;
    }
    public int getRscore(){
        return rscore;
    }

    public void setPscore(int pscore) {
        this.pscore = pscore;
    }

    public void setRscore(int rscore) {
        this.rscore = rscore;
    }
}
