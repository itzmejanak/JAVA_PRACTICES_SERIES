### Methods to Print Exception Information in Java

Let's understand first:

- **Exception Name**
    - Exception name refers to the class of exception that occurred.
---
- **Description**
    - Description provides details about the related exception class.
---
- **StackTrace**
    - StackTrace indicates the number of lines from where the exception occurred.
---
## Exception Methods 
#### `stackTrace()`

- Displays exception name and description along with stack trace.
- it is used most of the time.

#### `toString()`

- Does not print stack trace.
- it only prints exception name and description.

#### `getMessage()`

- Prints only the description of the exception, 
- without including stack trace or the exception name.
