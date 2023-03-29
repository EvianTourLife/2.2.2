package web.model;

public class Car {

    private String brand;
    private int releaseDate;
    private int owners;

    public Car(String brand, int releaseDate, int owners) {
        this.brand = brand;
        this.releaseDate = releaseDate;
        this.owners = owners;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getOwners() {
        return owners;
    }

    public void setOwners(int owners) {
        this.owners = owners;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", releaseDate=" + releaseDate +
                ", owners=" + owners +
                '}';
    }
}
