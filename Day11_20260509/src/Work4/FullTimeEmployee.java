package Work4;

public class FullTimeEmployee extends Employee{
    private double bonus;

    public FullTimeEmployee(int id, String name, double salary,double bonus){
        super(id,name,salary);
        this.bonus=bonus;
    }

    @Override
    public void work(){
        System.out.println("正式员工的工作方式");
    }
    @Override
    public void calcSalary(){
        System.out.println("工资 = 基本工资 + 奖金");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
