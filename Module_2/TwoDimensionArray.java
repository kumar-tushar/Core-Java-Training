package Module_2;

import java.util.Arrays;

public class TwoDimensionArray {

    public static void main(String[] args) {

        int[][] myFirst2DArray={ {  3,  5,  1, 9 },
                                 { 10, 15,  3, 0 },
                                 {  1, 11, 31, 90 },
                                 {  2, 51,  1, 9 } };

        System.out.println();

        for (int[] row : myFirst2DArray) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}
