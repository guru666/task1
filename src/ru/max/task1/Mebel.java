package ru.max.task1;

public class Mebel {
    private String name;
    private int height;
    private int price;
    private String material;


    public Mebel (String name, int height, int price, String material) {
        this.name = name;
        this.height = height;
        this.price = price;
        this.material = material;
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
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    }
