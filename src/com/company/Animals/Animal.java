package com.company.Animals;

public abstract class Animal {
    private double height;
    private int weight;
    private String location;
    private String timeOfDay;
    private String season;
    private String gender;

    public Animal(){}

    public Animal(double height, int weight, String location, String timeOfDay, String season, String gender) {
        this.height = height;
        this.weight = weight;
        this.location = location;
        this.timeOfDay = timeOfDay;
        this.season = season;
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public abstract boolean canReproduce();

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", location='" + location + '\'' +
                ", timeOfDay='" + timeOfDay + '\'' +
                ", season='" + season + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}