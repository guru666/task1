package ru.max.task1;

public class Music {
        private String name;
        private String composer;
        private int time;
        private String country;
        private int year;

        public Music (String name, String composer, int time, String country, int year) {
            this.name = name;
            this.composer = composer;
            this.time = time;
            this.country = country;
            this.year = year;
        }
        public String getName() {
            return name;
        }
        public void setName(String Name) {
            this.name = name;
        }
        public String getComposer() {
            return composer;
        }
        public void setComposer(String composer) {
            this.composer = composer;
        }
        public int getTime() {
            return time;
        }
        public void setTime(int time) {
            this.time = time;
        }
        public String getCountry() {
            return country;
        }
        public void setCountry(String country) {
            this.country = country;
        }
        public int getYear() {
            return year;
        }
        public void setYear(int year) {
            this.year = year;
        }
}
