package week_3.week_3_project.model;

import week_3.week_3_project.enums.Gender;

// define a person class to encapsulate common attributes
abstract public class Person {
    private String name;
    private int age;

    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }
}
