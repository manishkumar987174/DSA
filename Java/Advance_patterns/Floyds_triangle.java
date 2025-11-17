public class Floyds_triangle{
    public static void floyds(int rows){
        int counter=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.err.print(counter+" ");
                    counter++;
            }
            System.err.println("");
        }
    }
    public static void main(String[] args) {
        floyds(5);
        
    }
}