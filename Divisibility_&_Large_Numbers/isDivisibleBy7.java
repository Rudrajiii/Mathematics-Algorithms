public class isDivisibleBy7 {
    /* 
    * Deep Thought Process 
    */
    /*
    ? Given a number N, the task is to check if it is divisible by 7 or not.
    todo Note: You are not allowed to use the modulo operator, floating point arithmetic is also not allowed. 

    Naive approach: A simple method is repeated subtraction. Following is another interesting method.
    Divisibility by 7 can be checked by a recursive method. A number of the form 10a + b is divisible by 7 if and only if a – 2b is divisible by 7. In other words, subtract twice the last digit from the number formed by the remaining digits. Continue to do this until a small number. 

    * Example: the number 371: 37 – (2×1) = 37 – 2 = 35; 3 – (2 × 5) = 3 – 10 = -7; thus, since -7 is divisible by 7, 371 is divisible by 7. 
     */

    static boolean DivisibleBy7 (int n){
        if(n < 0){
            return DivisibleBy7(-1 * n);
        }
        if(n == 0 || n == 7){
            return true;
        }
        if(n < 10){
            return false;
        }
        // DivisibleBy7(num / 10 - 2 * ( num - num / 10 * 10 ) ))
        return DivisibleBy7(n / 10 - 2 * ( n % 10 ));
    }
                        // 616 / 10 = 61 - (616 - 610) = 55
                        // 55 / 10 = 5 - (55 - 50) = 0


    public static void main (String[] args) 
    {
        int num = 616;
        if(DivisibleBy7(num))
            System.out.println("Divisible");
        else
            System.out.println("Not Divisible");
    }
}
