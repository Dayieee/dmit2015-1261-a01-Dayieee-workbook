package dmit2015.model;

public class java {
    private String name;
    private double price;

    public java(String name, double price) {
        if (name  == null || name.isBlank()) {

            throw new IllegalArgumentException("Name is Required");
        }
        if(price <0 || price == 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
