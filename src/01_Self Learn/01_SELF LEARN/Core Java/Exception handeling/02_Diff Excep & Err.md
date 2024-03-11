## **Understanding Exceptions and Errors in Java**

### Daily Flow

- **Normal Flow**
- **Bus Missed** (Exception)
- **Finding Alternative Ways** (Exception Handling)

## Understanding Questions

Let's address some questions:

### 1. Which class is the parent class of all the classes in Java?

**Answer:** `Object` Class

### 2. Which is the parent class of Exception in Java?

**Answer:** `Throwable` Class

## Throwable Class Hierarchy

```plaintext
                +----------------+
                |    Throwable   |
                +----------------+
                        |
         +--------------+--------------+
         |                             |
+----------------+           +----------------+
|   Exception    |           |     Error      |
+----------------+           +----------------+
- Occurs due to               - Occurs due to lack                              
  programmed                    of system resources                   
- Recoverable                 - Non-recoverable
- It has two types:           - Only one type
    - Checked                     - Unchecked/Runtime
    - Unchecked
```

## lets understand the remening subclass of these:-
`Further Hierarchy of Throwable Class`
```plaintext
+----------------+                       +----------------+
|   Exception    |                       |     Error      |
+----------------+                       +----------------+
- ClassNotFound                          - virtualMachineError
- NoSuchMethod                                - StackOverFlowError
- I/O Exception                               - OutOfMemoryErrror
    - EOFException                       - LmRageError
    - FileNotFountException                   - VerifyError
    - InterptedIOException                    - ClassFormatError
- SQLException                                - NoClassDefFoundError
- InteruptedException                    - AsserortionError
- RemoteException
- RunTimeException
    - ArithimiticException
    - ClassCastException
    - NullPOintException
    - IndexOutOfBoundException
        - ArrayIndexOutOfBoundException
        - StringIndexOutOfBoundException
```