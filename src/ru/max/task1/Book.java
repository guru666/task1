package ru.max.task1;

public class Book {
    private String name;
    private int year;
    private int price;
    private String country;
    private String author;

    public Book (String name, int year, int price, String country, String author) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.country = country;
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public void setName(String Name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
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
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
