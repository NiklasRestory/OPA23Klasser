package org.example;

public class Calculator {
    // The below is a function which takes two ints as parameters,
    // and then returns a value.
    // Before the name of the function (Add) I write what variable-type the function returns.
    // In the function, I then define what I return with the keyword return.
    // I write return followed with what variable/value to return.
    // The variable-type must match the type the function claims to return. Returning an int in this case.
    public int Add(int num1, int num2) {
        int result = num1 + num2;
        return result;
        // return num1 + num2; // would also have worked.
    }

    // I can, of course, also return Strings, or any other variable type, including objects and/or lists/arrays.
    public String ReturnsFour() {
        return "Four";
    }
}
