package HitMouse;

public class User implements UserInput{
    private int score;
    private int life=3;
    public void hit(Mouse mouse){
        System.out.println("请输入要打的行号：");
        int row=userInput();
        System.out.println("请输入要打的列号；");
        int col=userInput();

        if(row-1== mouse.getRow() && col-1==mouse.getCol()){
            System.out.println("打中了");
            score+=mouse.getScore();
        }else{
            System.out.println("没打中,生命值-1");
            score=Math.max(0,--score);
            life--;
        }
        System.out.println("当前得分："+score);
        System.out.println("当前剩余生命值："+life);
        System.out.println("========================");
    }

    public int getScore() {
        return score;
    }

    public int getLife() {
        return life;
    }
}
