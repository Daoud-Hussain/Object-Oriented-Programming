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

## Is-A Relationship
In Java, inheritance is an **Is-a relationship**. That is, we use inheritance only if there exists an is-a relationship between two classes.
**For example**,

- **Car** is a **Vehicle**
- **Orange** is a **Fruit**
- **Dog** is an **Animal**.

Here, **Car** can inherit from **Vehicle**, **Orange** can inherit from **Fruit**, and so on...


# Polymorphism
Polymorphism means **many forms**, and it occurs when we have many classes that are related to each other by inheritance. It is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
    Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

## Types of polymorphism

In Java polymorphism is mainly divided into two types: 

-  Compile-time Polymorphism
- Runtime Polymorphism
 
### i. Compile-time polymorphism
It is also known as **Static polymorphism**. This type of polymorphism is achieved by function overloading or operator overloading. 

**Note**: Java doesn’t support the Operator Overloading.

### ii. Runtime polymorphism

It is also known as **Dynamic Method Dispatch**. It is a process in which a function call to the overridden method is resolved at Runtime. This type of polymorphism is achieved by **Method Overriding**. Method overriding, on the other hand, occurs when a derived class has a definition for one of the member functions of the base class. That base function is said to be overridden.

# ArrayList

The ArrayList class is the part of **Java Collection Framework**. This class implements the List interface provided by the Collection framework. This is a high level hierarchy for the Array list. This is one of the most widely used in Java because it provides flexibility. Java ArrayList is the preferred data structure for everyone who needs dynamic array. You can use the arraylist using following syntax: <br>
``import java.util.ArrayList;`` <br>
For primitive types:  <br>
``ArrayList<listType> listName = new ArrayList<listType>(size);`` <br>
For class types:  <br>
``ArrayList<className> listName = new ArrayList<className>(Constructor);`` <br>

## Key points about the ArrayList in Java:

The Java ArrayList grow and sink dynamically when we add/remove elements from it.
- ArrayList uses the array as an internal data structure to store element.
- This provides flexibility to use elements using the indexes.
- ArrayList allows to store duplicate values including “null” values.
- It is an ordered collection, i.e. it maintains the insertion order.
- Java ArrayList supports Generics.
- It only allows objects in the ArrayList. For primitive values like int, long etc. use the wrapper classes.
- Java ArrayList Iterator and ListIterator implementation is fail-fast.
- ArrayList is not thread safe. We need to apply synchronization if multiple threads will change ArrayList at the same time.

## Arrays Vs ArrayList

- Array has a **fixed-length** and its size will remain same even if you remove all elements from the Array. While, ArrayList is **dynamic** in nature and it will grow or shrink automatically as we add/ remove element from it.
- Array is just **data-storage** and you need to write the code to work on the Array (e.g. Add, remove or search etc.) While the ArrayList provides a set of **built-in methods** which make it easy to work with it.

# File Handling
File Handling enables us to store the output of any particular program in a file and allows us to perform certain operations on it. It is an integral part of any programming language. File handling in Java is defined as reading and writing data to a file.

## Using File Handling in Java
Their exist particular file class from the java package called **java.io** allows us to handle and work with different formats of files. Thus, if we want to use a file class, we need to create an **object** of that particular class and should specify the filename or directory name.

## Why use File Handling
Here are some advatages why should we use file handling:

**1. Reusability:** It helps in preserving the data or information generated after running the program. <br>
**2. Large storage capacity:** Using files, you need not worry about the problem of storing data in bulk. <br>
**3. Saves time:** Data storage in files required less time consumption. <br>
**4. Portability:** You can easily transfer the contents of a file from one computer system to another. <br>
**5. No Data Loss:** Using file handling our data is not lost if we exit the program rather it is stored permanently in files. <br> 

#


### Author
- <a href="https://daoudhussain.tech/"> Daoud Hussain </a> 
### References:
- <a href="https://www.w3schools.com/java/java_intro.asp"> W3Schools</a> 
- <a href="https://www.geeksforgeeks.org/introduction-to-java/"> Geeks for Geeks </a> 
- <a href="https://www.javatpoint.com/java-tutorial"> JavaT point </a> 
- <a href="https://www.programiz.com/java-programming"> Programmiz </a> 
