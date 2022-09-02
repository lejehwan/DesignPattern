package strategyPatternAfter;

public class StrategyPatternAfter {
    /**
     *
     * 전략 패턴 : 행동 패턴으로써 행위를 클래스로 캡슐화 하여 동적으로 행위를 자유롭게 바꾸도록 함 -> 전략을 쉽게 변경
     */
    public static void main(String[] args) {

        // 기존의 Duck class에서 변화하는 부분을 인터페이스로 만들고
        // 각 행동 클래스에게 위임함(상속 으로 문제 해결 X) -> 해당 인터페이스를 구현하도록 함.

        // 생성자를 통해 행위를 주입시킴
        Duck mallarDuck = new MallarDuck();
        mallarDuck.setFlyBehavior(new FlyWithWings());
        mallarDuck.setSwimBehavior(new Swim());

        mallarDuck.performFly();
        mallarDuck.performSwim();

        Duck notDuck = new NotDuck();
        notDuck.setFlyBehavior(new FlyNoWay());
        notDuck.setSwimBehavior(new NotSwim());

        notDuck.performFly();
        notDuck.performSwim();

        // 이로써 새로운 기능이 추가되어도 다른 코드에는 영향을 끼치지 않고
        // 기능이 바뀌어도 해당 코드만 변경하면 된다.
    }
}
