package ru.max.task1;


public class Country {
    private String name;
    private String money; // задали поля (переменные экзампляров)
    private int square;
    private int population;
    private String capital;
    private String stroy;

    public Country (String name, String money, int square, int population, String capital, String stroy) {
        this.name = name;
this.money = money;
this.square = square;
this.population = population;
this.capital = capital;
this.stroy = stroy;
    } // задали конструктор

    public String getName() {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getMoney() {
        return money;
    }
    public void setMoney (String money) {
        this.money = money;
    }
    public int getSquare() {
        return square;
    }
    public void setSquare(int square) {
        this.square = square;
    }
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }
    public String getStroy() {
        return stroy;
    }
    public void setStroy (String stroy) {
        this.stroy = stroy;
    }

}
