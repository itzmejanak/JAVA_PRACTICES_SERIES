____________
### Section 1
---
### JVM Auto Allocation for Non-Primitive Data Types

JVM automatically allocates the size for non-primitive data types using the concept of primitive data types.

#### Variable Types:

**Local Variables:**
- Stored in stack memory.
- Access specifiers cannot be used in local variables.
- Memory is allocated when a method, constructor, or block is executed.
- Local variables do not have default values.

**Instance Variables:**
- Allocated memory when an object of the class is created.
- Stored in heap memory.
- Instance variables have default values.
- Access specifiers can be used.
- Note: Objects have a default value of `NULL`.
- Note: There are no global variables in Java, but what are known as global variables in other languages are called instance variables in Java.

**Static Variables:**
- Can be declared in a class but not inside methods, blocks, or constructors.
- Allocated when the `.class` file is created.
- Stored in non-heap/static memory.
- Static variables also have default values.
- Access specifiers can be used.

#### How We Can Access Static Variables:
- By using the class name.
- By using an object reference name.
- Directly.

**Last Note:**
- Static variables have different values according to different objects, but instance variables always get allocated a new given value by using the object.


---
### Section 2
---

### Operators, Keywords, and Literals

#### Operators
- **Arithmetic:** `+`, `-`, `*`, `%`, `a++`, `a--`
- **Relational:** `==`, `!=`, `>`, `<`, `>=`, `<=`
- **Bitwise:** `&`, `|`, `^`, `_`, `<<`, `>>`, `>>>`
- **Logical:** `&&`, `||`, `!`
- **Assignment:** `+=`, `-=`, `*=`, `/=`, `%=`
- **Miscellaneous:** `?:`

#### Literals
- Values assigned to variables are **literals**.
- Types: `string`, `float`, `boolean`, `null`, `integer`, `character`, `real`

#### Keywords
- Predefined words which have predefined meanings.
- In Java, there are 50 keywords, of which 48 are used. `goto` and `const` are not used.
---

### Section 3
---

### Identifiers
- Identifiers can be any name such as variable names, class names, object names, or variable names.

#### Rules for Identifiers:
- Spaces cannot be used.
- Only `_` (underscore) and `$` (dollar sign) can be used.
- Reserved words and keywords cannot be used.
- Integer values cannot be used as the first character.

#### Naming Conventions:
- **For Variables:**
  - Use lowercase letters and separate words with `$` or `_`.

- **For Methods:**
  - Use camel casing (e.g., `myMethodName`).

- **For Classes/Interfaces:**
  - Use capitalized words (e.g., `MyClassName`).

---

### Section 4
---

### History of Java

#### What is Java:
- A high-level programming language.
- Java is a platform.

#### History of Java:
- Developed by James Gosling.
- First name: OAK.
- Development started in 1991.
- Java's first version was released in 1995 (Java Alpha and Beta versions).

---

### Section 5
---

### Features of Java

- **Platform Independent:**
  - Java code can be compiled on one system and the compiled code can be used on any other platform (Windows, Linux, Mac).
  - To run the compiled code, a JVM is required.
  - This feature makes Java portable.
  
- **Secured:**
  - Security is provided by the JVM.
  - **What is JVM?**
    - JVM verifies the bytecode and executes it.
    - JVM has a security manager.
  - No pointers, meaning no direct memory access, which enhances security.
  - Access modifiers.
  - Exception handling.
  - Java has its own memory management system.

- **Object-Oriented Programming (OOP):**
  - Supports concepts like inheritance, polymorphism, encapsulation, and abstraction.

- **Robust:**
  - Capable of handling small to big issues effectively.

- **Multithreading:**
  - Supports concurrent execution of two or more threads.

- **Simple:**
  - Easier to learn and use compared to C and C++.

### Use of Java
- Android applications (Note: Android has its own JVM)
- And many more applications.
---

### Section 6
---
### JDK JRE JVM
#### JDK (Java Development Kit)
- JDK = JRE + Development tools.
- Includes:
  - `java`
  - `javac`
  - `javadoc`
  - JRE
- Main Work:
  - Compiling Java files and executing them.

#### JRE (Java Runtime Environment)
- JRE = Classes + Library + JVM.
- Includes:
  - Java packages (classes).
  - Runtime library.
  - JVM.
- Main Work:
  - JRE provides imported classes in our code.

#### JVM (Java Virtual Machine)
- Includes:
  - Class loaders.
  - Memory areas.
  - Execution engine.
- Main Work:
  - Verifies bytecode and executes it.
  - JVM is platform-dependent, built differently for each platform.
