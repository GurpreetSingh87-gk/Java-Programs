// Topic:- If Else
// -----

// Decision Control Structure:- In Java, decision control statements (or 
// --------------------------   conditional statements) allow a program to execute 
//                              specific blocks of code based on whether a given
//                              condition evaluates to true or false.


// Syntax:- if(condition)
//          {
//               True Block Statement;
//          }
//          else
//          {
//               Flase Block Statement;
//          }

// ================================================================================

// Q:-1. Write a program to input 2 numbers and find maximum number.
/*
import java.util.Scanner;

public class Decision_Control_Structure {
 {
     public static void main(String[] args){
          int x, y;

          Scanner obj1 = new Scanner(System.in);

          System.out.print("Enter First Number: ");
          x = obj1.nextInt();

          System.out.print("Enter Second Number: ");
          y = obj1.nextInt();

          if(x>y)
          {
               System.out.println("\nFirst Number is Maximum");
          }
          else
          {
               System.out.println("\nSecond Number is Maximum");
          }    
     }    
}
*/

// ================================================================================

// Q:-2. Write a program to input a number and check whether it is Even number or 
//       Odd number.

/*
//import java.util.Scanner;

public class Decision_Control_Structure {

     public static void main(String[] args){
          int n = 15;

          if(n % 2 == 0)
          {
               System.out.println(n + " Number is Even");
          }
          else if(n % 3 == 0)
          {
               System.out.println(n + " Number is Odd");   
          }
          else
          {
               System.out.println("Invalid Number!");
          }
     }
}
*/

// ================================================================================

// Q:-3. Input marks of 5 subjects. Calculate average marks and display result pass
//       if average is greater than 33 otherwise fail.

/*
import java.util.Scanner;

public class Decision_Control_Structure {

     public static void main(String[] args) {
          int English, Maths, Science, Hindi, Geography, total_marks;
          float average_marks;

          Scanner obj1 = new Scanner(System.in);

          System.out.print("\nEnter Marks of English: ");
          English = obj1.nextInt();

          System.out.print("\nEnter Marks of Maths: ");
          Maths = obj1.nextInt();
          
          System.out.print("\nEnter Marks of Science: ");
          Science= obj1.nextInt();
          
          System.out.print("\nEnter Marks of Hindi: ");
          Hindi = obj1.nextInt();
          
          System.out.print("\nEnter Marks of Geography: ");
          Geography = obj1.nextInt();

          total_marks = English + Maths + Science + Hindi + Geography;
          average_marks = total_marks/5.0f;

          System.out.println("\nTotal Marks: " + total_marks);
          System.out.println("Average Marks: " + average_marks);

          if(average_marks>33)
          {
               System.out.println("\nResult: Pass");
          }
          else
          {
               System.out.println("\nResult: Fail");
          }
     }
}
*/     

// ================================================================================

// Q:-4. Find maximum number between 3 numbers.
/*
public class Decision_Control_Structure {

     public static void main(String[] args) {
          int a = 19;
          int b = 18;
          int c = 16;

          if(a > b && a > c)
          {
               System.out.println("A is Maximum");
          }
          else if(b > a && b > c)
          {
               System.out.println("B is Maximum");
          }
          else
          {
               System.out.println("C is Maximum");
          }
     }
}
*/     

// ================================================================================

// Q:-5. Write a program using else if ladder to add or subtract two numbers as per
//       the options selected by user.

/*
import java.util.Scanner;

public class Decision_Control_Structure {

     public static void main(String[] args) {
          int First, Second, option, z;

          Scanner obj = new Scanner(System.in);

          System.out.print("\nEnter First Number: ");
          First = obj.nextInt();

          System.out.print("Enter Second Number: ");
          Second = obj.nextInt();

          System.out.print("\nSelect Any Options in {1 and 2}:  ");
          option = obj.nextInt();

          if(option == 1)
          {
               z = First + Second;
               System.out.println("\nAddition: "+ z);
          }
          else if(option == 2)
          {
               z = First - Second;
               System.out.print("\nSubtraction: "+ z);
          }
          else
          {
               System.out.print("\nInvalid Choice!");
          }
     }
}
*/

// ================================================================================

// Topic:- Switch Case
// -----

// Switch Case:- The switch statement in Java is a multi-way decision statement 
// -----------   that executes different blocks of code based on the value of an 
//               expression. It provides a cleaner and more readable alternative 
//               to long if-else-if ladders.

// expression:- It can be int, char, string, byte, short.
// ----------

// case value:- The value must be constant or a literal of the same type as the 
// ----------   expression.

// break:- The break used to terminate the switch block.
// -----

// default:- The optional block executes if none of the cases match expression's
// -------   value.

// Syntax:- switch(expression)
//          {
//                case value1:
//                     statement;

//                     break;

//                case value2:
//                     statement;

//                     break;

//                default:
//                     statement;
//          }

// ================================================================================

// Q:-1. Write a program to calculate weekday name. Input weekday numbers.

/*
import java.util.Scanner;

public class Decision_Control_Structure {

     public static void main(String[] args) {
          int day = 5;

          Scanner obj = new Scanner(System.in);

          System.out.print("Enter Day Number: ");
          day = obj.nextInt();

          switch(day)
          {
               case 1:
                    System.out.println("\nMonday");
                    break;
               
               case 2:
                    System.out.println("\nTuesday");
                    break;
               
               case 3:
                    System.out.println("\nWednesday");
                    break;
               
               case 4:
                    System.out.println("\nThursday");
                    break;
               
               case 5:
                    System.out.println("\nFriday");
                    break;
               
               case 6:
                    System.out.println("\nSaturday"); 
                    break;
               
               case 7:
                    System.out.println("\nSunday");
                    break;     
               
               default:
                    System.out.println("Invalid Choice! Try Again");     
          }
     }
}
*/     

// ================================================================================

// Q:-2. Input two numbers and create a menu-driven program to add, subtract and 
//       multiply.

/*
import java.util.Scanner;

public class Decision_Control_Structure {

     public static void main(String[] args) {
          int firstNumber, secondName, choice, x;

          Scanner obj = new Scanner(System.in);

          System.out.print("Enter First Number: ");
          firstNumber = obj.nextInt();

          System.out.print("Enter Second Number: ");
          secondName = obj.nextInt();

          System.out.print("\nEnter Choice from {1/2/3}: ");
          choice = obj.nextInt();

          switch(choice)
          {
               case 1:
                    x = firstNumber + secondName;
                    System.out.println("\nAddition: " + x);
                    break;
               
               case 2:
                    x = firstNumber - secondName;
                    System.out.println("\nSubtraction: " + x);     
                    break;
               
               case 3:
                    x = firstNumber * secondName;
                    System.out.println("\nMultiplication: " + x);     
                    break;

               default:
                    System.out.println("\nInvalid Choice! Try Again");     
          }
     }
}
*/   

// ================================================================================

// Q:-3. Input an alphabet RGB and display its color names.

/*
import java.util.Scanner;

public class Decision_Control_Structure {

     public static void main(String[] args) {
          char choice;

          Scanner obj = new Scanner(System.in);

          System.out.print("Enter any Alphabet in {R/G/B}: ");
          choice = obj.next().charAt(0);

          switch (choice) {
               case 'R':
                    System.out.println("\nRed");
                    break;

               case 'G':
                    System.out.println("\nGreen");
                    break;
                 
               case 'B':
                    System.out.println("\nBlue");
                    break;     
               
               default:
                    System.out.println("Invalid Choice! Try Again");
                    break;
          }
     }
}
*/     