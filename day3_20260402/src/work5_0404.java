public class work5_0404 {
    public static void main(String[] args) {
        int count = 1;
        for (int five=0;five<=4;five++) {
            for (int two=0;two<=(20-5*five)/2;two++) {
                int one=20-5*five-2*two;
                System.out.println("第"+count+"种："+one+"张一元，"+two+"张两元，"+five+"张五元");
                count++;
            }
        }
    }
}
