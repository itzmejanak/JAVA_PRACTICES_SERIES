2. **Package Declaration**
   - Declaring packages
   - Importing packages

## Package :-
Package are the collection of classes,   sub-packages , and interface in in java. it helps us to access the created classes into folder from other folder.

**Note:** Inside the package there is stored class or simply package is a folder name and class is the .java extension file name.

- Syntax:-
```java
package Java_Practics;   // Syntax for understanding package. 

public classB{
    public static void main(String[] args){
        // code here
    }
}
```

## Importing  :-
**How to access other package and thats package classes into anouther package ?**

lets say we have two packages and with in the packages we have 1 java file for each package;-
- Janak/User/Java_Practics/ClassA.java
* Janak/User/Java_Practics/ClassB.java

lets access/import ClassA into classB
- Syntax:-
```java
package Java_Practics;
import Janak/User/Java_Practics/ClassA;

public classB{
    public static void main(String[] args){
        ClassA obj = new ClassA();   //here we are accesing the class A and creating its obj
    }
}
```