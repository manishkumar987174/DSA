
public class AddTwodMat {
    public static void main(String[] args) {

        int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] mat2 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] result = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];

            }
        }

        for (int k = 0; k < 2; k++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[k][j]+"   ");

            }
            System.out.println();
        }
    }

}
