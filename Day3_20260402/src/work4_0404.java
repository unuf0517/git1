public class work4_0404 {
    public static void main(String[] args) {
        int sum=1;
        for(int i=1;i<=100;i++){
            if(i%5==0){
                if(sum%3==0){
                    System.out.println(i);
                }else{
                    System.out.print(i+"  ");
                }
                sum++;
            }
        }
    }
}
