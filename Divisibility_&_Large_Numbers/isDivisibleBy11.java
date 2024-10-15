public class isDivisibleBy11 {
    /*
    Let us consider 7694, we can write it as
    7694 = 7*1000 + 6*100 + 9*10 + 4
    The proof is based on below observation:
    Remainder of 10i divided by 11 is 1 if i is even
    Remainder of 10i divided by 11 is -1 if i is odd
    So the powers of 10 only result in values either 1 
    or -1. 
    Remainder of "7*1000 + 6*100 + 9*10 + 4"
    divided by 11 can be written as : 
    7*(-1) + 6*1 + 9*(-1) + 4*1
    The above expression is basically difference 
    between sum of even digits and odd digits.
     */

    static boolean check(String str)
    {
        int n = str.length();
      
        // Compute sum of even and odd digit
        // sums
        int oddDigSum = 0, evenDigSum = 0;
        for (int i=0; i<n; i++)
        {
            // When i is even, position of digit is odd
            if (i%2 == 0)
                evenDigSum += (str.charAt(i)-'0');
            else
                oddDigSum += (str.charAt(i)-'0');
        }
      
        // Check its difference is divisible by 11 or not
        System.out.println(oddDigSum + "-" + evenDigSum);
        return ((evenDigSum - oddDigSum) % 11 == 0);
    }
     
    // main function
    public static void main (String[] args) 
    {
        String str = "76945";
        if(check(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
