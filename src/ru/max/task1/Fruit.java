package ru.max.task1;

public class Fruit {

    private String name;
    private int height;
    private int price;
    private String country;
    private int srokhr;

    public Fruit (String name, int height, int price, String country, int srokhr) {
        this.name = name;
        this.height = height;
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
     public int getHeight() {
        return height;
     }
     public void setHeight(int height) {
        this.height = height;
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
