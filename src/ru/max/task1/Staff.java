package ru.max.task1;



public class Staff {
    private String name; // задали поля (переменные экзампляров)
    private int razryad;
    private int inn;
    private int stazh;
    private int salary;

    public Staff (String name, int razryad, int inn, int stazh, int salary) {
this.name = name;
this.razryad = razryad;
this.inn = inn;
this.stazh = stazh;
this.salary = salary;
    } // задали конструктор

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRazryad() {
        return razryad;
    }
    public void setRazryad(int razryad) {
        this.razryad = razryad;
    }
    public int getInn() {
        return inn;
    }
    public void setInn(int inn) {
        this.inn = inn;
    }
    public int getStazh() { return stazh;}
    public void setStazh(int stazh) {this.stazh = stazh;}
    public int getSalary() {return salary;}
    public void setSalary(int salary) {this.salary = salary;}

}
