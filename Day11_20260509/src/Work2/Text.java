package Work2;

public class Text {
    public static void main(String[] args){
        USB mouse=new Mouse();
        USB keyboard=new Keyboard();
        mouse.open();
        mouse.close();
        keyboard.open();
        keyboard.close();
    }
}
