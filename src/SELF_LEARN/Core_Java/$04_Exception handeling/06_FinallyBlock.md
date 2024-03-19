### Finally Block in Java with Complete Example | Use of Finally Block

#### Finally Block

The finally block in Java is a section of code that always executes, regardless of whether an exception occurs or not.

**Syntax:**

```javascript
try {
    // Risky code
} catch(Exception e) {
    // Handling code
} finally {
    // Cleanup code
}
```

- Each block (`try`, `catch`, `finally`) will execute sequentially, but the `finally` block always executes.
---
### Use of Finally Block

**The primary purpose of the `finally` block is to execute cleanup code, such as:**
- Closing connections
- Closing files
- Releasing memory
- Releasing logs

**Note**: We can use try-catch blocks inside the `finally` block instead of using `throws`, providing a comprehensive error handling mechanism.

The `finally` block ensures that critical resources are properly released, making it an essential component of robust exception handling in Java.