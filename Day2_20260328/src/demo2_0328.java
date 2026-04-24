import javax.xml.transform.Source;

public class demo2_0328 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=2;
        /*
        if(a>b){
            if(a>c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else{
            if(b>c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }


        if(a>=b && a>=c){
            System.out.println(a);
        }
        if(b>=a && b>=c){
            System.out.println(b);
        }
        if(c>=a&&c>=b){
            System.out.println(c);
        }

         */
        if(a>=b && a>=c){
            System.out.println(a);
        }else if(b>=a && b>=c){
            System.out.println(b);
        }else if(c>=a&&c>=b){
            System.out.println(c);
        }
    }
}
