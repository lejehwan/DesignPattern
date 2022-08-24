package abstractFactoryPattern;

public class Mafia extends User {

    public Mafia(String name) {
        super(name);
        setSkill();
    }

    public void setSkill(){
        this.skill = "시민을 죽일 수 있음";
    }
}
