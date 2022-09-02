package strategyPatternBefore;

public class StrategyPatternBefore {
    public static void main(String[] args) {

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();// 나는 고무오리
        rubberDuck.fly();// 하늘을 난다
        rubberDuck.quack();// 삑삑 운다
        rubberDuck.swim();// 헤엄을 친다

        // 1번 문제점
        // 만약 rubberDuck은 하늘을 날 수 없으면 RubberDuck class에 fly()메서드를 오버라이딩 해줘야 한다.
        // 또한 날지도 못하고 헤엄도 칠 수 없는 새로운 class가 추가된다면 관련 메서드를 또 오버라이딩 해줘야하는 불편이 생긴다.


        // 그렇다면 인터페이스를 통해서 이 문제를 해결해보자 -> NotDuck 생성
        NotDuck notDuck = new NotDuck();
        notDuck.fly();
        notDuck.swim();

        // 2번 문제점
        // 인터페이스로 각각의 오리들을 오버라이딩 해줄수 있게 되었지만, 100개 이상의 오리 클래스가 있다고 가정 했을 때,
        // 헤엄 못침 -> 헤엄 침 으로 수정하려면 100개 이상의 오리클래스를 다 수정해줘야 한다.

        // 이제 strategyPattern으로 가보자
    }
}
