/*
 * Copyright (c)  2023 by Sanidhya Varshney
 */

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) return mat;

        int[][] arr = new int[r][c];
        int k = 0, l = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                arr[k][l] = mat[i][j];
                l++;
                if (l == c) {
                    l = 0;
                    k++;
                }
            }
        }

        return arr;
    }
}
