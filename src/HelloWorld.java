public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print("Hello ");
        System.out.print("World!");
        System.out.println();

//        1.Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to
//        the console.
        int myFavoriteNumber = 19;
        System.out.println(myFavoriteNumber);

//        2. Create a String variable named myString and assign a string value to it, then print the variable out to
//        the console.
        String myString = "Hi";
        System.out.println(myString);

//        3. Change your code to assign a character value to myString. What do you notice?
//        myString = 'c'; did not compile code java: incompatible types: char cannot be converted to java.lang.String
        //myString = (char) myString; //did not compile code java: incompatible types: char cannot be converted to java
        // .lang.String

//         4. Change your code to assign the value 3.14159 to myString. What happens?
//        myString = 3.14159; did not compile java: incompatible types: double cannot be converted to java.lang.String
        myString = String.valueOf(3.14159);
        System.out.println(myString);

//        5. Declare a long variable named myNumber, but do not assign anything to it. Next try to print out
//        myNumber to the console. What happens?
        long myNumber;
//        System.out.println(myNumber); //did not compile java: variable myNumber might not have been initialized

//        6. Change your code to assign the value 3.14 to myNumber. What do you notice?
//         myNumber = 3.14;
//         System.out.println(myNumber);//java: incompatible types: possible lossy conversion from double to long.

//        7.Change your code to assign the value 123L (Note the 'L' at the end) to myNumber
        myNumber  = 123L;
        System.out.println(myNumber);

//         8. Change your code to assign the value 123 to myNumber.Why does assigning the value 3.14 to a variable
//         declared as a long not compile, but assigning an integer value does?
        myNumber  = 123; //Because 3.14 is a decimal and should use primitive double or float. The 123 in works
        System.out.println(myNumber);
         //Because a value of lesser precision to a type of greater precision can be assigned.

        //9.Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two
        // ways we could fix this?
//        myNumber = (float) 3.14F; //wil not compile
        myNumber = (long) 3.14F; //can't assign float to 3.14 because it has to many numbers after the decimal. To
        // make it work you
        System.out.println(myNumber);

       // 10. Copy and paste the following code blocks one at a time and execute them
        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int v = 5;
        System.out.println(++x);
        System.out.println(x);
//        Difference is when x is incremented.

       // 11. Try to create a variable named class. What happens?
//       String class = "Trying to use a constant as a variable"; //This will not work because it is a reserved
        // word/keyword.
        String classes = "Trying to use a constant as a variable";
        System.out.println(classes);

        //12. Object is the most generic type in Java. You can assign any value to a variable of type Object. What do
        // you think will happen when the following code is run?
        String theNumberThree = "three";
        Object o = theNumberThree; //This will compile and print three.
//        int three =Integer.parseInt (o);
        System.out.println(theNumberThree);
//         System.out.println(three);
        System.out.println(theNumberThree + "\n" + o); //class java.lang.String cannot be cast to
         //class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader
        // 'bootstrap')
      //  at HelloWorld.main

       // 13. Rewrite the following expressions using the relevant shorthand assignment operators:
      x = 4;
      x = x + 5;
      x += 5;
        System.out.println(x);

        x = 3;
        int y = 4;
        y = y * x;
        y *= x;
        System.out.println(y);

        x = 10;
        y = 2;
        x = x / y;
        y = y - x;
        x /= y;
        y -= x;
        System.out.println(y);

     //  14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type
//        can hold?
//        What happens if you increment a numeric variable past the type's capacity?
//
//        When you assign a value to a numerical variable that is larger than the type can hold, or if you increment a numeric variable past the type's capacity, you will encounter overflow or underflow, depending on the situation.
//
//        How many bytes of memory are allocated to store a variable of this data type

        //int = 4 bytes
    }
}