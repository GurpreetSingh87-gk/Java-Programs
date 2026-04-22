// Topic:- Inheritance
// -----

// Inheritance:- Inheritance in Java is a core OOP concept that allows a class to 
// ------------  acquire properties and behaviors from another class. It helps in 
//               creating a new class from an existing class, promoting code 
//               reusability and better organization. 

// Types of Ineritance:-
// -------------------

// 1. Single Inheritance
// 2. Mutiple Inheritance
// 3. Multilevel Inheritance
// 4. Hierarchical Inheritance

// ================================================================================

// Example:-

/*
class Animal
{
     void eat()
     {
          System.out.println("\nAnimal eats food");
     }
}
class Dog extends Animal
{
     void bark()
     {
          System.out.println("\nDog barks");
     }
}
class Cat extends Animal
{
     void meow()
     {
          System.out.println("\nCat meows");
     }
}
public class Inheritance
{
     public static void main(String[] args){
          
          Dog d1 = new Dog();
          d1.eat(); // Inherited method from Animal class 
          d1.bark(); // Dog's own method  
          
          Cat c1 = new Cat();
          c1.eat(); // Inherited method from Animal class
          c1.meow(); // Cat's own method
     }
}
*/

// ================================================================================

// 1. Single Inheritance:- In single inheritance, there is a one parent class
//    ------------------   (Base class) and one child class (Derived class) exists.
//                         The child class inherits the properties and behaviours of
//                         the parent class.

// Example:-

/*
class Parent
{
     void display()
     {
          System.out.println("\nThis is Parent Class");
     }
}
class Child extends Parent
{
     void show()
     {
          System.out.println("\nThis is Child Class");
     }
}
public class Inheritance
{
     public static void main (String[] args){

          Child c1 = new Child();

          c1.display(); // Inherited method from Parent class
          c1.show(); // Child's own method
     }
}
*/

// ================================================================================

// 2. Multiple Inheritance:- In multiple inheritance, there is one child class
//    --------------------   (Derived class) and more than one parent class (Base class) 
//                           exists. The child class inherits the properties and 
//                           behaviours of more than one parent class. Java does 
//                           not support multiple inheritance with classes to avoid 
//                           ambiguity, but it can be achieved using interfaces.

/*
interface A{
     default void methodA(){
          System.out.println("This is method A");
     }
}

interface B{
     default void methodB(){
          System.out.println("This is method B");
     }
}

class Child implements A, B
{
     public void methodA()
     {
          System.out.println("This is method A");
     }

     public void methodB()
     {
          System.out.println("\nThis is method B");
     }

     void showData()
     {
          System.out.println("\nThis is method Child");
     }
}
public class Inheritance {

     public static void main(String[] args) {
          Child c1 = new Child();
          c1.methodA(); // Method from interface A
          c1.methodB(); // Method from interface B
          c1.showData(); // Child's own method
     }
}
*/

// ================================================================================

// 3. Multilevel Inheritance:- In multilevel inheritance, there is a chain of
//    --------------------   classes where one class inherits from another, and that
//                           class is further inherited by another class. It forms a
//                           multilevel hierarchy of classes.

// Example:-

/*
class GrandParent
{
     void display()
     {
          System.out.println("\nThis is GrandParent Class");
     }
}
class Parent extends GrandParent
{
     void show()
     {
          System.out.println("\nThis is Parent Class");
     }
}
class Child extends Parent
{
     void info()
     {
          System.out.println("\nThis is Child Class");
     }
}
public class Inheritance
{
     public static void main(String[] args) {
          Child c1 = new Child();
          c1.display(); // Inherited method from GrandParent class
          c1.show(); // Inherited method from Parent class
          c1.info(); // Child's own method
     }
}
*/ 

// ================================================================================

