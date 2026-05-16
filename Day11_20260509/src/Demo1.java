import java.util.Random;

public class Demo1 {
    public static void main(String args[]){
        String arr="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM123456789";
        String result="";
        Random r=new Random();
        for(int i=0;i<4;i++){
            result+=arr.charAt(r.nextInt(62));
        }
        System.out.println(result);
    }
}
