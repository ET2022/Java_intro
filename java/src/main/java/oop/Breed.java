package oop;

public class Breed {
    private String breedName;

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        if (!breedName.equals(null)){
            this.breedName = breedName;
        }else {
            System.out.println("Invalid data!");
        }
    }

    public Breed(String breedName) {
        setBreedName(breedName);
    }
}
