package nl.novi.javaprogrammeren.one;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    String getName() {   //same package
        return this.name;
    }

}
