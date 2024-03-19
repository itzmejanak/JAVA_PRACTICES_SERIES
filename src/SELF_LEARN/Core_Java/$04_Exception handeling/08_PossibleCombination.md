## Various Possible Combinations of try-catch-finally

## 1. Try Block Only

```java
try {
    // Code that may throw an exception
}
```

## 2. Try-Catch Block

```java
try {
    // Code that may throw an exception
} catch(Exception e) {
    // Handling the exception
}
```

## 3. Inside Try Multiple Catch Blocks

```java
try {
    // Code that may throw different types of exceptions
} catch(IOException e) {
    // Handling IOException
} catch(SQLException e) {
    // Handling SQLException
} catch(Exception e) { // parent class of exception should use last always
    // Handling other exceptions
}
```

## 4. Try-Finally Block

```java
try {
    // Code that may throw an exception
} finally {
    // Cleanup code
}
```

## 5. Try-Catch-Finally Block

```java
try {
    // Code that may throw an exception
} catch(Exception e) {
    // Handling the exception
} finally {
    // Cleanup code
}
```

## 6. Nested Try-Catch Blocks

```java
try {
    try {
        // Code that may throw an exception
    } catch(Exception e) {
        // Handling the exception
    }
} finally {
    // Cleanup code
}
```

## 7. Nested Try-Finally Blocks

```java
try {
    try {
        // Code that may throw an exception
    } finally {
        // Cleanup code for inner try block
    }
} finally {
    // Cleanup code for outer try block
}
```

## 8. Nested Try-Catch-Finally Blocks

```java
try {
    try {
        // Code that may throw an exception
    } catch(Exception e) {
        // Handling the exception for inner try block
    } finally {
        // Cleanup code for inner try block
    }
} finally {
    // Cleanup code for outer try block
}
```

## 9. Try-Catch Inside Finally Block

```java
try {
    // Code that may throw an exception
} finally {
    try {
        // Code to handle exceptions in the finally block
    } catch(Exception e) {
        // Handling the exception in the finally block
    }
}
```

**Notes:**
- `Try-Catch-Finally Structure`: Comprehensive way to handle exceptions.
- `Multiple Catch Blocks`: For handling different types of exceptions.
- `Nested Try-Catch-Finally`: For complex exception handling scenarios.
- `Try-Catch Inside Finally Block`: Handling exceptions during cleanup operations.