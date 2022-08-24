package abstractFactoryPattern;

import factoryPattern.User;

public abstract class Factory {

    public final User create(String name){
        return this.createUser(name);
    }

    public abstract User createUser(String name);
}
