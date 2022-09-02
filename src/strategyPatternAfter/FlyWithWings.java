package strategyPatternAfter;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("하늘을 난다");
    }
}
