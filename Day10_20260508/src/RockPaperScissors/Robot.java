package RockPaperScissors;

import java.util.Random;

public class Robot extends Role {
    Random r=new Random();
    @Override
    public void setName(String name) {
        String[] namearr={"赵云","吕布","华雄","杨戬"};
        int n=r.nextInt(namearr.length);
        super.aaiginName(namearr[n]);
    }

    @Override
    public int way(int input){
        return r.nextInt(3)+1;
    }
}
