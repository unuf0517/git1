public class Demo2 {
    public static void main(String[] args){
        String a="a";
        String b="a";
        System.out.println(a==b);

        String c=new String("a");
        String d=new String("a");
        System.out.println(c==d);
        System.out.println(c.equals(d));
    }
}
