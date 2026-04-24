
public class demo3_0402 {
    public static void main(String[] args) {
        /*
        int count=0;
        //条件、迭代语句、初始值
        while(count<5){
            System.out.println("hello");
            count++;
        }

        int a=1;
        while(a<=100){
            System.out.println(a);
            a++;
        }
         */
        int c=0;
        while(c<5){
            c++;
            if(c==3){
                continue;//直接开始一个新的循环
                //break;//直接退出循环
            }
            System.out.println("hello");
        }
    }
}
