package factoryPattern;


public abstract class User {

    public String name;
    public String skill;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getSkill(){
        return this.skill;
    }
}
