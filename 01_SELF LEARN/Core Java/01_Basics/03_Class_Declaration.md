3. **Class Declaration**
   - Declaring classes
   - Access modifiers (public, private, protected, default)

## 1. Declaring classes :-
    - class are declared by using {};
    - class name is case sensetive
    - class name can be start from (_) underscore or doller sign ($).
    - Class body enclosed in curly braces {}


1. **Normal (Top-Level) Classes**:
   - A standalone class declared in its own source file.
   - Can be public, package-private (default), protected, or private.
   - Used for encapsulating data and behavior.

   ```java
   public class MyClass {
       // Class members and methods
   }
   ```

2. **Nested Classes**:
   - Classes declared within another class.
   - Can be static or non-static (inner classes).
   - Inner classes have access to the members of the enclosing class.

   ```java
   public class OuterClass {
       class InnerClass {
           // Inner class members and methods
       }
   }
   ```

3. **Abstract Classes**:
   - Classes that cannot be instantiated on their own.
   - May contain abstract methods (methods without implementation).
   - Used as a template for other classes to inherit from.

   ```java
   public abstract class AbstractClass {
       // Abstract methods
       public abstract void abstractMethod();
   }
   ```

4. **Final Classes**:
   - Classes that cannot be subclassed (extended).
   - Used when the class functionality should not be altered or extended.

   ```java
   public final class FinalClass {
       // Class members and methods
   }
   ```

5. **Anonymous Classes**:
   - Classes without a name.
   - Instantiated and declared in a single expression.
   - Often used for event handling and callbacks.

   ```java
   ActionListener listener = new ActionListener() {
       public void actionPerformed(ActionEvent e) {
           // Event handling code
       }
   };
   ```

6. **Local Classes**:
   - Classes declared within a method or a block of code.
   - Scope limited to the block in which they are declared.

   ```java
   public void myMethod() {
       class LocalClass {
           // Local class members and methods
       }
   }
   ```

7. **Static Nested Classes**:
   - Nested classes declared as static.
   - Can be accessed using the enclosing class name without creating an instance of the enclosing class.

   ```java
   public class OuterClass {
       static class StaticNestedClass {
           // Static nested class members and methods
       }
   }
   ```


## 2. Access modifiers (public, private, protected, default) :-

1. **Public**:
   - Allows to access of classes, method, or variable from any other class.
   - Public members are accessible from anywhere in the application.

   Example:
   ```java
   public class PublicClass {
       public void publicMethod() {
           System.out.println("This is a public method");
       }
   }
   ```

2. **Private**:
   - Restricts access to the class, method, or variable to only within the same class.
   - Private members are not accessible from outside the class they are declared in.

   Example:
   ```java
   public class MyClass {
       private int privateVariable;

       private void privateMethod() {
           System.out.println("This is a private method");
       }
   }
   ```

3. **Protected**:
   - Allows access to the class, method, or variable from within the same package.
   - Protected members are accessible to inhereit classes and other classes which are in the same package.

   Example:
   ```java
   package com.example;

   public class BaseClass {
       protected void protectedMethod() {
           System.out.println("This is a protected method");
       }
   }

   package com.example.subpackage;

   public class SubClass extends BaseClass {
       public void accessProtectedMethod() {
           protectedMethod(); // Can access protected method from superclass
       }
   }
   ```

4. **Default (Package-Private)**:
   - If no access modifier is specified, the default access level is package-private.
   - Default members are accessible only within the same package.

   Example:
   ```java
   package com.example;

   class DefaultClass {
       void defaultMethod() {
           System.out.println("This is a default method");
       }
   }

   // In the same package or directory
   public class AnotherClass {
       public void accessDefaultMethod() {
           DefaultClass obj = new DefaultClass();
           obj.defaultMethod(); // Can access default method from same package
       }
   }
   ```