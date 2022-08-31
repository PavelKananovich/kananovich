package com.homework3.objects;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private long ID;
    private String gender;
    private String randomString;


    public Student() {
    }

    public Student(String name, long ID, String gender, String randomString) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.randomString = randomString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRandomString() {
        return randomString;
    }

    public void setRandomString(String randomString) {
        this.randomString = randomString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ID == student.ID && name.equals(student.name) && gender.equals(student.gender) && randomString.equals(student.randomString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ID, gender, randomString);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender='" + gender + '\'' +
                ", randomString='" + randomString + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}
