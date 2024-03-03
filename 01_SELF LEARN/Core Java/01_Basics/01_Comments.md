1. **Comments**
   - Single-line comments
     ```java
     public class SingleLine {
         public static void main(String[] args){
             
             // this is the single line comments in java
             
             String name  = "janak";
             // int rollNo = 17;           // single line comment
             
         }
     }
     ```
   - Multi-line comments
   ```java
     public class SingleLine {
         public static void main(String[] args){
             
             /* this is the multi 
             line comments in java */
              
             String name  = "janak";
             /* int rollNo = 17;           multi line comment */
             
         }
     }
     ```
   - Javadoc comments
```java
    /**
    * Calculates the sum of two integers.
    * 
    * @param a the first integer
    * @param b the second integer
    * @return the sum of the two integers
    */
    public class SingleLine {

        public static void main(String[] args){
            // empty
    }
    
        public int calculateSum(int a, int b) {
            return a + b;
    }
}
```