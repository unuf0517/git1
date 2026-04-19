public class Student {
    String number;
    String name;
    int age;

    public Student() {
        System.out.println("构造了一个方法");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
