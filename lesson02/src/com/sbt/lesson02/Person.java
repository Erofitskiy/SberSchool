package com.sbt.lesson02;

public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    boolean State(){
        if (spouse != null){
            System.out.println(name + " в браке с " + spouse.name);
            return true;
        }
        else{
            System.out.println(name + " не состоит в браке");
            return false;
        }
    }

    public boolean marry(Person person) {
        if(spouse != null){
            if(spouse == person)
                System.out.println(name + " и " + spouse.name + " уже женаты");
            else
                System.out.println(name + " уже состоит в браке с " + spouse.name);
            return false;
        }

        if(person != null){
            if(person.man != man){
                System.out.println(name + " и " + person.name + " поженились");
                spouse = person;
                return true;
            }
            else{
                System.out.println(name + " и " + person.name + " пожениться не смогут: \nОднополый брак запрещён законодательством");
                return false;
            }
        }
        return false;
    }

    public boolean divorce() {
        if(spouse == null){
            System.out.println("Не с кем разводиться");
            return false;
        }
        System.out.println(name + " и " + spouse.name + " расторгли брак");
        spouse.spouse = null;
        spouse = null;
        return true;
    }
}
