public class SetMatrixToZeroes {
    // method-1

//    class Solution {
//     public void setZeroes(int[][] arr) {
//         int m = arr.length;
//         int n = arr[0].length;
//         int [][]copy=new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 copy[i][j]=arr[i][j];
//             }
//         }
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (copy[i][j] == 0) {
//                     for (int k = 0; k < n; k++) {
//                         arr[i][k] = 0;
                        
//                     }
//                     for(int l=0;l<m;l++){
//                         arr[l][j]=0;
//                     }
//                 }
//             }
//         }
//     }
// }
// method -2*******************************************************************************8
// class Solution {
//     public void setZeroes(int[][] arr) {
//         int m = arr.length;
//         int n = arr[0].length;
//         boolean[] row = new boolean[m];
//         boolean[] col = new boolean[n];
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (arr[i][j] == 0) {
//                     row[i] = true;
//                     col[j] = true;
//                 }
//             }
//         }
//         for (int i = 0; i < m; i++) {
//             if (row[i] == true) {
//                 for (int j = 0; j < n; j++) {
//                     arr[i][j] = 0;
//                 }
//             }

//         }
//         for (int j = 0; j < n; j++) {
//             if (col[j] == true) {
//                 for (int i = 0; i < m; i++) {
//                     arr[i][j] = 0;
//                 }
//             }
//         }
//     }
// }

// method-3*****************************************************************************8

// class Solution {
//     public void setZeroes(int[][] arr) {
//         int m = arr.length;
//         int n = arr[0].length;
//         boolean zeroRow = false;
//         boolean zeroCol = false;
//         for (int j = 0; j < n; j++) {
//             if (arr[0][j] == 0) {
//                 zeroRow = true;
//                 break;
//             }
//         }

//         for (int i = 0; i < m; i++) {
//             if (arr[i][0] == 0) {
//                 zeroCol = true;
//                 break;
//             }
//         }

//         for (int i = 1; i < m; i++) {
//             for (int j = 1; j < n; j++) {
//                 if (arr[i][j] == 0) {
//                     arr[i][0] = 0;
//                     arr[0][j] = 0;
//                 }
//             }
//         }
//         for (int j = 1; j < n; j++) {
//             if (arr[0][j] == 0) {
//                 for (int i = 1; i < m; i++) {
//                     arr[i][j] = 0;
//                 }
//             }
//         }
//         for (int i = 1; i < m; i++) {
//             if (arr[i][0] == 0) {
//                 for (int j = 1; j < n; j++) {
//                     arr[i][j] = 0;
//                 }
//             }
//         }
//         if (zeroRow == true) {
//             for (int j = 0; j < n; j++) {
//                 arr[0][j] = 0;
//             }
//         }
//         if (zeroCol == true) {
//             for (int i = 0; i < m; i++) {
//                 arr[i][0] = 0;
//             }
//         }
//     }
// }
    public static void main(String[] args) {

    }
}
