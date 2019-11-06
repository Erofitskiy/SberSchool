package com.sbt.lesson2;

public class Person extends ClientImpl {
    private String firstName;
    private String lastName;

    @Override
    public String getFullName() {
        return firstName + " " + lastName;
    }

}
