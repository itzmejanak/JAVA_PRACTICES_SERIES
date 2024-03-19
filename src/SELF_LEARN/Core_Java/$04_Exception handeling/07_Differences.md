### Difference Between `final`, `finally`, and `finalize`

### final

- **Keyword**
- Used for variables, methods, and classes
- The value of a final variable cannot be changed
- A final method cannot be overridden
- A final class cannot be inherited

### finally

- **Block**
- Used within a try or try-catch block
- Used for cleanup code, such as closing resources
- Executes regardless of whether an exception is thrown

### finalize

- **Method**
- Used for finalization, i.e., cleanup before garbage collection
- Syntax:
  ```java
  protected void finalize() throws Throwable
  ```
- Can be overridden
- Cleanup code can be provided here as well
- Executes just before garbage collection
