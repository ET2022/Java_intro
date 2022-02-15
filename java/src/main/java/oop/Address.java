package oop;

public class Address {
    private String city;
    private String streetName;
    private int postalCode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (!city.equals(null)){
            this.city = city;
        }else{
            System.out.println("Invalid data!");
        }
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        if (!streetName.equals(null)){
            this.streetName = streetName;
        }else{
            System.out.println("Invalid data!");
        }
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        if (postalCode>=1000) {
            this.postalCode = postalCode;
        }else {
            System.out.println("Invalid data!");
        }
    }
}
