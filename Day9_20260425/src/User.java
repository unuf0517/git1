public class User {
    private String account;
    private String password;
    public String sickname;
    private int money;
    protected String xis;

    public User(String account, String password, String sickname, int money, String xis) {
        this.account = account;
        this.password = password;
        this.sickname = sickname;
        this.money = money;
        this.xis = xis;
    }

    public User() {
            System.out.println("父类构造无参");
    }

    public void Sleep(){
        System.out.println("睡觉");
    }
}
