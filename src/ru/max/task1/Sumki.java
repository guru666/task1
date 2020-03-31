package ru.max.task1;

public class Sumki {
    private String name;
    private int height;
    private int price;
    private String country;
    private String sex;

    public Sumki (String name, int height, int price, String country, String sex) {
        this.name = name;
        this.height = height;
        this.price = price;
        this.country = country;
        this.sex = sex;
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
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
}
