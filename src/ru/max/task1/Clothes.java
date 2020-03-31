package ru.max.task1;

public class Clothes {
    private String name;
    private int size;
    private int price;
    private String country;
    private String tkan;

    public Clothes (String name, int size, int price, String country, String tkan) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.country = country;
        this.tkan = tkan;
    }
    public String getName() {
        return name;
    }
    public void setName(String Name) {
        this.name = name;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getTkan() {
        return tkan;
    }
    public void setTkan(String tkan) {
        this.tkan = tkan;
    }
}
