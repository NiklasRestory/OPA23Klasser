package org.example;

// Creating a class looks like this. This is the class Person.
// I do belive a class will always be public.
// The contents of the {} after Person then defines what's inside the class.
public class Person {

    // Here, outside functions, I can declare the variables that will be the
    // attributes of the objects made of this class. They need to be marked as
    // public, private or protected.
    public String name; // I can create them without a given value,
    private int age = 0; // or I can have a default value for them.

    public Person() {} // Default constructor. If we make no constructors, this exists automatically.
    // However, if we want a default constructor but ALSO have a different constructor,
    // we'll have to write it.

    // A constructor is the function that creates the object. It does more than we can see,
    // like allocating memory for the object and then giving the memory-address where it is saved.
    // A constructor is run only when the object is made, never after. It is typically used to
    // put values into the various variables that an object will contain.
    // For instance, Person has name and age. Hence, the constructor takes name and age as parameters.
    public Person(String name, int age) {
        // If the parameters and attributes have the same variable-names,
        // then we need to write "this." in front to specify we mean the attributes.
        // Otherwise, it will assume we mean the parameters.
        this.name = name;
        this.age = age;

        System.out.println("Person constructor is run!");
    }

    // Functions in classes are then used when we want to use the attributes of the object.
    // Private variables and functions can only be used by functions in the same class.
    public void IntroduceYourself() {
        System.out.println("Hi! I'm " + name +
                " and I am " + age + " years old.");
    }
}
