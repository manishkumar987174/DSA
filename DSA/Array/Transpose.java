

public class Transpose {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 }, { 4, 5, 6, 4 }, { 7, 8, 9, 4 } };
        int m = mat.length;
        int n = mat[0].length;
        int[][] transpose = new int[n][m];

    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = mat[j][i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
