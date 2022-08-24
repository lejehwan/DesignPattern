package factoryPattern;

public class Police extends User{

    public Police(String name) {
        super(name);
        setSkill();
    }

    public void setSkill(){
        this.skill = "마피아를 찾을 수 있음";
    }
}
