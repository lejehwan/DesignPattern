package abstractFactoryPattern;

import factoryPattern.Police;
import factoryPattern.User;

public class PoliceFactory extends Factory{

    @Override
    public User createUser(String name) {
        return new Police(name);
    }
}
