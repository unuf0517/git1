package HitMouse;

public class Director implements UserInput{
    public void start(){
        GameMap gameMap=new GameMap();
        Mouse mouse=new Mouse();
        User user=new User();

        System.out.println("选择难度：初级--1，中级--2，高级--3");
        int level=userInput(1,3);

        gameMap.initMap(level);
        Bomb[] bombs = Bomb.createBombs(gameMap.getMap(),2);
        gameMap.setBombMap(bombs);

        while(user.getLife()>0){
            mouse.createMouse(gameMap.getRow(),gameMap.getCol());
            for(int i=0;i<bombs.length;i++) {
                if (mouse.getRow() == bombs[i].getRow() && mouse.getCol() == bombs[i].getCol()) {
                    break;
                }
            }
            System.out.println("========老鼠出现了========");
            gameMap.setMap(mouse.getRow(),mouse.getCol());
            gameMap.printMap();
            user.hit(mouse,bombs,gameMap.getRow(),gameMap.getCol());
            gameMap.resetMap(mouse.getRow(),mouse.getCol());

            for (int i=0;i<bombs.length; i++) {
                gameMap.resetMap(bombs[i].getRow(), bombs[i].getCol());
            }
            bombs = Bomb.createBombs(gameMap.getMap(),2);
            gameMap.setBombMap(bombs);
        }
        System.out.println("游戏结束，最终得分："+user.getScore());
    }
}
