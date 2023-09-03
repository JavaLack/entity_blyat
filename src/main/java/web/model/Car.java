package web.model;

public class Car {
    private int series;
    private String carName;
    private int price;

    public Car(int series, String carName, int price) {
        this.series = series;
        this.carName = carName;
        this.price = price;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", carName='" + carName + '\'' +
                ", price=" + price +
                '}';
    }
}
