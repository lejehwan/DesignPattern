package strategyPattern;

public class Character {

    Weapon weapon;

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){
        if (weapon == null) System.out.println("맨 손 공격");
        else weapon.attack();
    }
}