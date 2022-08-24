package abstractFactoryPattern;

import factoryPattern.User;

public class AbstractFactoryPattern {

    /**
     *
     * 생성해야 될 각각의 객체마다 하위 클래스를 생성하여
     * 원하는 하위 클래스를 결합하도록 함.
     */
    public static void main(String[] args) {

        // 각각의 하위 클래스를 통해 목적에 맞는 객체를 생성할 수 있음
        Factory factory = new MafiaFactory();
        User user1 = factory.create("Person1");

        factory = new PoliceFactory();
        User user2 = factory.create("Person2");

        factory = new CitizenFactory();
        User user3 = factory.create("Person3");
        User user4 = factory.create("Person4");

        System.out.println("이름 = " + user1.getName() + ", 스킬 = " + user1.getSkill());
        System.out.println("이름 = " + user2.getName() + ", 스킬 = " + user2.getSkill());
        System.out.println("이름 = " + user3.getName() + ", 스킬 = " + user3.getSkill());
        System.out.println("이름 = " + user4.getName() + ", 스킬 = " + user4.getSkill());

        // 추상 팩토리 패턴은 동일한 처리 로직의 하위 클래스의 결합을 통해 선택적으로 객체를 생성 할 수 있지만
        // 새로운 객체가 추가되면 하위 클래스도 같이 추가해야 하고 확장 시에 모든 하위클래스의 수정이 필요할 수 있다.
    }
}
