package ru.max.task1;

public class Film {
        private String name;
        private int kasssbor;
        private int price;
        private String country;
        private int time;

        public Film (String name, int kasssbor, int price, String country, int time) {
            this.name = name;
            this.kasssbor = kasssbor;
            this.price = price;
            this.country = country;
            this.time = time;
        }
        public String getName() {
            return name;
        }
        public void setName(String Name) {
            this.name = name;
        }
        public int getKasssbor() {
            return kasssbor;
        }
        public void setKasssbor(int kasssbor) {
            this.kasssbor = kasssbor;
        }
        public int getPrice() {
            return price;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public String getCountry() {
            return country;
        }
        public void setCountry(String country) {
            this.country = country;
        }
        public int getTime() {
            return time;
        }
        public void setTime(int time) {
            this.time = time;
        }
}
