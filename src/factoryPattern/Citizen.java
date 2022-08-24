package factoryPattern;

public class Citizen extends User{

    public Citizen(String name) {
        super(name);
        setSkill();
    }

    public void setSkill(){
        this.skill = "투표를 행사할 수 있음";
    }
}
