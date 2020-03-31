package ru.max.task1;



public class Animal {
    private String name; // задали поля (переменные экзампляров)
    private int height;
    private int weight;
    private String vid;

    public Animal (String name, int height, int weight, String vid) {
this.name = name;
this.height = height;
this.weight = weight;
this.vid = vid;
    } // задали конструктор

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight (int height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getVid() {
        return vid;
    }
    public void setVid(String vid) {
        this.vid = vid;
    }

}
