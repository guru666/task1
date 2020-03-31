package ru.max.task2;

import com.sun.deploy.security.SelectableSecurityManager;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Main {
    public static void main(String[] args) {

//task2();
task3();
 //       task4();
//task5();
    }

    //задание 2
    public static void task2() {

               Shoe shoe1 = new Shoe("botinki", 40, 1500, "male", "green");
               Shoe shoe2 = new Shoe("sandalii", 50, 1800, "famale", "gray");
               Shoe shoe3 = new Shoe("kedy", 60, 1700, "male", "yellow");
        Shoe shoe4 = new Shoe("sapogi", 55, 1750, "famale", "yellow");
       Shoe shoe5 = new Shoe("unty", 46, 2000, "male", "blue");
        Shoe shoe6 = new Shoe("sabo", 44, 1800, "male", "white");
       Shoe shoe7 = new Shoe("galoshi", 43, 1600, "famale", "blue");
        Shoe shoe8 = new Shoe("bosonozhki", 44, 1850, "male", "gray");
        Shoe shoe9 = new Shoe("botinki1", 43, 1905, "male", "white");
       Shoe shoe10 = new Shoe("sandalii1", 50, 1450, "male", "red");
       Shoe shoe11 = new Shoe("kedy1", 51, 1650, "famale", "gray");
       Shoe shoe12 = new Shoe("sapogi1", 51, 1750, "male", "blue");
        Shoe shoe13 = new Shoe("unty1", 46, 1850, "male", "white");
        Shoe shoe14 = new Shoe("sabo1", 47, 1450, "famale", "green");
       Shoe shoe15 = new Shoe("galoshi1", 46, 1550, "male", "gray");
        Shoe shoe16 = new Shoe("bosonozhki1", 42, 1650, "male", "black");
        Shoe shoe17 = new Shoe("botinki2", 44, 1560, "famale", "green");
        Shoe shoe18 = new Shoe("sandalii2", 46, 1570, "male", "black");
       Shoe shoe19 = new Shoe("kedy2", 47, 1580, "male", "green");
        Shoe shoe20 = new Shoe("sapogi2", 40, 1590, "famale", "gray");
        Shoe shoe21 = new Shoe("unty2", 46, 1510, "famale", "red");
        Shoe shoe22 = new Shoe("sabo2", 45, 1520, "famale", "black");
        Shoe shoe23 = new Shoe("galoshi2", 49, 1530, "male", "green");
        Shoe shoe24 = new Shoe("bosonozhki2", 49, 1540, "male", "green");
        Shoe shoe25 = new Shoe("botinki3", 46, 1540, "male", "black");
               Shoe shoe26 = new Shoe("botinki4", 47, 1560, "male", "green");
        Shoe shoe27 = new Shoe("botinki5", 50, 1580, "famale", "gray");
       Shoe shoe28 = new Shoe("botinki6", 51, 1430, "male", "yellow");
              Shoe shoe29 = new Shoe("botinki7", 48, 1500, "male", "green");
               Shoe shoe30 = new Shoe("tufli", 45, 2100, "female", "yellow");

        // помещаем все 30 объектов в список
        ArrayList<Shoe> listofshoes = new ArrayList<>();
              listofshoes.add(shoe1);
               listofshoes.add(shoe2);
       listofshoes.add(shoe3);
       listofshoes.add(shoe4);
        listofshoes.add(shoe5);
        listofshoes.add(shoe6);
        listofshoes.add(shoe7);
        listofshoes.add(shoe8);
        listofshoes.add(shoe9);
        listofshoes.add(shoe10);
        listofshoes.add(shoe11);
        listofshoes.add(shoe12);
        listofshoes.add(shoe13);
        listofshoes.add(shoe14);
        listofshoes.add(shoe15);
        listofshoes.add(shoe16);
              listofshoes.add(shoe17);
        listofshoes.add(shoe18);
        listofshoes.add(shoe19);
               listofshoes.add(shoe20);
       listofshoes.add(shoe21);
               listofshoes.add(shoe22);
        listofshoes.add(shoe23);
       listofshoes.add(shoe24);
               listofshoes.add(shoe25);
               listofshoes.add(shoe26);
        listofshoes.add(shoe27);
       listofshoes.add(shoe28);
        listofshoes.add(shoe29);
               listofshoes.add(shoe30);


        // создание 7 пустых списков, куда будем потом класть объекты по цветам, поэтому они Shoe
               ArrayList<Shoe> greenlist = new ArrayList<Shoe>();
       ArrayList<Shoe> graylist = new ArrayList<Shoe>();
               ArrayList<Shoe> bluelist = new ArrayList<Shoe>();
               ArrayList<Shoe> redlist = new ArrayList<Shoe>();
               ArrayList<Shoe> yellowlist = new ArrayList<Shoe>();
               ArrayList<Shoe> whitelist = new ArrayList<Shoe>();
              ArrayList<Shoe> blacklist = new ArrayList<Shoe>();

        // используем цикл foreach для сортировки объектов по цветам, кладем объекты в соответствующие новосозданные списки
              for (Shoe currentShoe : listofshoes) {
                  if (currentShoe.getColor().equals("green"))
                      greenlist.add(currentShoe);

                  else if (currentShoe.getColor().equals("gray")) {
                     graylist.add(currentShoe);
                  } else if (currentShoe.getColor().equals("red")) {
                     redlist.add(currentShoe);
                  } else if (currentShoe.getColor().equals("black")) {
                      blacklist.add(currentShoe);
                   } else if (currentShoe.getColor().equals("blue")) {
                      bluelist.add(currentShoe);
                  } else if (currentShoe.getColor().equals("yellow")) {
                     yellowlist.add(currentShoe);
                  } else if (currentShoe.getColor().equals("white")) {
                     whitelist.add(currentShoe);
                  }
              }


              System.out.println(greenlist.size() + " зеленых цвета в коллекции обуви");
               System.out.println(graylist.size() + " серых цвета в коллекции обуви");
               System.out.println(yellowlist.size() + " желтых цвета в коллекции обуви");
               System.out.println(blacklist.size() + " черных цвета в коллекции обуви");
               System.out.println(bluelist.size() + " синих цвета в коллекции обуви");
               System.out.println(whitelist.size() + " белых цвета в коллекции обуви");
               System.out.println(redlist.size() + " красных цвета в коллекции обуви");
    }


    // задание 3
    public static void task3() {
        Ball ball1 = new Ball("ball1", 40, "basketball", 1500, "green");
        Ball ball2 = new Ball("ball2", 50, "gandball", 1200, "gray");
        Ball ball3 = new Ball("ball3", 60, "football", 1400, "yellow");
        Ball ball4 = new Ball("ball4", 55, "regbi", 1400, "yellow");
        Ball ball5 = new Ball("ball5", 46, "swimming", 1700, "blue");
        Ball ball6 = new Ball("ball6", 44, "polo", 1500, "white");
        Ball ball7 = new Ball("ball7", 43, "volley", 1600, "blue");
        Ball ball8 = new Ball("ball8", 44, "children", 1000, "gray");
        Ball ball9 = new Ball("ball9", 43, "vill", 1200, "white");
        Ball ball10 = new Ball("ball10", 50, "abc", 1300, "red");
        Ball ball11 = new Ball("ball11", 51, "ded", 1500, "gray");
        Ball ball12 = new Ball("ball12", 51, "retern", 1700, "blue");
        Ball ball13 = new Ball("ball13", 46, "fdas", 1800, "white");
        Ball ball14 = new Ball("ball14", 47, "gfds", 1500, "green");
        Ball ball15 = new Ball("ball15", 46, "gfdgfh", 1900, "gray");

        ArrayList<Ball> listofballs = new ArrayList<>();
        listofballs.add(ball1);
        listofballs.add(ball2);
        listofballs.add(ball3);
        listofballs.add(ball4);
        listofballs.add(ball5);
        listofballs.add(ball6);
        listofballs.add(ball7);
        listofballs.add(ball8);
        listofballs.add(ball9);
        listofballs.add(ball10);
        listofballs.add(ball11);
        listofballs.add(ball12);
        listofballs.add(ball13);
        listofballs.add(ball14);
        listofballs.add(ball15);

        ArrayList<Ball> list2 = new ArrayList<>();
        list2.add(ball1);
        list2.add(ball2);
        list2.add(ball3);

      //  listofballs.removeAll(list2);
      //  System.out.println(listofballs.size());

        int index1 = listofballs.indexOf(ball4);
        int index2 = listofballs.indexOf(ball12);
        System.out.println("index1 = " + index1);
        System.out.println("index2 = " + index2);

        int lastIndex = listofballs.lastIndexOf(ball7);
        System.out.println("lastIndex = " + lastIndex);

        boolean containsElement =
                listofballs.contains(ball3);
        System.out.println(containsElement);
        listofballs.remove(3); // по индексу
        listofballs.remove(ball6); // по элементу


        // удаление объекта, содержащего зеленый цвет через итератор
        //     Iterator<Ball> iterator = listofballs.iterator();
        //     while (iterator.hasNext()) {
        //        Ball getColor = iterator.next();
        //        if (getColor.equals("green")) {
        //            listofballs.remove(getColor);
        //            }

        // или так, есть разница?
        //   Iterator<Ball> iterator = listofballs.iterator();
        //   while (iterator.hasNext()) {
        //          if (iterator.next().equals("green")) {
        //           iterator.remove();
        //       }





        // удаление объекта, содержащего зеленый цвет методом for each
        for (Ball currentBall : listofballs) {
            if (currentBall.getColor().equals("green"))
                listofballs.remove(currentBall);
        }

        //        for (Ball currentBall : listofballs) {
        //            if (currentBall.getColor().equals("green") && currentBall.getColor().equals("gray"))
        //                listofballs.remove(currentBall);
        //                  }

// удаление объекта, содержащего зеленый цвет, а потом и серый третьим методом
        //      for (int i = 0; i < listofballs.size(); i++) {
        //        if (listofballs.get(i).equals("green"))
        //          listofballs.remove(listofballs.get(i));
        //    System.out.println(listofballs.get(i));
        //  }

        //      for (int i = 0; i < listofballs.size(); i++) {
        //          if (listofballs.get(i).equals("green") && listofballs.get(i).equals("gray"))
        //              listofballs.remove(listofballs.get(i))
        //          System.out.println(listofballs.get(i));
        //      }
    }
    public static void task4() {
        System.out.println("Пример1");
        String str = "разделить-строку-по-разделителю";
        String [] subStr;
        String delimeter = "-";
        subStr = str.split(delimeter); // разделение строки str с помощью метода split
        for (int i = 0; i < subStr.length; i++) {
            System.out.println(subStr[i]);
        }

        System.out.println("Пример2");
        str = "разделить!строку!по!разделителю";
        delimeter = "!"; //разделитель
        subStr = str.split(delimeter, 4); // разбить строку с порогом равным 3, который означает как много подстрок должно быть возвращено
        for (int i = 0; i < subStr.length; i++) {
            System.out.println(subStr[i]);
        }

        String stroka = "разбить строку на слова";
        String [] words = stroka.split("\\s"); // Разбиение строки на слова с помощью разграничителя (пробел)
        for (String subStroka:words) {
            System.out.println(subStroka);
        }

        // разбиение строки на символы в массив
        String stroka1 = "Progland";
        char[] stroka1toArray = stroka1.toCharArray(); // преобразуем строку stroka1 в массив символов char
        for (int i = 0; i < stroka1toArray.length; i++) {
            System.out.println(stroka1toArray[i] + " ");
        }



    }
    public static void task5() {
        Person tom = new Person("Tom");
        Person bob = new Person("Bob");
        Person tom2 = new Person("Tom");
  //      System.out.println(tom.toString());
  //      System.out.println(tom.hashCode());
        System.out.println(tom.equals(bob));
        System.out.println(tom.equals(tom2));
    }
}