package strategyPatternAfter;

public class MallarDuck extends Duck{

    @Override
    public void display() {
        System.out.println("나는 천둥오리");
    }

    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }


}
