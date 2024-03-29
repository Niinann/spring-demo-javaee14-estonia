package com.sda.spriingdemojavaee14.homework.annotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // generates all getters/setters, toString(), equals(), hashCode()
@AllArgsConstructor // generates constructor for all fields in order of their declaration
@NoArgsConstructor // generates default constructor
public class Person {

    private String name;

    private String surname;

    private int age;
}
