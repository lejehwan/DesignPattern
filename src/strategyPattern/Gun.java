package strategyPattern;

public class Gun implements Weapon{

    @Override
    public void attack() {
        System.out.println("총 공격");
    }
}
