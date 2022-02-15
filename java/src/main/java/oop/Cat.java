package oop;

public class Cat extends Pet{
    public Cat(boolean hasTail, String name, String color, int age, Breed breed, Address address) { //method overloading
        super(hasTail, name, color, age, breed, address);
    }
    public Cat(){
        super(false, "", "", 1, new Breed(""), null);//method overloading
    }

    @Override
    public void sounds() {
        System.out.println(super.getName() + " is meows...");
    }
}
