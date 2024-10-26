public class isDivisibleBy29 {
    static boolean check(long n){

        /*
        * A quick solution to check if a number is divisible by 29 or not is to add 3 times of last digit to rest number and repeat this process until number comes 2 digit. The given number is divisible by 29 if the obtained two digit number is divisible by 29.
        * Number is 348, 
        * Three times of last digit + Rest of the number = 8*3 + 34 = 58
        * Since 58 is divisible by 29, 348 is also divisible by 29. 
         */

        while( n / 100 > 0){
            int last_digit = (int) n % 10;
            n /= 10;
            n += last_digit * 3;
        }
        return n % 29 == 0; 
    }
    public static void main(String[] args) {
        long n = 348;
        if(check(n))
            System.out.println("yes");
        else 
            System.out.println("No");
    } 
}
