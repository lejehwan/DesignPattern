package factoryPattern;

public class Factory {

    // 팩토리 패턴은 생성 할 객체를 선택할 수 있는 조건 로직이 필수 이며, 외부의 매개변수 값을 받아서 처리함.
    public User create(String name, int job){
        switch (job){
            case 1: return new Mafia(name);
            case 2: return new Police(name);
            case 3: return new Citizen(name);
            default: return null;
        }
    }
}
