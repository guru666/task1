package ru.max.task1;




public class President {
    private String name; // задали поля (переменные экзампляров)
    private int srok;
    private int age;
    private String pred;

    public President (String name, int srok, int age, String pred) {
this.name = name;
this.srok = srok;
this.age = age;
this.pred = pred;
    } // задали конструктор


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSrok() {
        return srok;
    }
    public void setSrok(int srok) {
        this.srok = srok;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
public String getPred(String pred) {
        return pred;
}
public void setPred(String pred) {
        this.pred = pred;
}
}
