public class Work3 {
    public static void main(String[] args){
        String str="HelloJavaWorld";
        int num=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                num++;
            }
        }
        System.out.println("原字符串："+str+"\n大写字母个数："+num+"\n翻转后字符串："+new StringBuilder(str).reverse());
    }
}
