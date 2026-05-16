public class Demo1 {
    public static void main(String[] args){
        try{
            System.out.println(1/0);

            Object obj=null;
            obj.toString();

            int[] arr={1,2,3};
            System.out.println(arr[4]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常");
        }catch(NullPointerException e){
            System.out.println("空指针异常");
        }catch(Exception e){//异常的父类Expection
            System.out.println("程序异常");
        }finally{
            //无论有没有出异常，finally的代码都会执行
            System.out.println("资源释放");
        }
        System.out.println("-----------");
    }
}
