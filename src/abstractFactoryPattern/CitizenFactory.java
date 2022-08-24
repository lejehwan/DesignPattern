package abstractFactoryPattern;

import factoryPattern.Citizen;
import factoryPattern.User;

public class CitizenFactory extends Factory{

    @Override
    public User createUser(String name) {
        return new Citizen(name);
    }
}
