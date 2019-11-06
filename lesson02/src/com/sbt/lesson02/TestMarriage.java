package com.sbt.lesson02;

public class TestMarriage {

    public static void main(String[] args) {

        Person Max = new Person(true, "Max");

        Person Olga = new Person (false, "Olga");
        Person Maria = new Person (false, "Maria");

        Max.State();
        Max.marry(Olga);
        Max.marry(Olga);
        Max.State();
        Max.divorce();
        Max.State();

        Olga.marry(Maria);
    }
}
