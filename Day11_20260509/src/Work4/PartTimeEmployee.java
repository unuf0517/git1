package Work4;

public class PartTimeEmployee extends Employee{
    private double hour;
    private double hourMoney;

    public PartTimeEmployee(int id, String name, double salary,double hour,double hourMoney){
        super(id,name,salary);
        this.hour=hour;
        this.hourMoney=hourMoney;
    }

    @Override
    public void work(){
        System.out.println("临时工工作方式");
    }
    @Override
    public void calcSalary(){
        System.out.println("工资 = 时薪 × 工作时长");
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getHourMoney() {
        return hourMoney;
    }

    public void setHourMoney(double hourMoney) {
        this.hourMoney = hourMoney;
    }
}
