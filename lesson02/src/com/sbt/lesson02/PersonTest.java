package com.sbt.lesson02;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void marry() {
        Person Max = new Person(true, "Max");
        Person Olga = new Person (false, "Olga");
        Person Maria = new Person (false, "Maria");

        Assert.check(Max.marry(Olga));
        Assert.check(!Max.marry(Olga));
        Assert.check(!Olga.marry(Maria));
    }

    @Test
    void divorce() {
        Person Max = new Person(true, "Max");
        Person Olga = new Person (false, "Olga");

        Assert.check(!Max.State());
        Max.marry(Olga);
        Assert.check(Max.State());
        Assert.check(Max.divorce());
        Assert.check(!Max.divorce());
        Assert.check(!Max.State());
    }
}