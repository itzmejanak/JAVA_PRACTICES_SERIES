## 2D Array

- Arrays of arrays
- Each block represents a collection of arrays

### Declaration

Different types of declaration with the valid one:
- `int[][] a;` // valid
- `int [] []a;`
- `int a[][];`
- `int[] a[];`

With two variables:
- `int[] a, b;` // both are 1D arrays
- `int a[], b;` // a is an array, b is a variable
- `int [][] a, b;` // both are 2D arrays
- `int[] a[], b;` // a is 2D, b is 1D
- `int[] a[] , b[];` // both are 2D
- `int[][] a, b[];` // a is 2D, b is 3D
- `int[][] a,[]b;` // a is 2D, but b makes compile-time error, we can't write '[]' before the variable

### Creation

- `a = new int[3][3];`
  - First [] is for rows and the second one for columns
- If rows = columns, it is called a matrix array
- Jagged array = which hasn't a fixed number of columns
  - `a[0] = new int[3];`
  - `a[1] = new int[2];`

### Initialization

- When an array is created, it initializes to default values, which for integers are 0.
- Custom initialization:
  - `int[][] a = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };` // 3x3 matrix
  - `int[][] b = new int[][] { {1, 2}, {3, 4, 5}, {6} };` // jagged array

### Retrieve

Using nested loops:

```java
for(int i = 0; i < a.length; i++) {
    for(int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
    }
    System.out.println();
}
```

This nested loop iterates over each element in the 2D array and prints it out.

Using for-each loop:

```java
for(int[] row: a) {
    for(int num: row) {
        System.out.print(num + " ");
    }
    System.out.println();
}
```