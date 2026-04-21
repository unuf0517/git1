package HitMouse;

import java.util.Random;

public class Mouse {
    static Random r=new Random();
    private int x;
    private int y;

    public Mouse() {
    }

    /**
     * 随机地鼠位置
     */
    public void creatMouse(String[][] map){
        x=r.nextInt(map.length);
        y=r.nextInt(map[0].length);
        map[x][y]="M";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
