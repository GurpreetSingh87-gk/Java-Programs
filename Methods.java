// Topic:- Functions (Methods)
// -----

// Function:- In Java, functions are formally called 'methods'. They are blocks of
// --------   code that perform a specific task and only run when they are called.

// Syntax:-
// ------

// Access_modifier static return_type function_name(parameters);

// example:- public static void getData();

// ================================================================================

// Types of Methods:-
// ----------------

// 1. User-define methods.
// 2. Pre-define methods.

// 1. User-define methods:- The method written by the user or programmer is known 
//    -------------------   as a user-defined method. These methods are modified 
//                          according to the requirement.

// example:- getData(), Info(), helloWorld()

// 2. Pre-defined Method:- Predefined methods are the method that is already 
//    ------------------   defined in the Java class libraries. It is also known 
//                         as the standard library method or built-in method. 

// example:- Math.random(), Math.PI()

// ================================================================================

// Function Calling Methods in User-define method:-
// ----------------------------------------------

// 1. Methods with no arguments and no return value: These methods simply execute a 
//    ---------------------------------------------  block of code. They are 
//                                                   declared with the void keyword
//                                                   and empty parentheses.

// public static void getData()
// {
//
// }

// ================================================================================

// 2. Methods with arguments and no return value: These methods take input to 
//    ------------------------------------------- perform an action but do not 
//                                                return a result to the caller.

// public static void getData(int a, int b)
// {
//      
// }

// ================================================================================

// 3. Methods with no arguments and a return value: These methods do not take input 
//    --------------------------------------------  but compute or fetch a value 
//                                                  that is sent back to the caller.

// public static int getData()
// {
//    return();
// }

// ================================================================================

// 4. Methods with arguments and a return value: These are the most common methods,
//    ------------------------------------------ taking input and returning a 
//                                               calculated result.

// public static int getData(int a, int b)
// {
//    return();
// }
 
// ================================================================================

// Q:-1. Define a method which takes two numbers as input and display its addition.

/*
import java.util.Scanner;

public class Methods {

     public static void getData()
     {
          int a;
          float b, c;

          Scanner obj = new Scanner(System.in);
          
          System.out.print("\nEnter Integer Number: ");
          a = obj.nextInt();

          System.out.print("\nEnter Float Number: ");
          b = obj.nextFloat();

          c = a + b;
          
          System.out.print("\nAddition: " + c);
     }
     public static void main(String[] args) 
     {
          getData();
     }
}
*/

// ================================================================================

// User-define function with arguments:- These methods take input to perform an 
// -----------------------------------   action and run when they are called.

// Q:-1. Define a method which accepts two numbers and gives its addition.

/*
public class Methods {

     public static void Add(int a, int b)
     {
          int c;
          c = a + b;
          System.out.println("Addition: " + c);
     }
     public static void main(String[] args) 
     {
          int x = 10, y = 20;
          Add(x,y); 
     }
}
*/

// ================================================================================

// Sataic and Non-Static Methods:- Within the class, if we define the method with 
// ------------------------------  static keyword then it will not required object 
//                                 of the class to call. The method without static 
//                                 keyword can be called only with the help of object.

// Syntax to define an object:-
// --------------------------

// object_name = new class_name();

// ================================================================================

// Q:-1. Define a none-static method and display addtion of two numbers.

/*
public class Methods {

     void Add(int a, int b)
     {
          int c;

          c = a + b;
          System.out.println("\nAddition: " + c);
     }
     public static void main(String[] args) 
     {
          int x = 10, y = 20;

          Methods obj = new Methods();
          obj.Add(x, y);
     }
}
*/

// ================================================================================

// User-define function with return value:- These methods returns value.
// --------------------------------------

/*
// Q:-1. Define a function which return addition of 2 numbers.

public class Methods {

     public static int Add(int a, int b)
     {
          int c;

          c = a + b;
          return(c);
     }
     public static void main(String[] args) {
          int x = 10, y = 20, z;

          z = Add(x, y);
          System.out.println("Addition: " + z);
     }
}
*/

// ================================================================================

// Q:-2. Write a program to take input marks and name of the student and display 
//       it.

/*
import java.util.Scanner;

public class Methods {
     private int Roll_No;
     private String Name;

     public void getData()
     {
          Scanner obj = new Scanner(System.in);

          System.out.print("\nEnter Roll No: ");
          Roll_No = obj.nextInt();

          System.out.print("\nEnter Name: ");
          Name = obj.next();
     }
     public void showData()
     {
          System.out.print("\nRoll No: " + Roll_No);
          System.out.print("\nName: " + Name);
     }
     public static void main(String[] args) {
          Methods m1 = new Methods();

          m1.getData();
          m1.showData();
     }
}
*/

// ================================================================================

// User-define function with arguments:-
// -----------------------------------

/*
// Q:-3. Do the above program with arguments.

import java.util.Scanner;

public class Methods {
     private int Roll_No;
     private String Name;

     public void getData(int r, String n)
     {
          Roll_No = r;
          Name = n;
     }
     public void showData()
     {
          System.out.print("\nRoll No: " + Roll_No);
          System.out.print("\nName: " + Name);
     }
     public static void main(String[] args) {
          Methods m1 = new Methods();

          m1.getData(55, "James Willson");
          m1.showData();

          Methods m2 = new Methods();

          m2.getData(45, "Jason Holder");
          m2.showData();
     }
}
*/

