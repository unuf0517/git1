public class Demo2 {
    public static void main(String[] args){
        try{
            text();
        }catch (NullPointerException e){
            System.out.println("异常处理");
        }

    }
    public static void text() throws NullPointerException{//抛异常
        Object obj=null;
        obj.toString();
    }
}
