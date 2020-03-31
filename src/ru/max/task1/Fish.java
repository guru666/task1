package ru.max.task1;



public class Fish {
    private String name; // задали поля (переменные экзампляров)
    private String vid;
    private int weight;
    private String color;

    public Fish (String name, String vid, int weight, String color) {
this.name = name;
this.vid = vid;
this.weight = weight;
this.color = color;
    } // задали конструктор

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVid() {
        return vid;
    }
    public void setVid(String vid) {
        this.vid = vid;
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

}
