package factoryMethodPattern;

import factoryPattern.User;

public class FactoryMethodPattern {

    /**
     *
     * 상위 클래스의 구현을 하위 클래스로 위임하여
     * 강력한 결합 에서 느슨한 결합으로 결합도를 낮춰줌
     */
    public static void main(String[] args) {

        Factory factory = new FactoryUser();

        // 기존 팩토리 클래스를 추상 클래스로 적용하여
        // 해당 클래스를 상속 받는 하위 클래스가 객체 생성
        User user1 = factory.create("Person1", 1);
        User user2 = factory.create("Person2", 2);
        User user3 = factory.create("Person3", 3);
        User user4 = factory.create("Person4", 3);

        System.out.println("이름 = " + user1.getName() + ", 스킬 = " + user1.getSkill());
        System.out.println("이름 = " + user2.getName() + ", 스킬 = " + user2.getSkill());
        System.out.println("이름 = " + user3.getName() + ", 스킬 = " + user3.getSkill());
        System.out.println("이름 = " + user4.getName() + ", 스킬 = " + user4.getSkill());

        // 팩토리 메서드 패턴은 하위 클래스 내 매개변수를 통해 생성을 선택적으로 처리하지만
        // 새로운 객체가 추가된다면, 조건이 추가되어야 하고 확장 시 하위 클래스의 덩치가 커지므로 유지보수가 어려울 수 있다.
    }
}
