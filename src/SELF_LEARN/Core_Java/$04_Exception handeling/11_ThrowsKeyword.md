# Understanding the `throws` Keyword in Java

- The `throws` keyword is used to declare exceptions that a method may throw, but does not handle itself. 
- This means that any method calling a method with a `throws` declaration must handle the declared exceptions or re-throw them.

## Example:

Consider a `ReadWrite` class with methods to read and save files, both of which may encounter a `FileNotFoundException`:

```java
import java.io.*;

class ReadWrite {
    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("D:/janak/hi.txt");
    }

    void saveFile() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("D:/janak/hi.txt");
    }
}
```

In the above example:
- The `readFile()` and `saveFile()` methods are declared with `throws FileNotFoundException`, indicating that they may throw this exception.
- However, these methods do not handle the exception themselves.

Now, consider a class `WeHandle` that uses the `ReadWrite` class:

```java
class WeHandle {
    public static void main(String[] args) {
        ReadWrite fileHandled = new ReadWrite();
        try {
            fileHandled.readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
```

In this example:
- The `main()` method calls the `readFile()` method of `ReadWrite`.
- Since `readFile()` declares `FileNotFoundException`, `main()` must handle this exception.
- Here, it catches the exception and prints an appropriate message.

## Conclusion:

- The `throws` keyword is used to declare exceptions that a method may throw.
- Methods calling a method with a `throws` declaration must handle the declared exceptions or re-throw them.
- This allows for better exception handling and propagation in Java programs.
