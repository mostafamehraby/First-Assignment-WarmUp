import java.util.Scanner;

public class Exercises {

    /*
        complete this function to check if the input number is prime or not
     */
    public boolean isPrime(long n) {
        int i;
        int m = 0;
        int flag = 0;
        System.out.println("Enter your number : ");
        Scanner scanner = new Scanner(System.in);
        byte number = scanner.nextByte();
        i = 2;
        m = number / 2 ;
        if(number == 0 || number == 1){
            System.out.println("it is not prime.");
        }
        else{
             while (i <= m) {
                if (number % i == 0) {
                    System.out.println("it is not prime.");
                    flag = 1;
                    break; 
                }
                i++;
             }
             if (flag == 0) {
                System.out.println("it is prime.");
             }
        }
        return false;
    }

    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
     */
    public long fibonacciIndex(long n) {
        int number;
        System.out.print("enter your number : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextLong();
        if(n < 0){
            return -1 ;  // اعدادی که منفی هستند در دنباله ی فیبوناچی وجود ندارند
        }
        int a = 0 ;
        int b = 1;
        int index = 0 ;
        while (b < n) {
            int temp = b ;
            b = a + b ;
            a = temp ;
            index++ ;
        }
        return b == n ? index : -1 ;
    }

    /*
        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!
     */
    public static char[][] generateTriangle(int n) {
        if (n <= 0) {
            return new char[0][0] ;
        }
        char [][] triangle = new char[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if (j <= i) {
                    triangle[i][j] = '*';
                }
                else{
                    triangle[i][j] = ' ';
                }
            }
        }
        return triangle ;
    }
    public static void printTriangle(char[][]triangle) {
        for(char[] row : triangle){
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // you can test your code here, but then it should be checked with test cases
        // start testing 
        System.out.print("enter your number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        char[][] trianglenumber = generateTriangle(number);
        printTriangle(trianglenumber);
    }
}
