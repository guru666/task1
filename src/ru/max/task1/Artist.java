package ru.max.task1;

public class Artist {
        private String name;
        private int roli;
        private int age;
        private String country;
        private int gonorar;

        public Artist (String name, int roli, int age, String country, int gonorar) {
            this.name = name;
            this.roli = roli;
            this.age = age;
            this.country = country;
            this.gonorar = gonorar;
        }
        public String getName() {
            return name;
        }
        public void setName(String Name) {
            this.name = name;
        }
        public int getRoli() {
            return roli;
        }
        public void setRoli(int roli) {
            this.roli = roli;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getCountry() {
            return country;
        }
        public void setCountry(String country) {
            this.country = country;
        }
        public int getGonorar() {
            return gonorar;
        }
        public void setGonorar(int gonorar) {
            this.gonorar = gonorar;
        }
}
