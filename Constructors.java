// Topic:- Constructors
// -----

// Constructor:- A constructor in Java is a special member that is called when an object is created. 
// -----------   It is called automatically when an instance of a class is created 
//               using the new keyword.

// Types of Constructors:-
// ---------------------

// 1. Default Constructor:- A default constructor has no parameters. It’s used to 
//    -------------------   assign default values to an object. If no constructor 
//                          is explicitly defined, Java provides a default constructor.

// Q:-1. Define a class student with default constructor to initialize two objects 
//       of the class roll no & name.

/*
class Students
{
     int Roll_No;
     String Name;

     Students()
     {
         Roll_No = 101;
         Name = "Anshul";
     }
     void display()
     {
         System.out.println("\nRoll No: " + Roll_No);
         System.out.println("Name: " + Name);
     }
}

public class Constructors
{
     public static void main(String[] args) {
         Students s1 = new Students();
         s1.display();
     }
}
*/

// ================================================================================

// 2. Parameterized Constructor:- A constructor that has parameters is known as 
//    -------------------------   parameterized constructor. If we want to 
//                                initialize fields of the class with our own 
//                                values, then use a parameterized constructor.

// Q:-1. Define a class student with paraeterized constructor to initialize two 
//       objects of the class roll no & name.

/*
class Students
{
     int Roll_No;
     String Name;
     String Class;

     Students(int r, String n, String c)
     {
          Roll_No = r;
          Name = n;
          Class = c;
     }
     void display()
     {
          System.out.println("\nRoll No " + Roll_No);
          System.out.println("Name: " + Name);
          System.out.println("Class: " + Class);
     }
}
public class Constructors {

     public static void main(String[] args) {
           
          Students s1 = new Students(101, "James Wolton", "12th");

          s1.display();

          Students s2 = new  Students(102, "Jacks Kennedy", "12th");

          s2.display();
     }
}
*/

// ================================================================================

// 3. Copy Constructor:- Unlike other constructors, copy constructor used to create
//    ----------------   a new object by duplicating the state of an existing object
//                       of the same class.

/*
class Students
{
     private int Roll_No;
     private String Name;

     Students(int r, String n)
     {
          Roll_No = r;
          Name = n;
     }
     Students(Students obj)
     {
          Roll_No = obj.Roll_No;
          Name = obj.Name;
     }
     void getShow()
     {
          System.out.print("\nRoll No: " + Roll_No);
          System.out.println("\nName: " + Name);
     }
}
public class Constructors {

     public static void main(String[] args) {
          
          Students s1 = new Students(101, "Ethan Winters");

          s1.getShow();

          Students s2 = new Students(s1);

          s2.getShow();;

     }
}
*/

// ================================================================================

// Parameterized Constructor:- Polymorphism in Java is one of the core concepts in 
// -------------------------   object-oriented programming (OOP) that allows objects
//                             to behave differently based on their specific class 
//                             type. The word polymorphism means having many forms,
//                             and it comes from the Greek words poly (many) and 
//                             morph (forms). This means one entity can take many forms.


// Constructor Overloading:- Constructor overloading in Java allows a class to have
// -----------------------   multiple constructors with the same name 
//                           (the class name) but different parameters. This enables
//                           objects of the same class to be initialized in various
//                           ways depending on the data provided during creation.

/*
class Student_Info
{
     String Name;
     int Age;
     

     Student_Info()
     {
          Name = "Unkown";
          Age = 0;
     }
     Student_Info(String n, int a)
     {
          Name = n;
          Age = a;
     }
     Student_Info(Student_Info obj)
     {
          Name = obj.Name;
          Age = obj.Age;
     }
     void showInfo()
     {
          System.out.println("\nName: " + Name + " | " + "Age: " + Age);
     }
}
public class Constructors {

     public static void main(String[] args)
     {
          Student_Info s1 = new Student_Info();
          s1.showInfo();

          Student_Info s2 = new Student_Info("Ethan", 25);
          s2.showInfo();

          Student_Info s3 = new Student_Info("Bolice", 34); 
          s3.showInfo();
     }
}
*/

// ================================================================================

// Function Overloading:- Method overloading in Java is a feature that allows a 
// --------------------   class to have more than one method with the same name with 
//                        different parameters.

/*
class Caculation
{
     public void Add(int a, int b)
     {
          int c;

          c = a + b;
          System.out.println("\nAddition: " + c);
     }
     public void Sub(int a, int b)
     {
          int c;

          c = a - b;
          System.out.println("\nSubtraction: " + c);
     }
     public void Mul(int a, int b)
     {
          int c;

          c = a * b;
          System.out.println("\nMultiplication: " + c);
     }
}
public class Constructors {

     public static void main(String[] args) {
          
          Caculation c1 = new Caculation();

          c1.Add(20, 30);

          c1.Sub(20, 10);

          c1.Mul(5, 10);
     }
}
*/
     