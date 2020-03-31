package ru.max.task1;

public class Copybook {
        private String name;
        private int pages;
        private int price;
        private String type;
        private int kolvo;

        public Copybook (String name, int pages, int price, String type, int kolvo) {
            this.name = name;
            this.pages = pages;
            this.price = price;
            this.type = type;
            this.kolvo = kolvo;
        }
        public String getName() {
            return name;
        }
        public void setName(String Name) {
            this.name = name;
        }
        public int getPages() {
            return pages;
        }
        public void setPages(int pages) {
            this.pages = pages;
        }
        public int getPrice() {
            return price;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }
        public int getKolvo() {
            return kolvo;
        }
        public void setKolvo(int kolvo) {
            this.kolvo = kolvo;
        }
}
