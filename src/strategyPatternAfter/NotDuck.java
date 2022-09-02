package strategyPatternAfter;

public class NotDuck extends Duck{

    @Override
    public void display() {
        System.out.println("나는 날지도 수영하지도 못하는 오리");
    }

    @Override
    public void quack() {
        System.out.println("삑삑");
    }
}
