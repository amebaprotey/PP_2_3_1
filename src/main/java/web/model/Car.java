package web.model;

public class Car {

    String brand;
    int weight;
    String color;

    public Car(String brand, int weight, String color) {
        this.brand = brand;
        this.weight = weight;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
