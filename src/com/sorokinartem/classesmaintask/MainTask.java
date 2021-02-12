package com.sorokinartem.classesmaintask;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;
        /*Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
        Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти данные на консоль.
        В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
        Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
        Создать массив объектов. Вывести:
        a) список автомобилей заданной марки;
        b) список автомобилей заданной модели, которые эксплуатируются больше n лет;
        c) список автомобилей заданного года выпуска, цена которых больше указанной.*/
public class MainTask {

    public static void main(String[] args) {
        CarShop autoTrade = new CarShop("AutoTrade");
        autoTrade.addCarToShopList(new Car("Mazda", "CX30", 2016, Color.GREEN, 25_000, "7AB 1374"));
        autoTrade.addCarToShopList(new Car("Honda", "Civic", 2014, Color.BLACK, 10_000, "7AB 1674"));
        autoTrade.addCarToShopList(new Car("Toyota", "Camry", 2010, Color.WHITE, 11_000, "7AB 1874"));
        autoTrade.addCarToShopList(new Car("Opel", "Astra", 2016, Color.RED, 12_000, "7AB 1394"));
        autoTrade.addCarToShopList(new Car("Mazda", "Millenia", 2001, Color.GRAY, 3_000, "7AB 1894"));
        autoTrade.addCarToShopList(new Car("Mercedes", "Vito", 2006, Color.BLUE, 13_000, "7AB 1999"));
        autoTrade.addCarToShopList(new Car("Volkswagen", "Polo", 2019, Color.WHITE, 14_000, "7AB 7374"));
        autoTrade.addCarToShopList(new Car("Honda", "Fit", 2006, Color.DARK_GRAY, 4_500, "7AB 0374"));
        autoTrade.addCarToShopList(new Car("SEAT", "Toledo", 2016, Color.LIGHT_GRAY, 9_000, "7AB 6784"));
        autoTrade.addCarToShopList(new Car("Honda", "Accord", 2004, Color.GREEN, 5_500, "7AB 1374"));
        autoTrade.addCarToShopList(new Car("Nissan","Juke",2013,Color.YELLOW,10_000,"7AB 2222"));

        System.out.println("\nsort by brand:");
        List<Car> listSortByBrand = autoTrade.getListByBrand("Mazda");
        for (Car c : listSortByBrand) {
            System.out.println(c);
        }

        System.out.println("\nsort by brand and Car age:");
        List<Car> BrandAndCarAge = autoTrade.getListByBrandAndCarAge("Honda",13);
        for (Car c : BrandAndCarAge) {
            System.out.println(c);
        }

        System.out.println("\nprint cars by Car Age and price:");
        List<Car> listByYearAndPrice = autoTrade.getListByYearAndPrice(2016,5_000);
        for (Car c : listByYearAndPrice) {
            System.out.println(c);
        }

    }
}

class CarShop {
    private String shopName;
    private ArrayList<Car> carList = new ArrayList<>();

    CarShop(String shopName) {
        this.shopName = shopName;
    }

    void addCarToShopList(Car car) {
        carList.add(car);
    }

    List<Car> getListByBrand(String brand) {
        List<Car> sortedlist = new ArrayList<>();
        for (Car c: carList){
            if(c.getBrand().equals(brand)){
                sortedlist.add(c);
            }
        }
        return sortedlist;
    }

    List<Car> getListByBrandAndCarAge(String brand, int age) {
        List<Car> sortedlist = new ArrayList<>();
        for (Car c : carList) {
            if ((2021-c.getYearOfIssue() > age)&&(c.getBrand().equals(brand))) {
                sortedlist.add(c);
            }
        }
        return sortedlist;
    }

    List<Car> getListByYearAndPrice(int year, int price) {
        List<Car> sortedlist = new ArrayList<>();
        for (Car c : carList) {
            if ((c.getPrice() >= price)&&(c.getYearOfIssue()==year)) {
                sortedlist.add(c);
            }
        }

        return sortedlist;
    }

}

class Car {
    {
        idGenerator++;
    }

    private static int idGenerator = 0;
    private int id = idGenerator;
    private String brand;
    private String model;
    private int yearOfIssue;
    private Color color;
    private int price;
    private String registrationNumber;

    Car(String brand, String model, int yearOfIssue, Color color, int price, String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String toString() {
        return String.format("ID: "+ id +", Brand: " + brand + ", Model: "+ model +", Year of Issue: "+ yearOfIssue +", Color: "+ color + ", Price: " + price +", Registration number: "+ registrationNumber);
    }

}

