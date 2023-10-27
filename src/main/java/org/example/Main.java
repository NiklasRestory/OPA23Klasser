package org.example;

public class Main {
    public static void main(String[] args) {
        int variable = 5;
        Person p1 = new Person(); // This calls the constructor of a class, creating a new object.
        p1.name = "Lovisa"; // We can use an object's variables by writing their name followed by a dot, then the name of the variable.
        System.out.println("Person's name is " + p1.name); // We can use the variables in the same way.
        // p1.age = 3; // We cannot use private variables, only public ones.

        // We can create multiple objects from the same class.
        Person p2 = new Person();
        p2.name = "Jim";
        System.out.println("p1 is " + p1.name +
                " but p2's name is " + p2.name);
        // As the above shows, different objects of the same class
        // can contain different values in the available variables.

        // To call a function, write the object, then a dot, then the
        // name of the function followed by a parenthesis. The parenthesis
        // should contain the values to fill the parameters with, if any.
        p1.IntroduceYourself();
        p2.IntroduceYourself();

        Calculator calculator = new Calculator();
        // If a function returns a value, we can put that into variables
        // or use in other ways. Here, the Add function takes two parameters,
        // 2 will fill num1 and 6 will fill num2. The result, what is returned,
        // is then saved into the value variable.
        int value = calculator.Add(2, 6);
        System.out.println("2 + 6 is " + value);

        // ReturnFour returns the string Four.
        System.out.println("ReturnsFour gives us " + calculator.ReturnsFour());
        // What's returned from functions can be used as if it was a variable.
        value = (calculator.Add(5, 8) + 2) * calculator.Add(-4, -1);
        System.out.println("That value is " + value);

        Person p3 = new Person("Klara", 22);
        p3.IntroduceYourself();

        PersonHandler personHandler = new PersonHandler();
        personHandler.Menu();
    }
}