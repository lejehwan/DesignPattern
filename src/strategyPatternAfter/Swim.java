package strategyPatternAfter;

public class Swim implements SwimBehavior {

    @Override
    public void swim() {
        System.out.println("나는 헤엄친다");
    }
}
