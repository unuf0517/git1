package Work4;

public class Text {
    public static void main(String[] args){
        Employee ftp=new FullTimeEmployee(1,"张三",7000,2000);
        Employee ptp=new PartTimeEmployee(2,"李四",3000,40,20);
        ftp.work();
        ftp.calcSalary();
        ptp.work();
        ptp.calcSalary();
        System.out.println("正式员工工号："+ftp.getId()+",姓名："+ftp.getName());
        System.out.println("临时工工号："+ptp.getId()+",姓名："+ptp.getName());
    }
}
