package animal;

public class Mammal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        }else {
            System.out.println("");
        }
    }

    public Mammal(String name) {
        setName(name);
    }
    protected void eat(String food){
        System.out.println(name + " eats " + food);
    }
}
