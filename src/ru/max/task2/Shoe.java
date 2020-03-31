package ru.max.task2;

//задали 5-7 полей, в том числе поле Цвет
public class Shoe {
    private String name;
    private int height;
    private int price;
    private String sex;
    private String color;

    // создали конструктор, содержащий все поля
    public Shoe (String name, int height, int price, String sex, String color) {
        this.name = name;
        this.height = height;
        this.price = price;
        this.sex = sex;
        this.color = color;
    }
   //создаем геттеры и сеттеры на все поля

    public String getName() {
        return name;
    }
    public void setName(String name) {
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
    public String getSex() {
        return sex;
    }
    public void setSex(String Sex) {
        this.sex = sex;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
