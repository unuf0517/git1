package Work4;

public abstract class Employee {
    private int id;
    private String name;
    private double Salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    public abstract void work();

    public abstract void calcSalary();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
