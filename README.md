# GETTING STARTED WITH JAVA

## JDK (Development Tools)

an environment that gives everything that we need to develop java applications.

We have JRE (Java Runtime Environment) Gives us Libraries and Classes

And JVM (Java Virtual Machine) responsilbe for executing java programs

JSE (java standard Edition from Oracle) Or Open JDK (Open Source)
Java 11 LTS (Long time support)

### To compile a file with the command line

navigate the the main.java file
then

```
$ javac Main.java
```

This command will create a file with the same name but as a class file (e.g Main.class)
This is the sourcecode recreated by intellij,
this is reading from bytecode and transforming into java code

### To Run java code with the command line

Every single java program should have main class, and with a public static void main method
This will be the main entry point to execute program.

to execute. navigate (back or into) src directory

```
//Notice we do not use forward or back slash, but instead we use dots (.)
$ java com.johnnyDev.Main //com.johnnyDev is my project directory
```

this will run the code inside the main class.
But after we compiled the file.
If the Main.class doesn't exist, meaning we haven't compile the Main.java file, then the command won't work, because it will try to look for the .class file.

An IDE will compile and run our code for us

- IntelliJ
- NetBeans
- Eclipse
- etc.

## Packages

A Package is a way for us to organize our classes together. This is simply a folder structure.

## Variables

Placeholders to store values
we can use underscore to separate values and it won't change
the value of the variables, this will be easy to read

```java
//Primitives
byte theBye = -128 // to 127
int number = 100;
long number2 = 2312323;
long number2WithUnderscore = 2_312_323;
double number3 = 1254.5451;
char char1 = 'a';
boolean isTrue = true;

```

![Primitive Types]("/Images/primitive-types.PNG")

Non-primitives data types Or Reference Types (Object types)

```java
//Non primitive Data types OR Reference types or Object types
String brand = "Nike";
Date date = new Date(); //everytime we say new, means a reference type- For this Date instance we need to import Java.util.Date.

//Non primitive data types have built-in behaviors or Methods that we can use.
LocalData now = LocalDate.now();
System.out.println(now.getMonth());
```

### Difference between primitive and reference types

Primitive types pass by copy
In the example below we we are initializing b
b is getting a copy of the value in a
so when we change the value of a, b doesn't get affected
a and b have different memmory addresses.

```java
int a = 10;
int b = a;
a = 100;

System.out.println("a:" + a + " b:" + b);// a: 100  b:10
```

Non primitive types
This case the variable mariam is getting a reference to the memmory address instead of a copy
Thus when alex.name gets updated, mariam will get updated since
they are both poiting to the same object (memmory address).

```java
public static void main(String[] args) {
        Person alex = new Person("alex");
        Person mariam = alex;

        System.out.println("Before changing the name alex");
        System.out.println(alex.name + " " + mariam.name);// alex alex
        alex.name = "Alexander";

        System.out.println();
        System.out.println("After changing the names");
        System.out.println(alex.name + " " + mariam.name);// alexander alexander

    }

    static class Person {
        String name;
        Person (String name){
            this.name = name;
        }
    }
```

## Naming Variables

To name variables in Java Use Camel Case and meaninful names

```java
//BAD
int n1 = 0;
int n2 = 3;
int n4 = 4;

//GOOD
int zero = 0;
int one = 1;
int two = 2;
//Camel Case
int countForDaysLeft = 23123;
```

## The STRING Class

A string is simply a series of characters

In this example we say that String is a class and
name is an object of type String.
classes contain behaviours(methods)

```java
String name = new String("Johhny");
// this is a behavior, method
System.out.println(name.toUpperCase());

//For class String, there is no need to say "new"
// we can just assign the series of characters directly
String name2 = "Abelardo";
System.out.println(name2.toLowerCase());
```

for string concatination we can use the plus sign(+)
or we can use the concat method

```
System.out.println("hey " + "there");
System.out.println("hey ".concat(" whaat? ").concat("This Works!")); //hey  whaat? This Works!
```

## the Math Class

from java.lang
We don't have to import any packages

```java
System.out.println(Math.max(3,5));
System.out.println(Math.abs(-348));
System.out.println((int) Math.pow(4,2));//type casting to integer
System.out.println((int) Math.sqrt(25));
```

## If statements and Ternary Operators

if statements

```java
String randomOutput;
if( 5 > 1){
    randomOutput = "number is bigger"
} else {
    randomOutput = "number is less"
}
```

for simple If statements we can use ternary operators

```java
String randomOutput;
randomOutput = 5 > 2 ?  "number is bigger" : "number is less";
```

# Switch Statements

```java
String gender = "FEMALE";

switch (gender){
    case "FEMALE":
        System.out.println("I am a female");
        break;
    case "MALE":
        System.out.println("I am a male");
        break;
    default:
        System.out.println("Prefer not to say")
}
```

## Arrays

We need to specify the size of the array.
After setting a size we cannot change it.

```
int [] nums = {2,0,1};
int [] numbers = new int[2]; // by default the numbers are 0
boolean [] numbers = new boolean[2]; // by default the numbers are false
String [] numbers = new String[2]; // by default the numbers are null
```

## For loop and Enhanced for Loop & more Advanced

for loops:

```java
int [] numbers = { 1, 4, 2, 4, 5, 2,3};
for( int i = 0; i < 10 ;  i++){
    System.out.println(numbers[i]);
}
```

enhanced loops:

```java
int [] numbers = { 1, 4, 2, 4, 5, 2,3};
for (int number: numbers){
    System.out.println(number)
}
```

Advanced

```java
int [] numbers = { 1, 4, 2, 4, 5, 2,3};
Arrays.stream(numbers).forEach(System.out::println);
```

## The SCANNER class

Comes with java.util thus we need to import it.

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
System.out.println("say something");
String something = scanner.nextLine();
System.out.println("You said: " + something);
System.out.println("How old are you?");
int age = scanner.nextInt();
int year = LocalDate.now().minusYears(age).getYear();
System.out.println("You were born in " year);
```

## CLASSES AND OBJECTS

Objects: anything you can think of that represents something in the real world

Class: a template or a blueprint for creating objects

classes can have attributes and behaviors(methods)

```java
public class Main {

    public static void main(String[] args) {

        Lens lensOne = new Lens("sony", "85mm", true);
    }

    static class Lens {
        //attributes
        String brand;
        String focalLength;
        boolean isPrime;
        //CONSTRUCTOR
        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}

```