---

### Section 7
---
#### How Java Works
- JDK includes `javac` and `java`, which help compile and run programs. After compilation, a `.class` file is generated.
- The `.class` file is loaded into the JVM. The execution part involves interpreters and the JIT compiler, which execute the code and display the output in the command line.

#### JVM Architecture
- The `.class` file first goes into the class loader, where the loading process is performed.
- Then, it is loaded into memory areas.
- Finally, the code is executed.
---
The following Figure show the Working Mechanism of JVM :-
```
Start
|
|  +-------+            +-----------+
+->| javac |            |   JVM     |
|  +-------+            +-----------+
|     |                      |
|     v                      v
|  +-------+             +-------+
|  | .java |             | .class|
|  | file  |   Compile   | file  |
|  +-------+  ---------> |       |
|     |                  +-------+
|     v                      |
|  +-------+                 |
|  | .class|                 |
|  | file  |                 |
|  +-------+                 |
|     |                      |
|     v                      |
|  +-------+                 |
|  | Class |   Load .class   |
|  | Loader|  -------------> |
|  +-------+                 |
|     |                      |
|     v                      |
|  +-------+                 |
|  | Memory|   Execute .class|
|  | Areas |  -------------> |
|  +-------+                 |
|     |                      |
|     v                      |
|   Output                   |
|  (Result)                  |
+----------------------------+
Finish
```
---
### Section 8: OOPs Concepts
---
#### OOPs
- It is the programming paradigm/methodology, a way of doing work.
- Six pillars of OOP:
  - Class
  - Object/Method
  - Inheritance
  - Polymorphism
  - Abstraction
  - Encapsulation
  (Note: All concepts are taken from the real world. Smalltalk is the pure and first OOPs language.)

#### Class
- Class is the blueprint/template/prototype.
- Collection of objects.
- Class is not a real-world entity.
- Class doesn't occupy memory.
- Class can have nested classes.

#### Object
- Object is an instance of a class.
- Object is a real-world entity.
- Object occupies memory.
- Object consists of identity, state, attributes, behavior.

#### How to Create Objects:
- By using the `new` keyword.
- By using `newInstance` method.
- By using `clone()` method.
- By deserialization.
- By using factory method.

#### Methods
- Set of code which performs a particular task.
- Advantages of methods:
  - Code reusability.
  - Code optimization.

---
### Section 9: Constructor
---
#### Constructor
- Constructor is a block having the same name as that of the class name.
- Constructor doesn't have any return type, not even `void`.
- The only modifiers applicable for a constructor are `(public, protected, default, private)`.
- Constructor automatically executes when an object is created.

#### What is the Use of Constructor?
- For initializing each object's values, unlike by (parameterized constructor).
- Constructor is created by using the `new` keyword.

#### Types of Constructor

1. **Default Constructor**:
   - Created by the compiler itself, which is a no-argument constructor.
   - In the default constructor, the line `super();` only exists.

2. **No-Argument Constructor**:
   - Constructor which is created by the developer itself without arguments.

3. **Parameterized Constructor**:
   - Constructor which is created by the developer itself with arguments for initializing unique values for objects.
---
### Section 10: Inheritance
---
#### Inheritance
- Inheriting the parent class's properties into a child class is Inheritance (using the `extends` keyword).

#### Uses:
- Code reusability.
- Can achieve polymorphism (method overriding).

#### Disadvantage:
- Tightly coupled (means a change in the parent class affects others).

#### Types of Inheritance

1. **Single Inheritance**:
   - If a class's property is used in the next class only one time.
   ```
            Parent Class (A)
                   |
                   |
             Child Class (B)

   ```

2. **Multilevel Inheritance**:
   - If a class's property is used in more than one class without hierarchy.
   ```
            Parent Class (A)
                   |
                   |
             Child Class (B)
                   |
                   |
            Subchild Class (C)

   ```
3. **Hierarchical Inheritance**:
   - If a class's property is used in more than one class in a hierarchy.
   ```
                Parent Class (A)
                 /          \
                /            \
       Child Class (B)   Child Class (C)

   ```
4. **Multiple Inheritance**:
   - If two parent class properties are extended by one child class (not used in java).
   ```
        Parent Class (A)   Parent Class (B)
               \                 /
                \               /
                 Child Class (C)

   ```
5. **Hybrid Inheritance**:
   - If one parent class is extended by two classes, and these two are extended by one class (not used in java).
   ```
                  Parent Class (A)
                 /               \
                /                 \
               /                   \
      Child Class (B)       Child Class (C)
               \                   /
                \                 /
                 \               /
                  Subchild Class (D)

   ```
