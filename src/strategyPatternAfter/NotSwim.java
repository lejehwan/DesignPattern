package strategyPatternAfter;

public class NotSwim implements SwimBehavior {

    @Override
    public void swim() {
        System.out.println("나는 헤엄 못침");
    }
}
