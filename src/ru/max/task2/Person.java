package ru.max.task2;

public class Person {
    private String name;

    public Person (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    @Override
    // Метод toString часто переопределяют
   // public String toString() {
    //    return "Person " + name;


    // переопределение метода hashCode
//    public int hashCode() {
  //      return 10 * name.hashCode() + 20456;

    // переопределение метода equals
    //Метод equals принимает в качестве параметрa объект любого типа, который мы затем приводим к текущему, если они являются объектами одного класса.
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false; // Оператор instanceof позволяет выяснить, является ли переданный в качестве параметра объект объектом определенного класса, в данном случае класса Person. Так как если объекты принадлежат к разным классам, то их сравнение не имеет смысла, и возвращается значение false.
        Person p = (Person)obj;
        return this.name.equals(p.name);
    }
}
