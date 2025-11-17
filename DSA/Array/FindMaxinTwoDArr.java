
public class FindMaxinTwoDArr {
    public static void main(String[] args) {
        int [][] numbers={{222,3,4,35},{23,56,7777,999}};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                max=Math.max(max,numbers[i][j]);
            }
        }
        System.out.println(max);
    }
}
