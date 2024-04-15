package com.esertopcu.exercises;

public class MatrixElementsSum {

    public static void main(String[] args) {

        /*
         * After becoming famous, the CodeBots decided to move into a new building together. Each of the rooms has a different cost, and some of them are free,
         * but there's a rumour that all the free rooms are haunted! Since the CodeBots are quite superstitious,
         * they refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.
         * Given matrix, a rectangular matrix of integers, where each value represents the cost of the room,
         * your task is to return the total sum of all rooms that are suitable for the CodeBots (ie: add up all the values that don't appear below a 0).
         * */

        int[][] matrix = {
                {0, 1, 1, 0},
                {0, 5, 0, 1},
                {2, 0, 3, 3}
        };
        System.out.println(matrixElementsSum(matrix));
    }

    private static int matrixElementsSum(int[][] matrix) {
        int totalSum = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] hauntedColumns = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!hauntedColumns[j]) {
                    if (matrix[i][j] == 0) {
                        hauntedColumns[j] = true;
                    } else {
                        totalSum += matrix[i][j];
                    }
                }
            }
        }

        return totalSum;
    }
}
