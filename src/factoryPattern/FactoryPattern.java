package factoryPattern;

public class FactoryPattern {
    /**
     *
     * 팩토리 패턴 : 생성 패턴 중 가장 기본이 되는 패턴이며, 클래스의 객체 생성을 동적으로 처리함.
     */

    public static void main(String[] args) {
        /**
         * FactoryPattern 적용 전
         */
//        User user1 = new Mafia("Person1");
//        User user2 = new Police("Person2");
//        User user3 = new Citizen("Person3");
//        User user4 = new Citizen("Person4");
//
//        System.out.println("이름 = " + user1.getName() + ", 스킬 = " + user1.getSkill());
//        System.out.println("이름 = " + user2.getName() + ", 스킬 = " + user2.getSkill());
//        System.out.println("이름 = " + user3.getName() + ", 스킬 = " + user3.getSkill());
//        System.out.println("이름 = " + user4.getName() + ", 스킬 = " + user4.getSkill());

        // 위와 같은 방법 사용 시에 클래스 이름 등이 변경되면 이름을 통해 생성된 코드를 모두 직접 찾아 수정해야 한다는 문제가 생김.
        // 위 처럼 강력한 객체의 결합 코드는 유연한 코드 확장을 방해하고 변경과 수정을 어렵게 만듬.

        /**
         * FactoryPattern 적용 후
         */
        Factory factory = new Factory();
        // 객체 생성을 동적으로 처리함으로 코드의 유지보수성이 향상됨.
        User user1 = factory.create("Person1", 1);
        User user2 = factory.create("Person2", 2);
        User user3 = factory.create("Person3", 3);
        User user4 = factory.create("Person4", 3);

        System.out.println("이름 = " + user1.getName() + ", 스킬 = " + user1.getSkill());
        System.out.println("이름 = " + user2.getName() + ", 스킬 = " + user2.getSkill());
        System.out.println("이름 = " + user3.getName() + ", 스킬 = " + user3.getSkill());
        System.out.println("이름 = " + user4.getName() + ", 스킬 = " + user4.getSkill());

        // 팩토리 패턴 적용 후 클래스의 객체 생성을 동적으로 처리하게 돼었음.
        // 하지만 여전히 강력한 결합을 유지하고 있다.(Factory 내에서 new 를 통해 객체를 생성함)
        // ->
        // choice 1) FactoryMethodPattern
        // choice 2) AbstractFactoryPattern
    }
}
