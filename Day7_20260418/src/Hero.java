public class Hero {
    private String name;
    private String sex;
    private int life;
    private String type;
    private Double money;

    public Hero() {
        System.out.println("无参构造");
    }

    public Hero(String name, String sex, int life, String type,Double money) {
        this.name = name;
        this.sex = sex;
        this.life = life;
        this.type = type;
        this.money = money;
        System.out.println("有参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
