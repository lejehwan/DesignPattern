package factoryMethodPattern;

import factoryPattern.User;

public abstract class Factory {

    public final User create(String name, int job){
        return this.createUser(name, job);
    }

    public abstract User createUser(String name, int job);
}
