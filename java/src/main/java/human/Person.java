package human;

import animal.Mammal;

public class Person extends Mammal {
    public Person(String name) {
        super(name);
    }
    @Override
    protected void eat(String food){
        super.eat(food);
    }
}
