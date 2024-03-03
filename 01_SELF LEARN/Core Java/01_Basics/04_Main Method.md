4. **Main Method**
   - Structure of the main method`
   - Command-line arguments (`String[] args`)

____________________________________________________________________________________________________
- **Structure of the main method**

   `public :-`
    - it is access modidfiers
    - accesable by jre at run time

    `static :-`
    - to load the class into memory by jvm 
    - static main method alwasys run

    `void :- `
    - it is the return type
    - main method have void return type because it runs the block of code and terminate at last.

    `main :-`
    - JRE find the main method in the class to load into memory if name is !main then program throw exception.

    `String[] args`
    - Command-line arguments received by the main method.


- Additional concept: The main method is the entry point of a Java application, serving as the starting point for execution. It must be `public`, `static`, and named "main". The JVM looks for this specific method signature to start the execution of the program.