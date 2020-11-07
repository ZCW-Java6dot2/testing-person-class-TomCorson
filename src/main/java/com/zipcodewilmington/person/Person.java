package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String favFood;
    private boolean hasPet;
    private int amountOfJobs;
    private int amountOfVehicles;
    private String hobbie;




    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }
    public boolean getHasPet() {
        return hasPet;
    }

    public void setHasPet(boolean hasPet) {
        this.hasPet = hasPet;
    }
    public int getAmountOfJobs() {
        return amountOfJobs;
    }

    public void setAmountOfJobs(int amountOfJobs) {
        this.amountOfJobs = amountOfJobs;
    }
    public int getAmountOfVehicles() {
        return amountOfVehicles;
    }

    public void setAmountOfVehicles(int amountOfVehicles) {
        this.amountOfVehicles = amountOfVehicles;
    }
    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }
}
