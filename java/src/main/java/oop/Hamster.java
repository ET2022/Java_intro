package oop;

public class Hamster extends Pet {
    public Hamster(boolean hasTail, String name, String color, int age, Breed breed, Address address) {
        super(hasTail, name, color, age, breed, address);
    }

    @Override
    public void eats() {
        System.out.println(super.getName() + " is omnivorous...");
    }
}
