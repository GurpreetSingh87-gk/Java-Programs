// Topic:- Array
// ------

// Array:- An array is a collection of elements of the same data type stored in 
// -----   contiguous memory locations. It allows multiple values to be stored
//         under a single name and accessed using an index number.

// Syntax:- 
// ------

// datatype [] array_name;

// example :- int [] numbers;
//            String [] cars;

// ================================================================================

// Q:-1. Create an array of 5 elements store the data and display it.

/*
public class Array {

     public static void main(String[] args) {
          int[] arr = {1,2,3,4,5};

          System.out.print("\nArray Elements: ");

          for(int i=0 ; i <arr.length ; i++)
          {
               System.out.print(arr[i] + " ");
          }
          // Accessing 4 element:-
          System.out.print("\nAccessing Fourth Element: " + arr[3]);

          // Accessing 1 element:-
          System.out.print("\nAccesssing First Element: " + arr[0]);
     }
}
*/

// ================================================================================

// Operations on Array:-

// 1. Access Array Elements (Indexing).
// 2. Update Array Elements.
// 3. Traverse Array
// 4. Size of Array

// ================================================================================

// 1. Access Array Elements:- Elements of an array can be accessed by their 
//    ---------------------   position, called the index. In Java, array indexing
//                            starts from 0 (not 1). To access an element, provide 
//                            the index inside square brackets [] along with the 
//                            array name.

/* 
public class Array {

     public static void main(String[] args){
          int[] arr = {1,2,3,4,5};

          System.out.println("\nAccessing Elements Two: " + arr[1]);
     }
}
*/

// ================================================================================

// 2. Update Array Elements:- To update an element at a specific index in an array,
//    ---------------------   use the assignment operator = while accessing the 
//                            array element and assign a new value.

/*
public class Array {

     public static void main(String[] args) {
          int[] arr = {1,2,3,4,5};

          // Creating a new element:-
          arr[2] = 90;

          System.out.println("\nUpdating Element: " + arr[2]);

     }
}
 */

// ================================================================================

// 3. Traverse Array:- Traversing an array means accessing each element one by one.
//    --------------   In Java, arrays can be easily traversed using a loop.

/*
public class Array {

     public static void main(String[] args) {
          int[] arr = {1,2,3,4,5};

          System.out.print("\nTraversing Elements: ");
          for(int i=0 ; i<arr.length ; i++)
          {
               System.out.print(arr[i] + "  ");
          }
     }
}
*/

// ================================================================================
 
// 4. Size of Array:- The size of an array refers to the number of elements it can 
//    -------------   hold. To find the size of array java provides a built-in 
//                    property called length.

/*
public class Array {

     public static void main(String[] args) {
          int[] arr = {1,2,3,4,5};

          System.out.print("\nSize of Array: " + arr.length);
     }
}
*/

// ================================================================================

// Initialize an Array at the time of Declaration:-
// ----------------------------------------------

// Q:-1. Create an array of 5 integer numbers initialize it at declaration and 
//       display even numbers.

/*
public class Array {

     public static void main(String[] args) {
          int[] numbers = {12, 7, 8, 21, 30};

          System.out.print("\nEven Numbers: ");
          for(int num : numbers)
          {
               if(num % 2 ==0)
               {
                    System.out.print(num + " ");
               }
          }
     }
}
*/

// ================================================================================

// Q:-2. Input array of 5 elements and display sum of all array elements.

/*
import java.util.Scanner;

public class Array {

     public static void main(String[] args){
          
          Scanner obj = new Scanner(System.in);

          int[] numbers = new int[5];
          int sum = 0;

          System.out.print("\nEnter 5 Elements: ");

          for(int i=0 ; i<5 ; i++)
          {
               numbers[i] = obj.nextInt();
               sum += numbers[i];
          }

          System.out.println("\nSum of Array Elements: " +sum);       
     }
}
*/