
// public class Sum_of_digit {
//     static int sum_of_digit( int n) {
//     // static int sum_of_digit(int rem, int sum, int n) {
//         // if (n == 0) {
//         //     return sum;
//         // }
//         // rem = n % 10;
//         // sum += rem;
//         // return sum_of_digit(rem, sum , n / 10);
//         if(n==0){
//             return 0;
//         }
//         return (n%10)+sum_of_digit(n/10);
//     }

//     public static void main(String[] args) {
//         int rem = 0;
//         int sum = 0;
//         int n = 12345;
//         // int result = sum_of_digit(rem, sum, n);

//         int result=sum_of_digit(n);
//         System.out.println(result);

//     }
// }
