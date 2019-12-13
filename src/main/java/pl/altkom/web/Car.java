package pl.altkom.web;

public class Car {
    private String brand;
    private String carModel;
    private int year;
    private int mileage;

    public Car(String brand, String carModel, int year, int mileage) {
        this.brand = brand;
        this.carModel = carModel;
        this.year = year;
        this.mileage = mileage;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
