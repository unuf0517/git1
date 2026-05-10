package Work2;

public class Keyboard implements USB{
    @Override
    public void open(){
        System.out.println("键盘已连接");
    }
    @Override
    public void close(){
        System.out.println("键盘已断开");
    }
}
