package ru.max.task1;

public class Game {
        private String name;
        private int players;
        private int time;
        private String type;


        public Game (String name, int players, int time, String type) {
            this.name = name;
            this.players = players;
            this.time = time;
            this.type = type;
            }
        public String getName() {
            return name;
        }
        public void setName(String Name) {
            this.name = name;
        }
        public int getPlayers() {
            return players;
        }
        public void setPlayers(int players) {
            this.players = players;
        }
        public int getTime() {
            return time;
        }
        public void setTime(int time) {
            this.time = time;
        }
        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }
        }
