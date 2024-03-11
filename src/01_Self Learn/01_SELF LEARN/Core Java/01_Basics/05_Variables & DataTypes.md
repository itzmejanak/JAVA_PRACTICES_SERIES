5. **Variables and Data types**
   - Primitive data types (int, double, char, boolean, etc.)
   - Reference data types (classes, interfaces, arrays, etc.)
   - Variable declaration and initialization
   - Naming conventions

- ### Primitive data types
  - int, double, char, boolean, etc.
  - These are fundamental data types built into the Java language.
  - They are not objects and do not have methods.

- ### Reference data types
  - Classes, interfaces, arrays, etc.
  - Reference data types refer to objects rather than simple values.
  - They store references (or addresses) to objects in memory.

- ### Variable declaration and initialization
  - Variables declared means memory allocated.
  - Size of the memory allocated depends upon its datatype.

- ### Naming conventions
  - Follow camelCase naming convention.
  - Variable names should start with a lowercase letter.
  - Constants should be in uppercase letters with underscores separating words.


## Points to be noted :-
    - Variable declared means memory allocated.
    - Size of the memoy allocated depends upon the on its Datatype.

## Types of Variable in Java :-
Java has three kinds of variables in JAVA:
- Local Variables
    - Local variables in Java are declared in constructor, method, or blocks.
    - Access of these variables have only between that current `Scope`
- Instance Variables
    - Instance variables in Java are declared outside a method, constructor or block.
    - Access of these variables have between All over the  `Class`
- Static Variables
    - Static variables in Java: declared with `static` keyword outside methods, constructors, or blocks.
    - Accessible throughout the class, shared among all `instances`.
    - Static variables can be accessed without creating an instance of the class.


## Types of Data Types in Java

### **Primitive Data Types**

 - Primitive data types in Java are the fundamental data types built into the Java language. 
 - They are not objects and do not have methods. 

> In Java, there are eight primitive data types:

| Data Type | Size   | Range                         |
|-----------|--------|-------------------------------|
| `byte`    | 1 byte | -128 to 127                   |
| `boolean` | 1 byte | true or false                 |
| `short`   | 2 bytes| -32,768 to 32,767             |
| `char`    | 2 bytes| 0 to 65,535                   |
| `int`     | 4 bytes| -2.14B to 2.14B               |
| `float`   | 4 bytes| ±3.4E+38F                     |
| `long`    | 8 bytes| -9.2E+18 to 9.2E+18           |
| `double`  | 8 bytes| ±1.8E+308                     |

These primitive data types are used to store simple values directly, without needing to create objects.

### **Reference Data Types**

- Reference data types in Java refer to objects rather than simple values. 
- reference data types store references (or addresses) to objects in memory.
 
> In Java, The list of Reference  data types:

1. Classes
2. Interfaces
3. Arrays
4. Enums (Enumerated types)
5. Strings
6. Collections (e.g., ArrayList, LinkedList, HashMap, etc.)
7. User-defined classes and objects
8. Exceptions
9. Annotations
10. Dates and times (e.g., java.util.Date, java.time.LocalDate, etc.)