import java.util.Random;

public class demo2_0409 {
    public static void main(String[] args) {
        Random r = new Random();
        String[] arr={"鸡蛋","鸡腿","青菜","馒头"};
        System.out.println("今天吃"+arr[r.nextInt(arr.length)]);
    }
}
