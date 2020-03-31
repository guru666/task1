package ru.max.task1;

public class Beer {
    private String name;
    private int gradus;
    private int price;
    private String country;
    private int srokhr;

    public Beer (String name, int gradus, int price, String country, int srokhr) {
        this.name = name;
        this.gradus = gradus;
        this.price = price;
        this.country = country;
        this.srokhr = srokhr;
    }
    public String getName() {
        return name;
    }
    public void setName(String Name) {
        this.name = name;
    }
    public int getGradus() {
        return gradus;
    }
    public void setGradus(int gradus) {
        this.gradus = gradus;
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
    public int getSrokhr() {
        return srokhr;
    }
    public void setSrokhr(int srokhr) {
        this.srokhr = srokhr;
    }
}
