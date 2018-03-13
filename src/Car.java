public class Car {

    private String brand;
    private String model;
    private int yearOfRelease;
    private String color;
    private double price;
    private String registratioNumber;

    public Car(String brand, String model, int yearOfRelease, String color, double price, String registratioNumber) {
        this.brand = brand;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.color = color;
        this.price = price;
        this.registratioNumber = registratioNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegistratioNumber() {
        return registratioNumber;
    }

    public void setRegistratioNumber(String registratioNumber) {
        this.registratioNumber = registratioNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearOfRelease != car.yearOfRelease) return false;
        if (Double.compare(car.price, price) != 0) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (color != null ? !color.equals(car.color) : car.color != null) return false;
        return registratioNumber != null ? registratioNumber.equals(car.registratioNumber) : car.registratioNumber == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + yearOfRelease;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (registratioNumber != null ? registratioNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + yearOfRelease + ", color: " + price + ", price: " + price;
    }
}
