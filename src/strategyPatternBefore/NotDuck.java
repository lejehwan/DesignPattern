package strategyPatternBefore;

public class NotDuck implements Flyable, Swimable {

    @Override
    public void fly() {
        System.out.println("나는 못날아요");
    }

    @Override
    public void swim() {
        System.out.println("나는 헤엄을 못쳐요");
    }
}
