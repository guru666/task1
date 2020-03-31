package ru.max.task1;

public class Language {
    private String name;
    private int letters;
    private int timetolearn;
    private String country;
    private String teacher;

    public Language (String name, int letters, int timetolearn, String country, String teacher) {
        this.name = name;
        this.letters = letters;
        this.timetolearn = timetolearn;
        this.country = country;
        this.teacher = teacher;
    }
    public String getName() {
        return name;
    }
    public void setName(String Name) {
        this.name = name;
    }
    public int getLetters() {
        return letters;
    }
    public void setLetters(int letters) {
        this.letters = letters;
    }
    public int getTimetolearn() {
        return timetolearn;
    }
    public void setTimetolearn(int timetolearn) {
        this.timetolearn = timetolearn;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getTeacher() {
        return teacher;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
