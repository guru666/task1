package ru.max.task1;

public class Tree {
    private String name;
    private int kolvo;
    private String place;
    private String rod;
    private String prim;

    public Tree (String name, int kolvo, String place, String rod, String prim) {
        this.name = name;
        this.kolvo = kolvo;
        this.place = place;
        this.rod = rod;
        this.prim = prim;
    }
    public String getName() {
        return name;
    }
    public void setName(String Name) {
        this.name = name;
    }
    public int getKolvo() {
        return kolvo;
    }
    public void setKolvo(int kolvo) {
        this.kolvo = kolvo;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getRod() {
        return rod;
    }
    public void setRod(String rod) {
        this.rod = rod;
    }
    public String getPrim() {
        return prim;
    }
    public void setPrim(String prim) {
        this.prim = prim;
    }
}
