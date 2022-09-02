package strategyPatternBefore;

public abstract class Duck {

    public void quack(){
        System.out.println("꽥꽥 운다");
    }

    public void swim(){
        System.out.println("헤엄을 친다");
    }

    abstract void display();// 변하지 않음

    // 추가된 요구사항
    public void fly(){
        System.out.println("하늘을 난다");
    }
}
