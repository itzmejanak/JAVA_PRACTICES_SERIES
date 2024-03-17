package SELF_LEARN.Core_Java.Arrays.Practices;

public class JaggedArray {
    public static void main(String[] args) {
//        int[][] jaggedAry;  // declaring

//        jaggedAry = new int[3][]; // Creation

        // initialization + Creation
//        jaggedAry = new int[][]{{1, 2, 3}, {34, 56}, {1, 3, 4, 5}};

        int[][] jaggedArrays = new int[][]{{1,2,3},{1,3},{5,7,8}};

        for (int i = 0; i < jaggedArrays.length; i++){
            System.out.println("Element next: ");
            for (int j = 0; j < jaggedArrays[i].length; j++){
                System.out.println("elements inside it: "+ jaggedArrays[i][j]);
            }
        }

        for (int[] num: jaggedArrays){
            System.out.println("\nElements next by forEach loop: ");
            for (int element: num){
                System.out.println("Elements inside it by for each loop is: "+ element);
            }
        }
    }
}
