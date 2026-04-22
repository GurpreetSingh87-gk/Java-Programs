// Topic:- Operators
// -----

// Operators:- In Java, operators are special symbols that perform operations on 
// ----------  variables or values. These operators are essential in programming 
//             as they allow you to manipulate data efficiently.

// Types of Operators:-
// ------------------

// 1. Arithmetic Opeerator
// 2. Relational Operator
// 3. Logical Operator
// 4. Bitwise Operators

// ================================================================================

// 1. Arithmetic Opeerator:- Arithmetic Operators are used to perform simple 
//    --------------------   arithmetic operations on primitive and non-primitive 
//                           data types.

/*
public class Operators {

     public static void main(String[] args) {
          int A = 10, B = 5;

          // Addition

          int sum = A + B;

          // Subtraction

          int sub = A - B;

          // Multiplication

          int mul = A * B;

          // Division

          int div = A / B;

          // Modulus

          int mod = A % B;

          System.out.print("\nAddition: " + sum);

          System.out.print("\nSubtraction: " + sub);

          System.out.print("\nMultiplication: " + mul);

          System.out.print("\nDivision: " + div);

          System.out.print("\nModulus: " + mod);
     }
}
*/

// ================================================================================

// 2. Relational Operator:- Relational Operators also called comparison operator)
//    -------------------   are used to check for relations like equality, greater 
//                          than, and less than. They return boolean results after 
//                          the comparison and are extensively used in looping 
//                          statements as well as conditional if-else statements.

/*
public class Operators {

     public static void main(String[] args) {
          int a = 10;
          int b = 5;

          System.out.print("\nGreater Than: " + (a > b));

          System.out.print("\nLess Than: " + (a < b));

          System.out.print("\nGreater Than Equal: " + (a >= b));
          
          System.out.print("\nLess Than Equal: " + (a <= b));

          System.out.print("\nEqual To: " + (a == b));

          System.out.print("\nNot Equal To: " + (a != b));
     }
}
*/

// ================================================================================

// 3. Logical Operator:- Logical operators are used to perform operations on boolean
//    ----------------   values. They return true or false when at least one 
//                       condition is true or false.

// AND (&&):- Returns True only if both conditions are True otherwise False.

// OR (||):- Returns True if at least one condition is True otherwise False.

// NOT (!=):- It reverse the boolean value from True to False.

// ================================================================================

/*
public class Operators {

     public static void main(String[] args) {
          int a = 10;
          int b = 20;

          // And 

          System.out.println("\nWhen both conditions are True: " +(b > a && a < b));

          System.out.println("\nWhen one conditions is False: " +(a > b && a < b));

          // Or

          System.out.println("\nWhen one condition is True: " + (a > b || a < b));

          System.out.println("\nWhen both conditions are False: " + (a > b || b < a));

          // Not 

          System.out.println("\nReverse the Condition to True to False: " + (a != b));
     }
}
*/

// ================================================================================

// 4. Bitwise Operators:- In Java, bitwise operators are used to perform operations
//    ------------------  directly on the binary representation (individual bits) 
//                        of integer values. Instead of operating on the whole 
//                        decimal number, these operators manipulate data bit-by-bit 
//                        (0s and 1s).

/*
public class Operators {

    public static void main(String[] args)
    {
        // Bitwise operators
        int d = 0b1010;
        int e = 0b1100;
      
        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));
        System.out.println("d ^ e : " + (d ^ e));
        System.out.println("~d : " + (~d));
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e >> 1 : " + (e >> 1));
        System.out.println("e >>> 1 : " + (e >>> 1));
    }
}
*/

