# Understanding Checked and Unchecked Exceptions

### Definitions

- **Checked Exceptions**:
    - Checked exceptions are exceptions that the Java compiler requires you to handle or declare.
    - They occur at compile-time and represent conditions that a well-behaved application should anticipate and recover from.
    - Examples include `IOException`, `SQLException`, etc.

- **Unchecked Exceptions**:
    - Unchecked exceptions are exceptions that occur at runtime and are not checked at compile time.
    - They typically represent programming errors such as `NullPointerException`, `ArrayIndexOutOfBoundsException`, etc.

### Key Points

- **Occurrence**:
    - Checked exceptions occur at compile-time.
    - Unchecked exceptions occur at runtime.

- **Handling Requirement**:
    - Checked exceptions must be handled using a `try-catch` block or declared in the method signature.
    - Unchecked exceptions are not required to be handled explicitly.

- **Nature**:
    - Checked exceptions represent anticipated conditions that should be handled.
    - Unchecked exceptions represent programming errors or exceptional conditions.

## Note

- Both checked and unchecked exceptions occur at runtime.
- Checked exceptions are those that can be checked by the compiler, occurring at compile time.
- Unchecked exceptions are those that cannot be checked by the compiler and occur at runtime.

