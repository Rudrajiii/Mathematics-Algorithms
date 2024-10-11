//statement - Given a number, the task is that we divide number by 3. The input number may be large and it may not be possible to store even if we use long long int.

//Since input number may be very large, we cannot use n % 3 to check if a number is divisible by 3 or not, especially in languages like C/C++. The idea is based on following fact.

//Approach - A number is divisible by 3 if sum of its digits is divisible by 3.

/*
 * How does this work? 
 * Let us consider 1332, we can write it as
 * 1332 = 1*1000 + 3*100 + 3*10 + 2
 * The proof is based on below observation:
 * Remainder of 10i divided by 3 is 1
 * So powers of 10 only result in value 1.
 * Remainder of 10i divided by 3 is 1
 * So powers of 10 only result in value 1.
 * Remainder of "1*1000 + 3*100 + 3*10 + 2"
 * divided by 3 can be written as : 
 * 1*1 + 3*1 + 3*1 + 2 = 9
 * The above expression is basically sum of
 * all digits.
 * Since 9 is divisible by 3, answer is yes.
 */

class divisible_by_3_or_not{

    static boolean check(String str){
        // Compute sum of digits
        int n = str.length();
        int digitSum = 0;
        for (int i=0; i<n; i++)
            digitSum += (str.charAt(i)-'0');
        // Check if sum of digits is 
        // divisible by 3.
        return (digitSum % 3 == 0);
    }
    // main function
    public static void main (String[] args) 
    {
        String str = "1332";
        if(check(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}