## 1D Array

### Declaration

- Different types of declaration / with valid declaration:
  - `int[] a;`  // valid
  - `int b[];`
  - `int[]b;`

- Declaration of array and variable at the same time:
  - `int a[], b;`

### Creation

- `a = new int[3];`  // providing size for declared array

### Declaration + Creation

- `int[] a = new int[3];`  // at the same time

- Can we set the size of the array to 0? [Yes]
- Can we set the size of the array to negative? [No] // runtime exception rather than compile time
- If size not provided // we get an error at compile time

### Initialization

- When the array is created, it initializes the default value which is `null`.
- Adding custom value: `a[0] = 10;` // like this

### Declaration + Creation + Initialization

- `int[] a = {10, 2, 9, 7, 5, 4};` // without a fixed size or,
- `int[] a = new int[]{10, 2, 9, 7, 5, 4};`

### Retrieve

Using for loop:

```java
for(int i = 0; i <= 3; i++){
    System.out.println(a[i]);
}
```

Using for-each loop:

```java
for(int i: a){
    System.out.println(i);
}
```