package com.example.datastructureproject;

/*
This Class is created for keeping information of employees
 */
public class Person {
    private String name;
    private String surname;
    private int position;
    private int score ;
    private int bonus ;

    public Person(){
    }

    public Person(String name, String surname, int position, int score) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPosition(){return position;}

    public void setPosition(int position){this.position = position;}

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    //printing informations of person
    @Override
    public String toString() {
        return name +" "+surname+" "+position+" - "+score+"---->"+bonus;
    }
}


