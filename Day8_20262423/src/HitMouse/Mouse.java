package HitMouse;

import java.util.Random;

public class Mouse {
    private int score=1;
    private int row;
    private int col;
    Random r = new Random();
    public void createMouse(int mapRow,int mapCol){
        row = r.nextInt(mapRow);
        col = r.nextInt(mapCol);

    }

    public int getScore() {
        return score;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
