package factoryMethodPattern;

import factoryPattern.Citizen;
import factoryPattern.Mafia;
import factoryPattern.Police;
import factoryPattern.User;

public class FactoryUser extends Factory{

    @Override
    public User createUser(String name, int job) {
        switch (job){
            case 1: return new Mafia(name);
            case 2: return new Police(name);
            case 3: return new Citizen(name);
            default: return null;
        }
    }
}