---

### Section 11: Polymorphism
---
Polymorphism means "poly" (many) + "morph" (form), which implies many forms.

#### Types of Polymorphism

1. **Compile-time Polymorphism:**
   - Handled by the compiler.
   - Also known as static polymorphism.
   
   ##### How can we achieve compile-time Polymorphism?
   - By method overloading.
   
   ##### Method Overloading:
   - Same name and same class with different arguments.
   - Criteria for overloading:
     - Number of arguments.
     - Sequence of arguments.
     - Type of arguments.

2. **Runtime Polymorphism:**
   - Handled by JVM.
   - Also known as dynamic polymorphism.
   
   ##### How can we achieve runtime Polymorphism?
   - By method overriding.
   
   ##### Method Overriding:
   - Same name and different class with the same arguments.
   - return type can be define (but parent class method return type should be object)
   - Criteria for overriding:
     - Number of arguments.
     - Sequence of arguments.
     - Type of arguments.
---


### Section 12: Abstraction & Encapsulation
---
#### Abstraction
- Hiding implementation details.
  
##### How can we achieve Abstraction?
  - By abstract class:
    - Here we can't achieve 100% abstraction.
    - It's not necessary that an abstract class must have abstract methods.
    
  - By interface:
    - Here we can achieve 100% abstraction.
    - Interface is similar to an abstract class but all methods are abstract.
    - Supports multiple inheritance.
    - Loose coupling.
    - Only abstract methods are allowed with public access modifier.
    - All fields become `(public, static, final)`.
    - Default concrete methods can be defined, but their access modifier should be default.
    - Static concrete methods can be defined.
    - Private methods can also be defined.
    - For inheriting interface, `implements` keyword is used.
    - Objects cannot be created from an interface.

### Encapsulation

Encapsulation involves bundling data and methods that operate on the data into a single unit (class), thereby restricting access to some of the object's components. It facilitates data hiding.

#### How can we achieve Encapsulation?
- By using the private access modifier for attributes/variables.
- By providing public getter and setter methods to access these attributes/variables from different extended classes.
--- 

### Section 13: `<this>`, `<super>` &  `Final` Keyword
--- 
#### "this" Keyword
- The `this` keyword refers to the current class instance variables.

#### Importance of "this" Keyword:
- It helps resolve the issue of instance variable value into a local variable (conflict of the same name).

#### Uses of "this" Keyword:
- It can be used to refer to current class methods.
- When `this()` is used, it invokes the current class constructor.
- It can be used to pass as an argument in method calls.
- It can be used to pass as an argument in constructor calls.
- It can be used to return the current class instance from    the method.

#### Super Keyword

#### Uses of super Keyword:
- It is used to refer to parent class objects, methods, variables, and constructors.
- Inheritance concept is utilized here.

#### Note:
- Both `super` and `this` are reference variables.

### Final Keyword

The `final` keyword can be used with variables, methods, and classes.

#### Why to Use the `final` Keyword?

- **In the context of making variables constant**: When a variable is declared as `final`, its value cannot be changed once initialized.

- **In the context of making methods not to be overridden**: When a method is declared as `final` in a parent class, it cannot be overridden by subclasses.

- **In the context of making classes not to be inherited**: When a class is declared as `final`, it cannot be subclassed.
---

Here's the formatted Section 12:

---

### Section 13: Static Variables & Methods

#### Static Keyword

The `static` keyword is a non-access modifier. There are two types of access modifiers: access and non-access.

**Access Modifiers:**
- **public:** The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
- **private:** The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
- **protecte:** The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
- **Default:** The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

**Non-Access Modifiers:**
- `static`
- `final`
- `abstract`
- `synchronized`
- `transient`
- `volatile`
- `strictfp`

#### Static Keyword Usage

1. **Variables:**
   - Class-level variables can only be static, rather than local.
   - Static variables can be accessed using the class name from other classes.
   - If there are repeated variables with the same value for multiple objects, they can be made static for memory management.

2. **Methods:**
   - Static methods belong to the class, not an object, so they can be called using the class name or directly according to the situation.
   - Used for memory management and increasing software speed.
   - Static methods should have static variables; instance variables cannot be used in static methods.
   - Static methods can only call other static methods.
   - `this` and `super` keywords cannot be used in static methods.

3. **Block:**
   - Block with the `static` keyword and curly braces.
   - Static blocks automatically execute when the program loads into memory.
   - It can be run without the `main` method (from version 1.6 onwards).
---