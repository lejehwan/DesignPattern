package strategyPattern;

public class StrategyPattern {
    public static void main(String[] args) {
        Character character = new Character();
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Gun());
        character.attack();
    }
}
