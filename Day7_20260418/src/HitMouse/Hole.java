package HitMouse;

public class Hole {
    private String[][] map;

    /**
     * 初始化地图
     */
    public void initMap(int level) {
        map = null;
        switch (level) {
            case 1:
                map = new String[5][5];
                break;
            case 2:
                map = new String[10][10];
                break;
            case 3:
                map = new String[20][20];
                break;
        }
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = "O";
            }
        }
    }

    public String[][] getMap() {
        return map;
    }

    /**
     * 打印地图
     */
    public void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
