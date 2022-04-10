# Object-Oriented-Programming in java
<img src="main-image.jpg">

## Introduction
Java is a **General-purpose High-level** programming language that works on a strategy named **Write once run anywhere** (i.e, compiled Java code can run on all platforms that support Java). The codes written in Java are converted into an intermediate level language called **bytecode**,after compilation which becomes a part of the java platform, independent of the machine on which the code runs. This makes Java highly portable as its bytecodes can be run on any machine by an interpreter called **Java Virtual Machine(JVM)**. The syntax of Java is similar to **C/C++**.

## Why use Java?
Java is one of the most popular programming languages out there that was released in **1995** and still widely used today. Java has many applications, including software development, mobile applications, and large systems development. You should use Java as it is:
- Versatile
- Platform independant
- Has many open-source libraries
- User-friendly
- Easy to implement

# Class:

A class is a user defined **Blueprint** or **Prototype** from which objects are created. It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include these components:

    Modifiers : A class can be public or has default access.
    
    Class name: The name should begin with a initial letter (capitalized by convention).
    
    Superclass(if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
    
    Interfaces(if any): A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
    
    Body: The class body surrounded by braces, { }.

# Object:

An object is an **instance** of a class. Technically, Class is a **template** which describes what **state** and **behavior** of an instance. Object implements the state and behavior in the form of variables and methods and requires some memory allocated. An object consists of:

    State : It is represented by attributes of an object. It also reflects the properties of an object.
    
    Behavior : It is represented by methods of an object. It also reflects the response of an object with other objects.
    
    Identity : It gives a unique name to an object and enables one object to interact with other objects.
    
    
### Declaring Objects (Also called instantiating a class):

When an object of a class is created, the class is said to be **instantiated**. All the instances share the attributes and the behavior of the class. But the values of those attributes, i.e. the state are **unique** for each object. A single class may have any number of instances.

# Methods:

A method is a collection of statements that perform certain tasks upon calling and return the result to the caller. A method can perform certain tasks without even returning anything. Methods allow us to reuse the code without retyping the code.


### Modifier: 
Defines access type of the method i.e. from where it can be accessed in your application. In Java, there **four** types of the access modifiers.
   
        Public: accessible in all class in your application.
        Protected: accessible within the class in which it is defined and in its subclass(es)
        Private: accessible only within the class in which it is defined.
        Default (declared/defined without using any modifier) : accessible within same class and package within which its class is defined.
# Constructors:

Constructors are used for initializing new objects. Constructors does not return any values but implicitly it returns the object of the class. Fields are variables that provides the state of the class and its objects, and methods are used to implement the behavior of the class and its objects.

### Constructors cannot be Inherited:
When a class extends another class, the child class inherits the variables, methods and the behaviour of the super class but not the constructors. Constructors have same name as the class name. So, if constructors were inherited in child class then child class would contain a parent class constructor which is against the constraint that constructor should have same name as class name.

### Default Constructors:

Java creates a default constructor automatically if no default or parameterized constructor is created by user. The default constructor in java initializes the member data variables to default values


### Copy Constructor:
Java supports copy constructor but doesn't create a default copy of constructor if user doesn't create one.

### Points to be noted:

    1.The this() expression should always be the first line of the constructor.
    2.There should be at-least be one constructor without the this() keyword.
    3.Constructor chaining can be achieved in any order.

# Inheritance:

Inheritance is an important **pillar** of OOP. It is the mechanism in java by which one class is allow to inherit the features (fields and methods) of another class.

    Super Class: The class whose features are inherited is known as super class (or a base class or a parent class).
    
    Sub Class: The class that inherits the other class is known as sub class(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
    
    Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.

#

### Author
- <a href="http://daoud-hussain.com/"> Daoud Hussain </a> 
### References:
- <a href="https://www.w3schools.com/java/java_intro.asp"> W3Schools</a> 
- <a href="https://www.geeksforgeeks.org/introduction-to-java/"> Geeks for Geeks </a> 
- <a href="https://www.javatpoint.com/java-tutorial"> JavaT point </a> 
- <a href="https://www.programiz.com/java-programming"> Programmiz </a> 
