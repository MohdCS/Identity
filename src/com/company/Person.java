package com.company;

public class Person {
    private String name, nationality, date_of_birth;
    private int age;

    public Person(String name, String nationality, String date_of_birth, int age) {
        this.name = name;
        this.nationality = nationality;
        this.date_of_birth = date_of_birth;
        this.age = age;
    }

    public String toString() {
        return "Host Name: " + name + '\n' +
                "Nationality: " + nationality + '\n' +
                "Date of Birth: " + date_of_birth + '\n' +
                "Age: " + age;
    }
}
