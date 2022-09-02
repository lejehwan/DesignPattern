package strategyPatternAfter;

public abstract class Duck {

    FlyBehavior flyBehavior;
    SwimBehavior swimBehavior;

    // 다형성을 통해 클래스를 인터페이스로 받음
    // 또한 
    // set을 통해서 동적으로 주입을 받음
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    public void setSwimBehavior(SwimBehavior swimBehavior){
        this.swimBehavior = swimBehavior;
    }

    // 받은 인터페이스의 메서드를 실행
    public void performSwim(){
        swimBehavior.swim();
    }
    public void performFly(){
        flyBehavior.fly();
    }

    public abstract void display();
    public abstract void quack();
}
