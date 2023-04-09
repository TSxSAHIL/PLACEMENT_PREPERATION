import java.util.*;

public class Q1D1{
    //Brute Force Approach
    // static void markRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i) {
    //     // set all non-zero elements as -1 in the row i:
    //     for (int j = 0; j < m; j++) {
    //         if (matrix.get(i).get(j) != 0) {
    //             matrix.get(i).set(j, -1);
    //         }
    //     }
    // }

    // static void markCol(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j) {
    //     // set all non-zero elements as -1 in the col j:
    //     for (int i = 0; i < n; i++) {
    //         if (matrix.get(i).get(j) != 0) {
    //             matrix.get(i).set(j, -1);
    //         }
    //     }
    // }

    // static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
    //     // Set -1 for rows and cols that contains 0. Don't mark any 0 as -1:
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             if (matrix.get(i).get(j) == 0) {
    //                 markRow(matrix, n, m, i);
    //                 markCol(matrix, n, m, j);
    //             }
    //         }
    //     }
    //     // Finally, mark all -1 as 0:
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             if (matrix.get(i).get(j) == -1) {
    //                 matrix.get(i).set(j, 0);
    //             }
    //         }
    //     }
    //     return matrix;
    // }

    // public static void main(String[] args) {
    //     ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    //     matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
    //     matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
    //     matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

    //     int n = matrix.size();
    //     int m = matrix.get(0).size();

    //     ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

    //     System.out.println("The Final matrix is: ");
    //     for (ArrayList<Integer> row : ans) {
    //         for (Integer ele : row) {
    //             System.out.print(ele + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    //Better Approach Using two Arrays
    
}