public class demo1_0411 {
    public static void main(String[] args) {
        add(7,8);
        double s1=area("机房一",20,20);
        double s2=area("机房二",25,30);
        double s3=area("机房三",15,15);
        double sum=s1+s2+s3;
        System.out.println(sum);
    }

    public static void add(int x,int y){
        int c=x+y;
        System.out.println(c);
    }

    /**
     *
     * @param site 房间的名称
     * @param longs 长度
     * @param wides 宽度
     * @return 房间面积
     */
    public static double area(String site,double longs,double wides){
        double res=longs*wides;
        System.out.println(site+"面积："+res);
        return res;
    }
}
