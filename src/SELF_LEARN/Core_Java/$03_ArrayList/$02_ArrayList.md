# ArrayList Overview

ArrayList is an implemented class of the ArrayList-based Data Structure, which is present in the `java.util` package.

1. **ArrayList can store different data types or heterogeneous data**.
   
   Example:
   ```java
   ArrayList<Object> mixedList = new ArrayList<>();
   mixedList.add("Hello"); // String
   mixedList.add(123);     // Integer
   mixedList.add(3.14);    // Double
   mixedList.add(true);    // Boolean
   ```

2. **ArrayList can store any number of duplicate values**.
   
   Example:
   ```java
   ArrayList<Integer> numbers = new ArrayList<>();
   numbers.add(5);
   numbers.add(5);  // Adding a duplicate value
   numbers.add(10);
   numbers.add(5);  // Adding another duplicate value
   ```

3. **ArrayList, present in the `java.util` package, can store values of different data types**.
   
   Example:
   ```java
   ArrayList<String> names = new ArrayList<>();
   names.add("Alice");
   names.add("Bob");
   names.add("Charlie");
   ```

4. **ArrayList is a class that implements the List interface**.
   
   Example:
   ```java
   List<Integer> numbers = new ArrayList<>();
   numbers.add(1);
   numbers.add(2);
   numbers.add(3);
   ```

5. **ArrayList follows the insertion order; items are stored in the order they are added**.
   
   Example:
   ```java
   ArrayList<String> colors = new ArrayList<>();
   colors.add("Red");
   colors.add("Blue");
   colors.add("Green");
   ```

6. **ArrayList does not follow the sorting order**.
   
   Example:
   ```java
   ArrayList<Integer> numbers = new ArrayList<>();
   numbers.add(3);
   numbers.add(1);
   numbers.add(2);
   ```

7. **ArrayList is created on the basis of a growable or resizable array**.
   
   Example:
   ```java
   ArrayList<String> countries = new ArrayList<>();
   countries.add("USA");
   countries.add("UK");
   countries.add("Canada");
   ```

**Note:** ArrayLists are non-synchronized.