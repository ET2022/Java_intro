package oop;

public class Test {
    public static void main(String[] args) {
        Cat british = new Cat(); //default constructor
        Address catAddress = new Address();
        british.setAge(1);
        british.setBreed(new Breed("British"));
        british.setHasTail(true);
        british.setName("Tom");
        british.setColor("gray");
        catAddress.setCity("Sofia");
        catAddress.setPostalCode(1000);
        catAddress.setStreetName("Solunska");
        british.setAddress(catAddress);
        british.printData();

        Cat manx = new Cat(false, "Felix","black and white", 5, new Breed("Manx"), catAddress); //constructor with parameters
        manx.printData();

        Cat exotic = new Cat(true, "Garfild", "orange", 3, new Breed("Exotic"), catAddress); //constructor with parameters
        exotic.printData();

        british.move();
        exotic.sounds();
        manx.eats();

        Address hamsterAddress = new Address();
        hamsterAddress.setStreetName("some street");
        hamsterAddress.setCity("some city");
        hamsterAddress.setPostalCode(12345);
        Hamster mini = new Hamster(true, "Max", "orange", 3, new Breed("Mini"), hamsterAddress);
        mini.printData();
        mini.eats();
        mini.sounds();
    }
}
