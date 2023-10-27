package org.example;

import java.util.ArrayList;
import java.util.Scanner;

// Here's a simple example of a program. A program to contain a couple people,
// and add more.
// Classes often come in two versions: Data-classes and then the classes that handle the data-classes.
// The Person-class is a data-class, it could be saved in a database as a row in a table.
// This PersonHandler could not, because it only contains the logic what to do with the Person.
public class PersonHandler {
    ArrayList<Person> personList = new ArrayList<>(); // List of Person objects. Objects rarely come alone.
    Scanner scanner = new Scanner(System.in); // Scanner to handle our input.

    public PersonHandler() {
        // The Constructor would be the right place to retrieve the data from the database.
        // Seeing how we haven't connected to a database yet, we can create some data and
        // pretend we got it from the database here.
        personList.add(new Person("Klara", 22));
        personList.add(new Person("Bob", 24));
        personList.add(new Person("Jake", 20));
    }

    // Functions are reusable, so if we find duplicate code we can put them in functions.
    // Here's a function to go through all the people and have them all introduce themselves.
    public void ListPeople() {
        for(Person person : personList) {
            person.IntroduceYourself();
        }
    }

    // To add a new, we need all the variables that the constructor requires.
    // So here we ask them for them, one at a time.
    public void AddPerson() {
        System.out.println("What's the person's name?");
        String name = scanner.nextLine();
        System.out.println("What's the person's age?");
        int age = -1;

        // So, for age, we have a requirement. It needs to be a number, and it needs to be positive.
        // Here I loop as long as age is not positive.
        while (age < 0) {
            // I put the parseInt in a try catch, because if they write something that is not a number
            // it will crash. Catch will then run instead.
            try {
                age = Integer.parseInt(scanner.nextLine());

                // But, if they write a negative value, I still won't accept it.
                if (age >= 0) {
                    personList.add(new Person(name, age));
                    System.out.println(name + " added successfully!");
                }
                else {
                    System.out.println("Age must be positive.");
                }
            } catch (Exception ex) {
                System.out.println("Age should be a number.");
            }
        }
    }

    // Menu handles player interaction. They see a list of their options and write a number for
    // which to do. A loop makes sure the program doesn't end, unless they select the option to
    // quit. Quite normal it works like this.
    public void Menu() {
        boolean running = true;
        while (running == true) {
            System.out.println("What would you like to do?");
            System.out.println("1. See all people");
            System.out.println("2. Add person");
            System.out.println("3. Remove person");
            System.out.println("4. Quit");
            String input = scanner.nextLine();

            if (input.equals("1")) {
                ListPeople();
            } else if (input.equals("2")) {
                AddPerson();
            } else if (input.equals("3")) {

            } else if (input.equals("4")) {
                running = false;
            }
        }
    }


}
