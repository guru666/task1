package ru.max.task1;



public class Shop {
    private String name; // задали поля (переменные экзампляров)
    private String address;
    private int otdel;
    private String prodavec;

    public Shop (String name, String address, int otdel, String prodavec) {
this.name = name;
this.address = address;
this.otdel = otdel;
this.prodavec = prodavec;
    } // задали конструктор

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getOtdel() {
        return otdel;
    }
    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }
    public String getProdavec() {
        return prodavec;
    }
    public void setProdavec(String prodavec) {
        this.prodavec = prodavec;
    }

}
