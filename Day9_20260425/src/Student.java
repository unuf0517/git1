public class Student extends User{
    private String password;

    public Student(){
        System.out.println("子类构造无参");
    }
    public Student(String a){
        password=a;
        System.out.println("子类有参");
    }
    public void Eat(){
        System.out.println("吃饭");
    }

    public void getPassword() {
        System.out.println(password);
    }
}
