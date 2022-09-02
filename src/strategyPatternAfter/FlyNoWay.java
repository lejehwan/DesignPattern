package strategyPatternAfter;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("하늘을 못남");
    }
}
