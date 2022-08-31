package com.homework3.objects;

import java.util.List;
import java.util.Objects;

public class User {
    private long Id;
    private String name;
    private String surname;
    private List<User> friends;

    public User() {
    }

    public User(long id, String name, String surname, List<User> friends) {
        Id = id;
        this.name = name;
        this.surname = surname;
        this.friends = friends;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
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

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Id == user.Id && name.equals(user.name) && surname.equals(user.surname) && friends.equals(user.friends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, surname, friends);
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", friends=" + friends +
                '}';
    }
}
