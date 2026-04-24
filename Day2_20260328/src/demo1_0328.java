import java.sql.SQLOutput;

public class demo1_0328 {
    public static void main(String[] args) {

        /*
        int x=10;
        System.out.println(x);3--内涵一个隐式转换，把3.333...转换为3

        int x=10;
        double y=x/3.0;
        System.out.println(y);

        int x=456;
        for (int i = 0; i < 3; i++) {
            System.out.println(x%10);
            x/=10;
        }

        double a=3.0;
        float b=3.0f;
        System.out.println(a==b);

        char d='a';
        int c=97;
        System.out.println(d==c);

        double a=50;
        double b=80;
        System.out.println(a>=60 && b++>60);//&&为短路与，前一个条件成立则后面的条件不运行，用自增可以判断，不运行则不自增
        System.out.println(b);

        System.out.println(28 & 5);//位运算符
         */
        int x=11;
        System.out.println(x%2==0 ? "偶数" : "奇数");//三元运算符
    }
}
