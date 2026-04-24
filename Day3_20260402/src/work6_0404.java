public class work6_0404 {
    public static void main(String[] args) {
        for(int i=100;i<=999;i++){
            int temp=i;
            int a=temp%10;
            temp/=10;
            int b=temp%10;
            int c=temp/10;
            if(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)==i){
                System.out.println(i);
            }
        }
    }
}
