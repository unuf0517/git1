public interface Usb {
    public static final int a = 0;

    public abstract void open();

    default void close(){
        System.out.println("关闭");
    }

}
