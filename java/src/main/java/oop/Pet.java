package oop;

public class Pet implements PetActions {
    private boolean hasTail;
    private String name;
    private String color;
    private int age;
    private Breed breed; //Composition
    private Address address; //Aggregation

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.equals(null)) {
            this.color = color;
        }else {
            System.out.println("Invalid data!");
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals(null)) {
            this.name = name;
        }else {
            System.out.println("Invalid data!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if  (!(age<1)) {
            this.age = age;
        } else {
            System.out.println("Invalid data!");
        }
    }

    public Breed getBreed() {
        return breed;
    }

    public Pet(boolean hasTail, String name, String color, int age, Breed breed, Address address) {
        setHasTail(hasTail);
        setName(name);
        setColor(color);
        setAge(age);
        setBreed(breed);
        setAddress(address);
    }

    public void setBreed(Breed breed) {
        if (!breed.equals(null)){
            this.breed = breed;
        }else{
            System.out.println("Invalid data!");
        }
    }

    public void printData(){
        System.out.printf("This pet`s name is: %s.%nThis pet`s color: %s.%nThis pet`s age: %d.%nThis pet`s breed is: %s.%n" +
                "This pet`s address is: %d %s %s.%n", name, color, age, breed.getBreedName(), address.getPostalCode(), address.getCity(), address.getStreetName());
        if (hasTail){
            System.out.println("This pet has tail.");
        }else {
            System.out.println("this pet does not have tail.");
        }
    }

    @Override //method override
    public void move() {
        System.out.println(name + " is running...");
    }

    @Override
    public void sounds() {
        System.out.println(name + " is squeaks...");
    }

    @Override
    public void eats() {
        System.out.println(name + " is predator...");
    }
}
