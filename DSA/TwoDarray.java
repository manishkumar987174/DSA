// package Array;

import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        // int [][]arr={{1,2,3},{4,5,6}};
        // for(int [] ele:arr){
        // for(int i:ele){
        // System.out.print(i);
        // }
        // System.out.println();
        // }

        int[][] Students = new int[4][2];
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter Stdent roll-no-");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                Students[i][j] = sc.nextInt();
                if(j%2==0){
                    System.out.println("Enter Stdent marks:-");
                }
            }
                System.out.println("Enter Stdent roll-no-");
        }
        System.out.println("Roll_no   Marks:");
        for (int[] ele : Students) {
            for (int i : ele) {
                System.out.print(i + "          ");
            }
            System.out.println();
        }
        sc.close();
    }

}
