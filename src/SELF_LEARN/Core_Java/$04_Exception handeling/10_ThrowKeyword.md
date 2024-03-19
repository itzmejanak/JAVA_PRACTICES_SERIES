## Throw Keyword in Java Exception Handling

## `throw`

- When an exception occurs, the JVM asks the current method if it handles the exception.
- If the method doesn't handle the exception, it terminates the method from the normal flow.
- The default exception handler then prints the exception object.

**Syntax of throw:**

```java
throw new ExceptionClassName();
```

- The `throw` keyword sends the exception created by the programmer to the JVM.
- When using `throw`, we create our own exception object and send it to the JVM.
- It should not be used for predefined exceptions; it's primarily for custom/user-defined exceptions.

**Why Custom Exceptions?**

- Custom exceptions are useful for scenarios like enforcing specific rules, such as age restrictions for voting.
- For instance, if age is less than 18, we can throw a custom exception to indicate ineligibility.

**How to Create Custom Exceptions:**

```java
class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String msg) {
        super(msg);
    }
}

class Voting {
    public static void main(String[] args) {
        int age = 18;
        if (age < 18) {
            throw new YoungerAgeException("Younger age problem: You are not eligible");
        }
    }
}
```

- In this example, we're creating an exception object but not handling it; handling must be done using try-catch.
- Customized exceptions are unchecked exceptions.

**How we can Handel our Custom Exceptions:**
```java
class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String msg) {
        super(msg);
    }
}

class Voting {
    public static void main(String[] args) {
        int age = 18;
        try {
            if (age < 18) {
                throw new YoungerAgeException("Younger age problem: You are not eligible");
            }
        } catch (YoungerAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

```