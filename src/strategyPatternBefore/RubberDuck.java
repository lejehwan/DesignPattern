package strategyPatternBefore;

public class RubberDuck extends Duck{

    @Override
    void display() {
        System.out.println("나는 고무오리");
    }

    @Override
    public void quack() {
        System.out.println("삑삑 운다");
    }

    // 1번 문제점
//    @Override
//    public void fly() {
//        // 고무오리는 하늘을 날 수 없다.
//    }
}
