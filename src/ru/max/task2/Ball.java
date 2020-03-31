package ru.max.task2;

import java.util.ArrayList;

public class Ball {
    private String name;
    private int radius;
    private String kindofgame;
    private int price;
    private String color;

    public Ball (String name, int radius, String kindofgame, int price, String color){
        this.name = name;
        this.radius = radius;
        this.kindofgame = kindofgame;
        this.price = price;
        this.color = color;
    }

    public String getName()
    {
        return name;
    }
    public void setName (String name)
    {
        this.name = name;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius (int radius) {
        this.radius = radius;
    }
    public String getKindofgame () {
        return kindofgame;
    }
    public void setKindofgame(String kindofgame) {
        this.kindofgame = kindofgame;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }



}
