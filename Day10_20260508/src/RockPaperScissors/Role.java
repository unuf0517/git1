package RockPaperScissors;

public abstract class Role {
    private String name;
    private int count;

    public String getName() {
        return name;
    }

    public abstract void setName(String name);
    public abstract int way(int input);

    public void aaiginName(String name){
        this.name=name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
