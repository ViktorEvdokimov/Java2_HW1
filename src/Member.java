public class Member {
    private int power;
    String name;

    public Member(String name) {
        this.name = name;
        this.power = 100;
    }
    public Member(String name,int power) {
        this.name = name;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }
}
