package HitMouse;

public class Director implements UserInput{
    public void start(){
        GameMap gameMap=new GameMap();
        Mouse mouse=new Mouse();
        User user=new User();

        System.out.println("选择难度：初级--1，中级--2，高级--3");
        int level=userInput(1,3);

        gameMap.initMap(level);

        while(user.getLife()>0){
            mouse.createMouse(gameMap.getRow(),gameMap.getCol());
            System.out.println("========老鼠出现了========");
            gameMap.setMap(mouse.getRow(),mouse.getCol());
            gameMap.printMap();
            user.hit(mouse);
            gameMap.resetMap(mouse.getRow(),mouse.getCol());
        }
        System.out.println("游戏结束，最终得分："+user.getScore());
    }
}
