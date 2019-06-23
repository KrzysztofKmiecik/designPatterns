package pl.sdacademy.designpatterns.builder.zad6Domowe;

import lombok.Builder;
import lombok.ToString;

//Stwórz klasę Person składającą się z 3 pól: name(String), surname(String), age(int)
@Builder
@ToString
public class Person {
    private String name;
    private String surname;
    private int age;
}
