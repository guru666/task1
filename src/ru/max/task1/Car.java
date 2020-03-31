package ru.max.task1;



public class Car {
    private String name; // задали поля (переменные экзампляров)
    private int height;
    private int weight;
    private String color;
    private int lenght;

    public Car (String name, int height, int weight, String color, int lenght) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.lenght = lenght;
    } // задали конструктор

    public Car() {
    }

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
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getLenght() { return lenght; }
    public void setLenght(int lenght) {this.lenght = lenght;}



}
