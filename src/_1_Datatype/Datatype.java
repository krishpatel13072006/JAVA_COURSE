package _1_Datatype;

public class Datatype {
    public static void main(String[] args) {

        //widening type casting
        //lower datatype to higher datatype
        //automatic type conversion
        byte x = 10;
        float x1 = x;
        System.out.println(x1);

        char c='a';
        byte b=(byte)c;
        System.out.println(b);

        //narrowing type casting
        //higher datatype to lower datatype
        //user  cast the type of data
        double v = 23.5;
        short v1 = (short) v;
        System.out.println(v1);


    }
}

//Certainly! Let's dive into the different data types in Java. Here's a comprehensive overview:
//
//### 1. **Primitive Data Types**
//Primitive data types are the most basic data types available in Java. They are predefined by the language and named by a keyword. There are eight primitive data types:
//
//- **byte**
//  - Size: 1 byte
//  - Range: -128 to 127
//  - Example: `byte age = 25;`
//
//- **short**
//  - Size: 2 bytes
//  - Range: -32,768 to 32,767
//  - Example: `short year = 2025;`
//
//- **int**
//  - Size: 4 bytes
//  - Range: -2^31 to 2^31-1
//  - Example: `int salary = 50000;`
//
//- **long**
//  - Size: 8 bytes
//  - Range: -2^63 to 2^63-1
//  - Example: `long population = 7800000000L;`
//
//- **float**
//  - Size: 4 bytes
//  - Range: Approximately ±3.40282347E+38F (6-7 significant decimal digits)
//  - Example: `float pi = 3.14F;`
//
//- **double**
//  - Size: 8 bytes
//  - Range: Approximately ±1.79769313486231570E+308 (15 significant decimal digits)
//  - Example: `double gravity = 9.8;`
//
//- **boolean**
//  - Size: 1 bit
//  - Values: `true` or `false`
//  - Example: `boolean isJavaFun = true;`
//
//- **char**
//  - Size: 2 bytes
//  - Range: 0 to 65,535
//  - Example: `char grade = 'A';`
//
//### 2. **Non-Primitive Data Types (Reference Types)**
//Non-primitive data types refer to objects and are created by the programmer. They are also called reference types because they reference objects.
//
//- **String**
//  - Represents a sequence of characters
//  - Example: `String greeting = "Hello, World!";`
//
//- **Arrays**
//  - Used to store multiple values of the same type in a single variable
//  - Example: `int[] numbers = {1, 2, 3, 4, 5};`
//
//- **Classes**
//  - Templates to create objects
//  - Example: `public class Person { String name; int age; }`
//
//- **Interfaces**
//  - Abstract types used to specify methods that must be implemented by derived classes
//  - Example: `interface Animal { void eat(); }`
//
//- **Enumerations (Enums)**
//  - Special classes that represent a group of constants
//  - Example: `enum Direction { NORTH, SOUTH, EAST, WEST }`
//
//### Key Points
//- **Primitive types** are stored in the stack, and reference types are stored in the heap.
//- **Primitive types** have a fixed size, whereas reference types can vary in size.
//- Java has a strong type system, meaning that variables must be declared before use and are bound to a specific data type.
//
//These notes cover the core aspects of Java data types, from primitive to reference types. Do you need any further details or examples on any specific type?