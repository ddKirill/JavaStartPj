package com.company.carmanager;

public abstract class Car implements Serviceable {

    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    private int distance = 0;
    protected int distanceOnService = 0;

    public Car(String name, int yearOfProduction, int price, int weight,Color color) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;

    }


    public void addDistance (int additinalDistance){
        distance += additinalDistance;
        distanceOnService += additinalDistance;
    }

    public void addDistance (double additinalDistance){
        distance += additinalDistance;
        distanceOnService += additinalDistance;
    }



    public int getDistanceOnService() {
        return distanceOnService;
    }

    public void setDistanceOnService(int distanceOnService) {
        this.distanceOnService = distanceOnService;
    }

    public int getDistance() {
        return distance;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", distance=" + distance +
                ", distanceOnService=" + distanceOnService +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearOfProduction != car.yearOfProduction) return false;
        if (price != car.price) return false;
        if (weight != car.weight) return false;
        if (!name.equals(car.name)) return false;
        return color == car.color;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + yearOfProduction;
        result = 31 * result + price;
        result = 31 * result + weight;
        result = 31 * result + color.hashCode();
        return result;
    }
}
