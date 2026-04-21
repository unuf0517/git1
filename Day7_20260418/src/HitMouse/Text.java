package HitMouse;

public class Text {
     public static void main(String[] args) {
          Game game=new Game();
          while(true){
               game.setLevel();
               Hole hole=new Hole();
               hole.initMap(game.getLevel());
               hole.printMap();
               while(true){
                    Mouse mouse=new Mouse();
                    mouse.creatMouse(hole.getMap());
                    System.out.println("****老鼠出现了****");
                    hole.printMap();
                    if(game.hitMouse(mouse.getX(),mouse.getY(),hole.getMap())){
                         game.plus();
                         hole.initMap(game.getLevel());
                    }else{
                         game.reduce();
                         hole.initMap(game.getLevel());
                    }
               }
          }
     }
}