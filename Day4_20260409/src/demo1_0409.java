import java.util.Arrays;

public class demo1_0409 {
    public static void main(String[] args) {
        String[] arr={"张三","李四","王五"};//静态初始化
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);//[Ljava.lang.String;@f6f4d33

        System.out.println("============");

        int[] arr1={1,2,3,4,5};
        int[] arr2=arr1;//浅拷贝，如何深拷贝
        arr2[0]=2;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);

        System.out.println("============");

        String[] arrstr=new String[5];
        System.out.println(Arrays.toString(arrstr));

        int[] arrint=new int[5];
        System.out.println(Arrays.toString(arrint));

        double[] arrd=new double[5];
        System.out.println(Arrays.toString(arrd));

        char[] arrchar=new char[5];
        System.out.println(Arrays.toString(arrchar));// \u0000

        boolean[] arrbool=new boolean[5];
        System.out.println(Arrays.toString(arrbool));
    }
}
