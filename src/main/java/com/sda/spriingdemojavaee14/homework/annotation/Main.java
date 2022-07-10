package com.sda.spriingdemojavaee14.homework.annotation;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        PersonWithAllSourceCode me = new PersonWithAllSourceCode();
        me.setName("Niina");
        me.setSurname("Ka");
        me.setAge(42);

        System.out.println("me:" + me.toString());

        PersonWithAllSourceCode anotherMe = new PersonWithAllSourceCode("Niina","Ka", 42);
        System.out.println("anotherMe:" + anotherMe);

        System.out.println("are those two references refer to the same object?:" + (me == anotherMe));
        System.out.println("si this the same person?" + me.equals(anotherMe));

        System.out.println("are equals:" + me.equals("haha"));

        Person meAgain = new Person("Niina", "Ka", 42);
        //builder is better that all args constructor, because you can see more. Avoiding errors.
        Person meAgainWithBuilder = Person.builder()
                .age(42)
                .surname("Ka")
                .name("Niina")
                .build();
        // set doesnot save duplicates
        Set<PersonWithAllSourceCode> uniquePersons = new HashSet<>();
        uniquePersons.add(me);
        uniquePersons.add(anotherMe); //me will be replaced by anotherMe
        System.out.println("set size, after adding two equals:" + uniquePersons.size());


    }
}
