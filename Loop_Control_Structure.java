// Tpoic:- Loop Control Structure
// -----

// Loop Control Structure:- In Java, loop control structures are used to execute a 
// ----------------------   block of code repeatedly until a specific condition is
//                          met. The main types of loops provided are the for, 
//                          while, and do-while loops, along with the enhanced 
//                          for-each loop.

// Types of Loop:-
// -------------

// 1. While Loop
// 2. For Loop
// 3. Do While Loop

// ================================================================================

// 1. While Loop:-
//    ----------

// Syntax of While Loop:-
// --------------------

// intialize loop counter;
// while (condition) 
// {
//     Body of the Loop;
//     increment/decrement loop counter;
// }

// ================================================================================

// Q:-1. Write a program to print 1 to 10 numbers.

/*
public class Loop_Control_Structure {

     public static void main(String[] args) {
          int i = 1;
          while(i<=10)
          {
               System.out.println(i);
               i = i + 1;
          }
     }
}
*/

// ================================================================================

// Q:-2. Write a program to print 1 to 10 numbers in reverse order.

/*
public class Loop_Control_Structure {

     public static void main(String [] args){
          int i = 10;
          System.out.print("\nNumbers: ");

          while(i > 0)
          {
               System.out.print(i + " | ");
               i = i - 1;
          }
     }

}
*/

// ================================================================================

// Q:-3. Write a program to print Even numbers.

/*
public class Loop_Control_Structure {

     public static void main(String[] args) {
          int i = 2;
          System.out.print("\nEven Numbers: ");
          
          while(i <= 20)
          {
               System.out.print(i + " | ");
               i = i + 2;
          }
     }
}
*/

// ================================================================================

// Q:-4. Write a  program to print Odd numbers.

/*
public class Loop_Control_Structure {

     public static void main(String[] args) {
          int i = 3;

          System.out.print("\nOdd Numbers: ");

          while(i <= 30)
          {
               System.out.print(i  + " | ");
               i = i + 3;
          }
     }
}
*/

// ================================================================================

// 2. For Loop:-
//    --------

// Syntax of For Loop:-
// ------------------

// initialize loop counter;
// for(initialization ; condition ; increment/decrement)
// {
//      Body of the loop;
// }

// ================================================================================

// Q:-1. Write a program to print 1 to 10 numbers.

/*
public class Loop_Control_Structure {

     public static void main(String[] args) {
          int i;
          System.out.print("\nNumbers: ");
          for(i=1 ; i <=10 ; i++)
          {
               System.out.print(i + " | ");
          }

     }
}
*/

// ================================================================================

// Q:-2. Write a program to print sum of 1 to 10 numbers.

/*
public class Loop_Control_Structure {

     public static void main(String[] args) {
          int i;
          int sum = 0;
          System.out.print("\nNumbers: ");
          
          for(i=1 ; i<=10 ; i++)
          {
               System.out.print(i + " | ");
               sum = sum + i;
          }
          System.out.print("\nSum of Numbers: " + sum);
                
     }
}
*/

// ================================================================================

// Q:-3. Write a program to print sum of 1 to n numbers.

/*
import java.util.Scanner;

public class Loop_Control_Structure {

     public static void main(String[] args) {
          int i, sum = 0, n;

          Scanner obj = new Scanner(System.in);

          System.out.print("\nEnter Number for N: ");
          n = obj.nextInt();

          System.out.print("\nNumbers: ");

          for(i=1 ; i<=n ; i++)
          {
               System.out.print(i + " | ");
               sum = sum + i;
          }
          System.out.print("\nSum of Numbers: " + sum);
     }
}
*/

// ================================================================================

// 3. Do While Loop:-
//    -------------

// initialize loop counter;
// do 
// {
//      Body of Loop;
//      increment/decrement;
// } while(condition);

// ================================================================================

// Q:-1. Write a program to print 1 to 10 numbers.

/*
public class Loop_Control_Structure {

     public static void main(String[] args) {
          int i = 1;

          System.out.print("\nNumbers: ");
          do
          {
               System.out.print(i + " | ");
               i = i + 1;
          }while(i <= 10);
     }
}
*/

// ================================================================================


