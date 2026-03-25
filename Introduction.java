// Topic:- Introduction to Java Programming
// -----

// To Create a basic Hellow World Program:-
/*
public class Introduction{
     public static void main(String[] args) {
          System.out.println("Hellow World!");
     }
}
*/     

// ================================================================================

// Q:-1. Write a program to take input of integer and float numbers.
/*
import java.util.Scanner;

public class Introduction{
     public static void main(String[] args) {
          int a;
          float b;

          Scanner obj1 = new Scanner(System.in);

          // Input Instructions:-

          System.out.print("Enter Integer Number: ");
          a = obj1.nextInt();

          System.out.print("\nEnter Float Number: ");
          b = obj1.nextFloat();
          
          // Output Instructions:-

          System.out.println("Value of Integer Number: "+a);
          System.out.println("Value of Float Number: "+b);
      }
}
*/

// ================================================================================

// Q:-2. Write a program to take input of string and character.
/*
import java.util.Scanner;

public class Introduction{
     public static void main(String[] args){
          String City_Name;
          char ch;

          Scanner obj1 = new Scanner(System.in);

          System.out.print("Enter the City Name: ");
          City_Name = obj1.nextLine();

          System.out.print("\nEnter a Character: ");
          ch = obj1.next().charAt(0);

          System.out.println("\nName of the City is: "+City_Name);
          System.out.println("Character is: "+ch);
     }
}
*/
