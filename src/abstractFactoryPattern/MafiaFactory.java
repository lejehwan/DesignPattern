package abstractFactoryPattern;

import factoryPattern.Mafia;
import factoryPattern.User;

public class MafiaFactory extends Factory{

    @Override
    public User createUser(String name) {
        return new Mafia(name);
    }
}
